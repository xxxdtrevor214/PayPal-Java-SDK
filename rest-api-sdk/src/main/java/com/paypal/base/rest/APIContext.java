package com.paypal.base.rest;

import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.UUID;

import com.paypal.base.Constants;
import com.paypal.base.SDKVersion;

/**
 * <code>APIContext</code> wraps wire-level parameters for the API call.
 * AccessToken, which is essentially an OAuth token, is treated as a mandatory
 * parameter for (PayPal REST APIs). RequestId is generated if not supplied for
 * marking Idempotency of the API call. OAuth token can be generated using
 * {@link OAuthTokenCredential}. The Application Header property may be used by
 * clients to access application level headers. The clients are responsible to
 * cast the Application Header property to appropriate type.
 * 
 * @author kjayakumar
 * 
 */
public class APIContext {

	/**
	 * Request Id
	 */
	private String requestId;

	/**
	 * Parameter to mask RequestId
	 */
	private boolean maskRequestId;

	/**
	 * {@link SDKVersion} instance
	 */
	private SDKVersion sdkVersion;

	/**
	 * {@link OAuthTokenCredential} credential instance
	 */
	private OAuthTokenCredential credential;

	/**
	 * Default Constructor
	 */
	public APIContext() {
		super();
		this.credential = new OAuthTokenCredential(null);
	}

	/**
	 * Pass the clientID, secret and mode. The easiest, and most widely used
	 * option.
	 * 
	 * @param clientID
	 * @param clientSecret
	 * @param mode
	 */
	public APIContext(String clientID, String clientSecret, String mode) {
		this(clientID, clientSecret, mode, null);
	}

	/**
	 * Pass the clientID, secret and mode along with additional configurations.
	 * 
	 * @param clientID
	 * @param clientSecret
	 * @param mode
	 * @param configurations
	 */
	public APIContext(String clientID, String clientSecret, String mode, Map<String, String> configurations) {
		if (mode == null || !(mode.equals(Constants.LIVE) || mode.equals(Constants.SANDBOX))) {
			throw new IllegalArgumentException("Mode needs to be either `sandbox` or `live`.");
		}

		this.credential = new OAuthTokenCredential(clientID, clientSecret);
		if (configurations != null && configurations.size() > 0) {
			this.credential.addConfigurations(configurations);
		}
		this.credential.addConfiguration(Constants.MODE, mode);
	}

	/**
	 * Constructor that takes in the property file as the input.
	 * 
	 * @param configurationFile
	 * @throws PayPalRESTException
	 */
	public APIContext(File configurationFile) throws PayPalRESTException {
		super();
		this.credential = PayPalResource.initConfig(configurationFile);
		this.addConfigurations(PayPalResource.getConfigurations());
	}

	/**
	 * Constructor that takes in the input stream of configurations
	 * 
	 * @param configurations
	 * @throws PayPalRESTException
	 */
	public APIContext(InputStream configurations) throws PayPalRESTException {
		super();
		this.credential = PayPalResource.initConfig(configurations);
		this.addConfigurations(PayPalResource.getConfigurations());
	}

	/**
	 * APIContext, requestId is auto generated, calling setMaskRequestId(true)
	 * will override the requestId getter to return null
	 * 
	 * @param accessToken
	 *            OAuthToken required for the call. OAuth token used by the REST
	 *            API service. The token should be of the form 'Bearer xxxx..'.
	 *            See {@link OAuthTokenCredential} to generate OAuthToken
	 */
	public APIContext(String accessToken) {
		super();
		if (accessToken == null || accessToken.length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null");
		}
		this.credential = new OAuthTokenCredential(accessToken);
	}

	/**
	 * APIContext
	 * 
	 * @param accessToken
	 *            OAuthToken required for the call. OAuth token used by the REST
	 *            API service. The token should be of the form 'Bearer xxxx..'.
	 *            See {@link OAuthTokenCredential} to generate OAuthToken
	 * @param requestId
	 *            Unique requestId required for the call. Idempotency id,
	 *            Calling setMaskRequestId(true) will override the requestId
	 *            getter to return null, which can be used by the client (null
	 *            check) to forcibly not sent requestId in the API call.
	 */
	public APIContext(String accessToken, String requestId) {
		this(accessToken);
		if (requestId == null || requestId.length() <= 0) {
			throw new IllegalArgumentException("RequestId cannot be null");
		}
		this.requestId = requestId;
	}

	public APIContext setRefreshToken(String refreshToken) {
		if (this.credential != null && this.credential.hasCredentials()) {
			this.credential.setRefreshToken(refreshToken);
		} else {
			throw new IllegalArgumentException(
					"ClientID and Secret are required. Please use APIContext(String clientID, String clientSecret, String mode)");
		}
		return this;
	}

	/**
	 * Returns HTTP Headers.
	 * 
	 * @return the hTTPHeaders
	 */
	public Map<String, String> getHTTPHeaders() {
		return this.credential.getHeaders();
	}

	/**
	 * Replaces existing headers with provided one.
	 * 
	 * @param httpHeaders
	 *            the httpHeaders to set
	 */
	public APIContext setHTTPHeaders(Map<String, String> httpHeaders) {
		this.credential.setHeaders(httpHeaders);
		return this;
	}

	/**
	 * Adds HTTP Headers to existing list
	 * 
	 * @param httpHeaders
	 *            the httpHeaders to set
	 */
	public APIContext addHTTPHeaders(Map<String, String> httpHeaders) {
		this.credential.addHeaders(httpHeaders);
		return this;
	}
	

	/**
	 * Adds HTTP Header to existing list
	 * 
	 * @param key
	 * @param value
	 */
	public APIContext addHTTPHeader(String key, String value) {
		this.credential.addHeader(key, value);
		return this;
	}

	/**
	 * Returns Configuration Map
	 * 
	 * @return {@link Map} of configurations
	 */
	public Map<String, String> getConfigurationMap() {
		return this.credential.getConfigurations();
	}

	/**
	 * Replaces the existing configurations with provided one
	 * 
	 * @param configurationMap
	 *            the configurationMap to set
	 */
	public void setConfigurationMap(Map<String, String> configurationMap) {
		this.credential.setConfigurations(configurationMap);
	}

	/**
	 * Adds configurations
	 * 
	 * @param configurations
	 */
	public void addConfigurations(Map<String, String> configurations) {
		this.credential.addConfigurations(configurations);
	}

	/**
	 * Returns the Access Token
	 * 
	 * @return Access Token
	 */
	public String getAccessToken() {
		String accessToken = null;
		if (this.credential != null) {
			try {
				accessToken = this.credential.getAccessToken();
			} catch (PayPalRESTException e) {
				accessToken = null;
			}
		}
		return accessToken;
	}

	/**
	 * Returns the unique requestId set during creation, if not available and if
	 * maskRequestId is set to false returns a generated one, else returns null.
	 * 
	 * @return requestId
	 */
	public String getRequestId() {
		String reqId = null;
		if (!maskRequestId) {
			if (requestId == null || requestId.length() <= 0) {
				requestId = UUID.randomUUID().toString();
			}
			reqId = requestId;
		}
		return reqId;
	}

	/**
	 * @param maskRequestId
	 *            the maskRequestId to set
	 */
	public void setMaskRequestId(boolean maskRequestId) {
		this.maskRequestId = maskRequestId;
	}

	/**
	 * @return the sdkVersion
	 */
	public SDKVersion getSdkVersion() {
		return sdkVersion;
	}

	/**
	 * @param sdkVersion
	 *            the sdkVersion to set
	 */
	public void setSdkVersion(SDKVersion sdkVersion) {
		this.sdkVersion = sdkVersion;
	}

	/**
	 * @deprecated Use getHTTPHeaders() instead
	 * @return the headersMap
	 */
	public Map<String, String> getHeadersMap() {
		return this.getHTTPHeaders();
	}

	/**
	 * @deprecated
	 * @param headersMap
	 *            the headersMap to set
	 */
	public void setHeadersMap(Map<String, String> headersMap) {
		this.setHTTPHeaders(headersMap);
	}

	public String getClientID() {
		if (this.credential == null) {
			throw new IllegalArgumentException(
					"ClientID and Secret are required. Please use APIContext(String clientID, String clientSecret, String mode)");
		}
		return this.credential.getClientID();
	}

	public String getClientSecret() {
		if (this.credential == null) {
			throw new IllegalArgumentException(
					"ClientID and Secret are required. Please use APIContext(String clientID, String clientSecret, String mode)");
		}
		return this.credential.getClientSecret();
	}

}
