package com.paypal.api.payments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.paypal.api.payments.Payment;
import com.paypal.core.ClientCredentials;
import com.paypal.core.rest.APIContext;
import com.paypal.core.rest.PayPalRESTException;
import com.paypal.sdk.openidconnect.CreateFromAuthorizationCodeParameters;
import com.paypal.sdk.openidconnect.Tokeninfo;
import com.paypal.sdk.openidconnect.CreateFromRefreshTokenParameters;

public class FuturePayment extends Payment {

	
	private Properties getCredential() throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileReader(new File(".",
				"src/main/resources/sdk_config.properties")));
		return properties;
	}
	
	/**
	 * Creates a future payment using either authorization code or refresh token with correlation ID. <br>
	 * https://developer.paypal.com/webapps/developer/docs/integration/mobile/make-future-payment/
	 * 
	 * @param authorizationCode	an authorization code
	 * @param refreshToken		a refresh token
	 * @param correlationId		paypal application correlation ID
	 * @return	a <code>Payment</code> object
	 * @throws PayPalRESTException
	 * @throws IOException thrown when config file cannot be read properly
	 * @throws FileNotFoundException thrown when config file does not exist
	 */
	public Payment create(String accessToken, String correlationId) throws PayPalRESTException, FileNotFoundException, IOException {
		if (correlationId == null || correlationId.equals("")) {
			throw new IllegalArgumentException("correlation ID cannot be null or empty");
		}
		
		APIContext apiContext = new APIContext(accessToken);
		apiContext.setHTTPHeaders(new HashMap<String, String>());
		apiContext.getHTTPHeaders().put("Paypal-Application-Correlation-Id", correlationId);
		return this.create(apiContext);
	}
	public Tokeninfo getTokeninfo2(CreateFromAuthorizationCodeParameters params) throws PayPalRESTException {
		Map<String, String> configurationMap = new HashMap<String, String>();
		configurationMap.put("mode", "sandbox");
		System.out.println(params.getClientID());
		System.out.println(params.getClientSecret());
		CreateFromAuthorizationCodeParameters param = new CreateFromAuthorizationCodeParameters();
		param.setClientID("AQkquBDf1zctJOWGKWUEtKXm6qVhueUEMvXO_-MCI4DQQ4-LWvkDLIN2fGsd");
		param.setClientSecret("EL1tVxAjhT7cJimnz5-Nsx9k2reTKSVfErNQF-CmrwJgxRtylkGTKlU4RvrX");
		param.setCode("EGTV5jvRQN1ByDsBcmz6oIhQe57kvwYNY0FF46aPwFLiYAnDbO8qDruo9p0esRVMoZTU28NHM7ZVJSbhP-BF1bq76MC5sy8eVQ625BIUSEK_DPAyMyKlHyNVS2DqBR2iWVfQGfudbd9MDoRxMEjIZbY");
		APIContext apiContext = new APIContext();
		apiContext.setConfigurationMap(configurationMap);
		Tokeninfo info = Tokeninfo.createFromAuthorizationCode(apiContext, param);
		return info;
	}
	
	public Tokeninfo getTokeninfo(CreateFromAuthorizationCodeParameters params) throws PayPalRESTException {
		Map<String, String> configurationMap = new HashMap<String, String>();
	    configurationMap.put("clientId", params.getClientID());
	    configurationMap.put("clientSecret", params.getClientSecret());
	    configurationMap.put("response_type", "token");
	    configurationMap.put("mode", "sandbox");
		APIContext apiContext = new APIContext();
		apiContext.setConfigurationMap(configurationMap);
	    params.setRedirectURI("urn:ietf:wg:oauth:2.0:oob");
		Tokeninfo info = Tokeninfo.createFromAuthorizationCodeForFpp(apiContext, params);
		return info;
	}
	
	public Tokeninfo getTokeninfo(CreateFromRefreshTokenParameters params, Tokeninfo info) throws PayPalRESTException {
		Map<String, String> configurationMap = new HashMap<String, String>();
		APIContext apiContext = new APIContext();
		apiContext.setConfigurationMap(configurationMap);
		info = info.createFromRefreshToken(apiContext, params);
		return info;
	}
	
	public ClientCredentials getClientCredential() throws FileNotFoundException, IOException {
		ClientCredentials credentials = new ClientCredentials();
		Properties properties = getCredential();
		credentials.setClientID(properties.getProperty("clientID"));
		credentials.setClientSecret(properties.getProperty("clientSecret"));
		return credentials;
	}
}
