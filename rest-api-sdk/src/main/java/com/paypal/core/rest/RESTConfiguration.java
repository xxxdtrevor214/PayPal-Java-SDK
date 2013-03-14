package com.paypal.core.rest;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.paypal.core.ConfigManager;
import com.paypal.core.Constants;
import com.paypal.core.HttpConfiguration;

/**
 * RESTConfiguration helps {@link PayPalResource} with state dependent utility
 * methods
 */
public class RESTConfiguration {

	/**
	 * Java Version and bit header computed during construction
	 */
	private static final String JAVAHEADER;

	/**
	 * OS Version and bit header computed during construction
	 */
	private static final String OSHEADER;

	static {

		// Java Version computed statically
		StringBuilder javaVersion = new StringBuilder("lang=Java");
		if (System.getProperty("java.version") != null
				&& System.getProperty("java.version").length() > 0) {
			javaVersion.append(";v=")
					.append(System.getProperty("java.version"));
		}
		if (System.getProperty("java.vm.name") != null
				&& System.getProperty("java.vm.name").length() > 0) {
			javaVersion.append(";bit=");
			if (System.getProperty("java.vm.name").contains("Client")) {
				javaVersion.append("32");
			} else {
				javaVersion.append("64");
			}
		}
		JAVAHEADER = javaVersion.toString();

		// OS Version Header
		StringBuilder osVersion = new StringBuilder();
		if (System.getProperty("os.name") != null
				&& System.getProperty("os.name").length() > 0) {
			osVersion.append("os=");
			osVersion.append(System.getProperty("os.name").replace(' ', '_'));
		} else {
			osVersion.append("os=");
		}
		if (System.getProperty("os.version") != null
				&& System.getProperty("os.version").length() > 0) {
			osVersion.append(" "
					+ System.getProperty("os.version").replace(' ', '_'));
		}
		OSHEADER = osVersion.toString();
	}

	/**
	 * Base URL for the service
	 */
	private URL url;

	/**
	 * Authorization token
	 */
	private String authorizationToken;

	/**
	 * {@link HttpMethod}
	 */
	private HttpMethod httpMethod;

	/**
	 * Resource URI as defined in the WSDL
	 */
	private String resourcePath;

	/**
	 * Request Id
	 */
	private String requestId;

	/**
	 * Default Constructor
	 */
	public RESTConfiguration() {

	}

	/**
	 * @param authorizationToken
	 *            the authorizationToken to set
	 */
	public void setAuthorizationToken(String authorizationToken) {
		this.authorizationToken = authorizationToken;
	}

	/**
	 * @param httpMethod
	 *            the httpMethod to set
	 */
	public void setHttpMethod(HttpMethod httpMethod) {
		this.httpMethod = httpMethod;
	}

	/**
	 * @param resourcePath
	 *            the resourcePath to set
	 */
	public void setResourcePath(String resourcePath) {
		this.resourcePath = resourcePath;
	}

	/**
	 * @param requestId
	 *            the requestId to set
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	/**
	 * Returns HTTP headers as a {@link Map}
	 * 
	 * @return {@link Map} of Http headers
	 */
	public Map<String, String> getHeaders() {
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Authorization", authorizationToken);
		headers.put("User-Agent", formUserAgentHeader());
		if (requestId != null && requestId.length() > 0) {
			headers.put("PayPal-Request-Id", requestId);
		}
		return headers;
	}

	/**
	 * Returns a {@link HttpConfiguration} based on configuration
	 * 
	 * @return {@link HttpConfiguration}
	 * @throws MalformedURLException
	 * @throws URISyntaxException
	 */
	public HttpConfiguration getHttpConfigurations()
			throws MalformedURLException, URISyntaxException {
		ConfigManager config = ConfigManager.getInstance();
		HttpConfiguration httpConfiguration = new HttpConfiguration();
		httpConfiguration.setHttpMethod(httpMethod.toString());
		httpConfiguration.setEndPointUrl(getBaseURL().toURI()
				.resolve(resourcePath).toString());
		httpConfiguration.setContentType("application/json");
		httpConfiguration.setGoogleAppEngine(Boolean.parseBoolean(config
				.getValue(Constants.GOOGLE_APP_ENGINE)));
		if (Boolean.parseBoolean(config.getValue(Constants.USE_HTTP_PROXY))) {
			httpConfiguration.setProxyPort(Integer.parseInt(config
					.getValue(Constants.HTTP_PROXY_PORT)));
			httpConfiguration.setProxyHost(config
					.getValue(Constants.HTTP_PROXY_HOST));
			httpConfiguration.setProxyUserName(config
					.getValue(Constants.HTTP_PROXY_USERNAME));
			httpConfiguration.setProxyPassword(config
					.getValue(Constants.HTTP_PROXY_PASSWORD));
		}
		httpConfiguration.setConnectionTimeout(Integer.parseInt(config
				.getValue(Constants.HTTP_CONNECTION_TIMEOUT)));
		httpConfiguration.setMaxRetry(Integer.parseInt(config
				.getValue(Constants.HTTP_CONNECTION_RETRY)));
		httpConfiguration.setReadTimeout(Integer.parseInt(config
				.getValue(Constants.HTTP_CONNECTION_READ_TIMEOUT)));
		httpConfiguration.setMaxHttpConnection(Integer.parseInt(config
				.getValue(Constants.HTTP_CONNECTION_MAX_CONNECTION)));
		httpConfiguration.setIpAddress(config
				.getValue(Constants.DEVICE_IP_ADDRESS));
		return httpConfiguration;
	}

	/**
	 * Returns the base URL configured in application resources
	 * 
	 * @return Base {@link URL}
	 * @throws MalformedURLException
	 */
	public URL getBaseURL() throws MalformedURLException {
		if (url == null) {
			String urlString = ConfigManager.getInstance().getValue(
					"service.EndPoint");
			if (!urlString.endsWith("/")) {
				urlString += "/";
			}
			url = new URL(urlString);
		}
		return url;
	}

	/**
	 * @param urlString
	 *            the url to set
	 */
	public void setUrl(String urlString) throws MalformedURLException {
		if (urlString != null && urlString.length() > 0) {
			if (!urlString.endsWith("/")) {
				urlString += "/";
			}
			this.url = new URL(urlString);
		} else {
			this.url = getBaseURL();
		}
	}

	/*
	 * Form User-Agent HTTP header
	 */
	private String formUserAgentHeader() {
		String header = null;
		StringBuilder stringBuilder = new StringBuilder("PayPalSDK/"
				+ PayPalResource.SDK_ID + " " + PayPalResource.SDK_VERSION
				+ " ");
		stringBuilder.append("(").append(JAVAHEADER);
		String osVersion = OSHEADER;
		if (osVersion.length() > 0) {
			stringBuilder.append(";").append(osVersion);
		}
		stringBuilder.append(")");
		header = stringBuilder.toString();
		return header;
	}

}
