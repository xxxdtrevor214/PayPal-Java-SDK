package com.paypal.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;

import com.paypal.base.exception.ClientActionRequiredException;
import com.paypal.base.exception.HttpErrorException;
import com.paypal.base.exception.InvalidResponseDataException;
import com.paypal.base.exception.SSLConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base HttpConnection class
 * 
 */
public abstract class HttpConnection {

	private static final Logger log = LoggerFactory.getLogger(HttpConnection.class);

	/**
	 * Subclasses must set the http configuration in the
	 * createAndconfigureHttpConnection() method.
	 */
	protected HttpConfiguration config;

	/**
	 * Subclasses must create and set the connection in the
	 * createAndconfigureHttpConnection() method.
	 */
	protected HttpURLConnection connection;

	public HttpConnection() {

	}

	/**
	 * Executes HTTP request
	 * 
	 * @param url
	 * @param payload
	 * @param headers
	 * @return String response
	 * @throws InvalidResponseDataException
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws HttpErrorException
	 * @throws ClientActionRequiredException
	 */
	public String execute(String url, String payload,
			Map<String, String> headers) throws InvalidResponseDataException,
			IOException, InterruptedException, HttpErrorException,
			ClientActionRequiredException {
		
		BufferedReader reader = null;
		String successResponse = Constants.EMPTY_STRING;
		InputStream result = executeWithStream(url, payload, headers);
		reader = new BufferedReader(new InputStreamReader(result, Constants.ENCODING_FORMAT));
		successResponse = read(reader);
		
		return successResponse;
	}
	
	/**
	 * Executes HTTP request
	 * 
	 * @param url
	 * @param payload
	 * @param headers
	 * @return String response
	 * @throws InvalidResponseDataException
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws HttpErrorException
	 * @throws ClientActionRequiredException
	 */
	public InputStream executeWithStream(String url, String payload,
			Map<String, String> headers) throws InvalidResponseDataException,
			IOException, InterruptedException, HttpErrorException,
			ClientActionRequiredException {
		InputStream successResponse = null;
		String errorResponse = Constants.EMPTY_STRING;
		int responsecode = -1;
		BufferedReader reader = null;
		OutputStreamWriter writer = null;
		connection.setRequestProperty("Content-Length", ""
				+ payload.trim().length());
		if (headers != null) {
			log.debug("curl command: ");
			log.debug("curl -v '" + connection.getURL().toString() + "' \\");
			setHttpHeaders(headers);
			Iterator<String> keyIter = headers.keySet().iterator();
			while (keyIter.hasNext()) {
				String key = keyIter.next();
				String value = headers.get(key);
				log.debug("-H \"" + key + ": " + value + "\" \\");
			}
			log.debug("-d '" + payload + "'");
		}
		try {
			// This exception is used to make final log more explicit
			Exception lastException = null;
			int retry = 0;
			retryLoop:
			do {
				try {
					if ("POST".equalsIgnoreCase(connection.getRequestMethod())
							||"PUT".equalsIgnoreCase(connection.getRequestMethod())
							||"PATCH".equalsIgnoreCase(connection.getRequestMethod())) {
						writer = new OutputStreamWriter(
								this.connection.getOutputStream(),
								Charset.forName(Constants.ENCODING_FORMAT));
						writer.write(payload);
						writer.flush();
					}
					responsecode = connection.getResponseCode();
					if (responsecode >= 200 && responsecode < 300) {
						successResponse = connection.getInputStream();
						break retryLoop;
					} else if (responsecode >= 300 && responsecode < 500) {
						successResponse = connection.getInputStream();
						throw new ClientActionRequiredException(
								"Response Code : " + responsecode
										+ " see PayPalResource.LASTRESPONSE for details.");
					} else if (responsecode >= 500) {
						throw new IOException(
								"Response Code : " + responsecode);
					}
				} catch (IOException e) {
					lastException = e;
					try {
						responsecode = connection.getResponseCode();
						if (connection.getErrorStream() != null) {
							reader = new BufferedReader(new InputStreamReader(
									connection.getErrorStream(),
									Constants.ENCODING_FORMAT));
							errorResponse = read(reader);
							log.error("Error code : " + responsecode
											+ " with response : " + errorResponse);
						}
						if ((errorResponse == null)
								|| (errorResponse.length() == 0)) {
							errorResponse = e.getMessage();
						}
						if (responsecode <= 500) {
							throw new HttpErrorException(responsecode,
									errorResponse,
									"Error code : "
									+ responsecode + " with response : "
									+ errorResponse, e);
						}
					} catch (HttpErrorException ex) {
						throw ex;
					} catch (Exception ex) {
						lastException = ex;
						log.error("Caught exception while handling error response", ex);
					}
				}
				retry++;
				if (retry > 0) {
					log.error(" Retry  No : " + retry + "...");
					Thread.sleep(this.config.getRetryDelay());
				}
			} while (retry < this.config.getMaxRetry());
			if (successResponse == null || ( successResponse.available() <= 0 && !(responsecode >= 200 && responsecode < 300))) {
				throw new HttpErrorException("retry fails..  check log for more information", lastException);
			}
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.close();
				}
			} finally {
				reader = null;
				writer = null;
			}
		}
		return successResponse;
	}

	/**
	 * Set ssl parameters for client authentication
	 * 
	 * @param certPath
	 * @param certKey
	 * @throws SSLConfigurationException
	 */
	public abstract void setupClientSSL(String certPath, String certKey)
			throws SSLConfigurationException;

	/**
	 * create and configure HttpsURLConnection object
	 * 
	 * @param clientConfiguration
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public abstract void createAndconfigureHttpConnection(
			HttpConfiguration clientConfiguration) throws IOException;

	protected String read(BufferedReader reader) throws IOException {
		String inputLine = Constants.EMPTY_STRING;
		StringBuilder response = new StringBuilder();
		while ((inputLine = reader.readLine()) != null) {
			response.append(inputLine);
		}
		return response.toString();
	}

	/**
	 * Set headers for HttpsURLConnection object
	 * 
	 * @param headers
	 */
	protected void setHttpHeaders(Map<String, String> headers) {
		Iterator<Map.Entry<String, String>> itr = headers.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, String> pairs = itr.next();
			String key = pairs.getKey();
			String value = pairs.getValue();
			this.connection.setRequestProperty(key, value);
		}
	}

}
