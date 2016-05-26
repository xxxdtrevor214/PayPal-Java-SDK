package com.paypal.api.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.paypal.api.payments.util.GenerateAccessToken;
import com.paypal.base.rest.JSONFormatter;
import com.paypal.base.rest.PayPalRESTException;
import com.paypal.base.rest.PayPalResource;

public class SampleBase<T> {

	protected T instance;
	protected String accessToken = null;

	/**
	 * Initialize sample base
	 *
	 * @param type
	 * @throws PayPalRESTException
	 * @throws JsonSyntaxException
	 * @throws JsonIOException
	 * @throws FileNotFoundException
	 */
	public SampleBase(T type) throws PayPalRESTException, JsonSyntaxException,
			JsonIOException, FileNotFoundException {

		instance = type;

		// initialize sample credentials. User credentials must be stored
		// in the file
		PayPalResource.initConfig(new File(
				getClass().getClassLoader().getResource("sdk_config.properties").getFile()));

		// get an access token
		accessToken = GenerateAccessToken.getAccessToken();
	}

	protected <T> T load(String jsonFile, Class<T> clazz) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File(
					getClass().getClassLoader().getResource(jsonFile).getFile())));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.getProperty("line.separator"));
				line = br.readLine();
			}
			return (T)JSONFormatter.fromJSON(sb.toString(), clazz);
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
