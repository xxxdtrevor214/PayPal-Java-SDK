package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.HttpClient;
import com.paypal.sdk.invoices.object.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

public class TestUtil {

	/* Invoice helper functions */
	public static class ResponseAndID {
		public final HttpResponse<Void> response;
		public final String id;
		public ResponseAndID(HttpResponse<Void> response, String id) {
		    this.response = response;
		    this.id	= id;
		}
	}

	public static HttpResponse<Invoice> createInvoice(HttpClient client) throws IOException {
	    Invoice body = new Invoice();
	    body.merchantInfo(new MerchantInformation()
                .email("team-dx-clients-facilitator@getbraintree.com"));
	    InvoiceCreateRequest request = new InvoiceCreateRequest().requestBody(body);

	    return client.execute(request);
	}

	public static ResponseAndID sendInvoice(HttpClient client) throws IOException {
	    HttpResponse<Invoice> createResponse = createInvoice(client);
		InvoiceSendRequest sendRequest = new InvoiceSendRequest(createResponse.result().id()).notifyMerchant(true);

		return new ResponseAndID(client.execute(sendRequest), createResponse.result().id());
	}

	public static ResponseAndID createInvoicePayment(HttpClient client, String invoice_id) throws IOException {
	    InvoiceRecordPaymentRequest request = new InvoiceRecordPaymentRequest(invoice_id)
				.requestBody(new PaymentDetail()
						.method("CASH")
						.date("2017-07-11 00:01:00 PST")
						.amount(new Currency().currency("USD").value("10"))
				);

	    return new ResponseAndID(client.execute(request), invoice_id);
	}

	public static ResponseAndID createInvoicePayment(HttpClient client) throws IOException {
	    ResponseAndID responseAndID = sendInvoice(client);
	    return createInvoicePayment(client, responseAndID.id);
	}

	public static ResponseAndID createInvoiceRefund(HttpClient client) throws IOException {
		ResponseAndID responseAndID = sendInvoice(client);

		createInvoicePayment(client, responseAndID.id);

        InvoiceRecordRefundRequest request = new InvoiceRecordRefundRequest(responseAndID.id)
				.requestBody(new RefundDetail().amount(new Currency().currency("USD").value("10")));

        return new ResponseAndID(client.execute(request), responseAndID.id);
	}

	public static HttpResponse<Invoice> getInvoice(HttpClient client, String id) throws IOException {
		return client.execute(new InvoiceGetRequest(id));
	}

	/* Invoice template helper functions */
	public static class CreateResponseAndCleanup {
		public final HttpResponse<Template> response;

		private String templateId;
		private HttpClient client;
		public void cleanup() throws IOException {
			client.execute(new TemplateDeleteRequest(templateId));
		}

		public CreateResponseAndCleanup(HttpResponse<Template> response, HttpClient client, String templateId) {
			this.response = response;
			this.client = client;
			this.templateId = templateId;
		}
	}

	public static Template buildTemplate() {
		return new Template()
				.name("Hours Template_" + UUID.randomUUID().toString().substring(0, 4).replaceAll("-", ""))
				._default(true)
				.unitOfMeasure("HOURS")
				.templateData(new TemplateData()
						.items(Arrays.asList(new InvoiceItem()
								.name("Nutri Bullet")
								.quantity(1.0)
								.unitPrice(new Currency().currency("USD").value("10"))
						))
						.merchantInfo(new MerchantInformation().email("team-dx-clients-facilitator@getbraintree.com"))
						.taxCalculatedAfterDiscount(false)
						.taxInclusive(false)
						.note("Thank you for your business!")
						.logoUrl("https://pics.paypal.com/v1/images/redDot.jpeg"))
				.settings(Arrays.asList(
				        new TemplateSettings().fieldName("items.date").displayPreference(new TemplateSettingsMetadata().hidden(true)),
						new TemplateSettings().fieldName("custom").displayPreference(new TemplateSettingsMetadata().hidden(true))
				));
	}

	public static CreateResponseAndCleanup createTemplate(HttpClient client) throws IOException {
		Template template = buildTemplate();
		TemplateCreateRequest request = new TemplateCreateRequest()
				.requestBody(template);

		HttpResponse<Template> response = client.execute(request);
		return new CreateResponseAndCleanup(response, client, response.result().templateId());
	}

	public static HttpResponse<Void> deleteTemplate(HttpClient client, String template_id) throws IOException {
	    return client.execute(new TemplateDeleteRequest(template_id));
	}
}
