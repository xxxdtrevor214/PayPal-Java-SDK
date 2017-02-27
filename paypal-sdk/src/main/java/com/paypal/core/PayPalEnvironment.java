package com.paypal.core;

import com.braintreepayments.http.Environment;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public abstract class PayPalEnvironment implements Environment {

	@Setter(AccessLevel.NONE)
	private String clientId;

	@Setter(AccessLevel.NONE)
	private String clientSecret;

	public PayPalEnvironment(String clientId, String clientSecret) {
		this.clientId = clientId;
		this.clientSecret = clientSecret;
	}

	public static class Live extends PayPalEnvironment {

		public Live(String clientId, String clientSecret) {
			super(clientId, clientSecret);
		}

		@Override
		public String baseUrl() {
			return "https://api.paypal.com";
		}
	}

	public static class Sandbox extends PayPalEnvironment {

		public Sandbox(String clientId, String clientSecret) {
			super(clientId, clientSecret);
		}

		@Override
		public String baseUrl() {
			return "https://api.sandbox.paypal.com";
		}
	}
}
