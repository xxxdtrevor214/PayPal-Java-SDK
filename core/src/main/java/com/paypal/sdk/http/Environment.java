package com.paypal.sdk.http;

public interface Environment {

    String baseUrl();

    class Production implements Environment {

		@Override
		public String baseUrl() {
			return "https://api.paypal.com";
		}
	}

	class Sandbox implements Environment {

    	@Override
		public String baseUrl() {

			return "https://api.sandbox.paypal.com";
		}
	}

	class Development implements Environment {

    	public Development(String baseUrl) {
    		mBaseUrl = baseUrl;
		}

    	private String mBaseUrl;

    	@Override
		public String baseUrl() {
			return mBaseUrl;
		}
	}
}
