package com.paypal.sdk.http.utils;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.common.ConsoleNotifier;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

public class WireMockHarness {

	protected final static int PORT = 8089;
	private WireMockServer wireMockServer = null;

	@BeforeMethod
	public void setup() {
		wireMockServer = new WireMockServer(options()
				.port(8089)
				.notifier(new ConsoleNotifier(true)));
		wireMockServer.start();

		WireMock.configureFor("localhost", PORT);
	}

	@AfterMethod
	public void teardown() {
		wireMockServer.stop();
	}

	protected String baseUrl() {
		return "http://localhost:" + PORT;
	}
}
