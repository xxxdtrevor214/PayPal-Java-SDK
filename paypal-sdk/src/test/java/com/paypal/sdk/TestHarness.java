package com.paypal.sdk;

import com.braintreepayments.http.HttpClient;
import com.paypal.core.PayPalHttpClient;
import com.paypal.core.PayPalEnvironment;
import org.testng.annotations.BeforeMethod;

public class TestHarness {

	private HttpClient client;

	@BeforeMethod
	public void setup() {
		PayPalEnvironment environment = new PayPalEnvironment.Sandbox(
				"AdV4d6nLHabWLyemrw4BKdO9LjcnioNIOgoz7vD611ObbDUL0kJQfzrdhXEBwnH8QmV-7XZjvjRWn0kg",
				"EPKoPC_haZMTq5uM9WXuzoxUVdgzVqHyD5avCyVC1NCIUJeVaNNUZMnzduYIqrdw-carG9LBAizFGMyK");
		client = new PayPalHttpClient(environment);
	}

	protected HttpClient client() {
		return client;
	}
}
