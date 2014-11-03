package com.paypal.api.payments;

public class WebhooksInputData {

	public static final String[][] availableEvents = {
		{"PAYMENT.CAPTURE.REFUNDED", "A capture payment was refunded"},
        {"PAYMENT.AUTHORIZATION.VOIDED", "A payment authorization was voided"},
        {"PAYMENT.AUTHORIZATION.CREATED", "A payment authorization was created"},
        {"PAYMENT.SALE.COMPLETED", "A sale payment was completed"},	                
        {"PAYMENT.SALE.REFUNDED", "A sale payment was refunded"},	                
        {"PAYMENT.SALE.REVERSED", "A sale payment was reversed"},
        {"PAYMENT.CAPTURE.REVERSED", "A capture payment was reversed"}
	};
	
	public static final String ACCESS_TOKEN = "Y3JlYXRlV2ViaG9va3NEZW1vQWNjZXNzVG9rZW4="; //Base64 Encode of createWebhooksDemoAccessToken
	
}
