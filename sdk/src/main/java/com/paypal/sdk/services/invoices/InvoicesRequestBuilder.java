// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// InvoicesRequestBuilder.java
// DO NOT EDIT
// @service invoices
// @body {"Name":"cancel","ReturnType":{"Name":"void","IsArray":false},"Parameters":[{"Name":"invoice_id","ArgumentType":{"Name":"string","IsArray":false},"Location":"path"}],"RequestType":{"Name":"Cancel Notification","ArgumentType":{"Name":"cancel_notification","IsArray":false},"Location":""},"Visibility":"EXTERNAL","HttpMethod":"POST","Path":"v1/invoicing/invoices/{invoice_id}/cancel","OauthScope":"https://uri.paypal.com/services/invoicing"}
// @body {"Name":"create","ReturnType":{"Name":"invoice","IsArray":false},"Parameters":[],"RequestType":{"Name":"Invoice","ArgumentType":{"Name":"invoice","IsArray":false},"Location":""},"Visibility":"EXTERNAL","HttpMethod":"POST","Path":"v1/invoicing/invoices","OauthScope":"https://uri.paypal.com/services/invoicing"}
// @body {"Name":"delete","ReturnType":{"Name":"void","IsArray":false},"Parameters":[{"Name":"invoice_id","ArgumentType":{"Name":"string","IsArray":false},"Location":"path"}],"RequestType":null,"Visibility":"EXTERNAL","HttpMethod":"DELETE","Path":"v1/invoicing/invoices/{invoice_id}","OauthScope":"https://uri.paypal.com/services/invoicing"}
// @body {"Name":"delete_external_payment","ReturnType":{"Name":"void","IsArray":false},"Parameters":[{"Name":"invoice_id","ArgumentType":{"Name":"string","IsArray":false},"Location":"path"},{"Name":"transaction_id","ArgumentType":{"Name":"string","IsArray":false},"Location":"path"}],"RequestType":null,"Visibility":"EXTERNAL","HttpMethod":"DELETE","Path":"v1/invoicing/invoices/{invoice_id}/payment-records/{transaction_id}","OauthScope":"https://uri.paypal.com/services/invoicing"}
// @body {"Name":"delete_external_refund","ReturnType":{"Name":"void","IsArray":false},"Parameters":[{"Name":"invoice_id","ArgumentType":{"Name":"string","IsArray":false},"Location":"path"},{"Name":"transaction_id","ArgumentType":{"Name":"string","IsArray":false},"Location":"path"}],"RequestType":null,"Visibility":"EXTERNAL","HttpMethod":"DELETE","Path":"v1/invoicing/invoices/{invoice_id}/refund-records/{transaction_id}","OauthScope":"https://uri.paypal.com/services/invoicing"}
// @body {"Name":"generate_number","ReturnType":{"Name":"void","IsArray":false},"Parameters":[],"RequestType":null,"Visibility":"EXTERNAL","HttpMethod":"POST","Path":"v1/invoicing/invoices/next-invoice-number","OauthScope":"https://uri.paypal.com/services/invoicing"}
// @body {"Name":"get","ReturnType":{"Name":"invoice","IsArray":false},"Parameters":[{"Name":"invoice_id","ArgumentType":{"Name":"string","IsArray":false},"Location":"path"}],"RequestType":null,"Visibility":"EXTERNAL","HttpMethod":"GET","Path":"v1/invoicing/invoices/{invoice_id}","OauthScope":"https://uri.paypal.com/services/invoicing"}
// @body {"Name":"get_all","ReturnType":{"Name":"invoices","IsArray":false},"Parameters":[{"Name":"page","ArgumentType":{"Name":"integer","IsArray":false},"Location":"query"},{"Name":"page_size","ArgumentType":{"Name":"integer","IsArray":false},"Location":"query"},{"Name":"total_count_required","ArgumentType":{"Name":"boolean","IsArray":false},"Location":"query"}],"RequestType":null,"Visibility":"EXTERNAL","HttpMethod":"GET","Path":"v1/invoicing/invoices/","OauthScope":"https://uri.paypal.com/services/invoicing"}
// @body {"Name":"qr_code","ReturnType":{"Name":"void","IsArray":false},"Parameters":[{"Name":"action","ArgumentType":{"Name":"string","IsArray":false},"Location":"query"},{"Name":"height","ArgumentType":{"Name":"integer","IsArray":false},"Location":"query"},{"Name":"invoice_id","ArgumentType":{"Name":"string","IsArray":false},"Location":"path"},{"Name":"width","ArgumentType":{"Name":"integer","IsArray":false},"Location":"query"}],"RequestType":null,"Visibility":"EXTERNAL","HttpMethod":"GET","Path":"v1/invoicing/invoices/{invoice_id}/qr-code","OauthScope":"https://uri.paypal.com/services/invoicing"}
// @body {"Name":"record_payment","ReturnType":{"Name":"void","IsArray":false},"Parameters":[{"Name":"invoice_id","ArgumentType":{"Name":"string","IsArray":false},"Location":"path"}],"RequestType":{"Name":"Payment Detail","ArgumentType":{"Name":"payment-detail","IsArray":false},"Location":""},"Visibility":"EXTERNAL","HttpMethod":"POST","Path":"v1/invoicing/invoices/{invoice_id}/record-payment","OauthScope":"https://uri.paypal.com/services/invoicing"}
// @body {"Name":"record_refund","ReturnType":{"Name":"void","IsArray":false},"Parameters":[{"Name":"invoice_id","ArgumentType":{"Name":"string","IsArray":false},"Location":"path"}],"RequestType":{"Name":"Refund Detail","ArgumentType":{"Name":"refund-detail","IsArray":false},"Location":""},"Visibility":"EXTERNAL","HttpMethod":"POST","Path":"v1/invoicing/invoices/{invoice_id}/record-refund","OauthScope":"https://uri.paypal.com/services/invoicing"}
// @body {"Name":"remind","ReturnType":{"Name":"void","IsArray":false},"Parameters":[{"Name":"invoice_id","ArgumentType":{"Name":"string","IsArray":false},"Location":"path"}],"RequestType":{"Name":"Notification","ArgumentType":{"Name":"notification","IsArray":false},"Location":""},"Visibility":"EXTERNAL","HttpMethod":"POST","Path":"v1/invoicing/invoices/{invoice_id}/remind","OauthScope":"https://uri.paypal.com/services/invoicing"}
// @body {"Name":"search","ReturnType":{"Name":"invoices","IsArray":false},"Parameters":[],"RequestType":{"Name":"Search","ArgumentType":{"Name":"search","IsArray":false},"Location":""},"Visibility":"EXTERNAL","HttpMethod":"POST","Path":"v1/invoicing/search","OauthScope":"https://uri.paypal.com/services/invoicing"}
// @body {"Name":"send","ReturnType":{"Name":"void","IsArray":false},"Parameters":[{"Name":"invoice_id","ArgumentType":{"Name":"string","IsArray":false},"Location":"path"},{"Name":"notify_merchant","ArgumentType":{"Name":"boolean","IsArray":false},"Location":"query"}],"RequestType":null,"Visibility":"EXTERNAL","HttpMethod":"POST","Path":"v1/invoicing/invoices/{invoice_id}/send","OauthScope":"https://uri.paypal.com/services/invoicing"}
// @body {"Name":"update","ReturnType":{"Name":"invoice","IsArray":false},"Parameters":[{"Name":"invoice_id","ArgumentType":{"Name":"string","IsArray":false},"Location":"path"},{"Name":"notify_merchant","ArgumentType":{"Name":"boolean","IsArray":false},"Location":"query"}],"RequestType":{"Name":"Invoice","ArgumentType":{"Name":"invoice","IsArray":false},"Location":""},"Visibility":"EXTERNAL","HttpMethod":"PUT","Path":"v1/invoicing/invoices/{invoice_id}","OauthScope":"https://uri.paypal.com/services/invoicing"}

package com.paypal.sdk.services.invoices;

import com.paypal.sdk.HttpRequest;
import com.paypal.sdk.models.common.*;
import com.paypal.sdk.models.invoices.*;

public class InvoicesRequestBuilder {

    /**
     * Cancels a sent invoice, by ID, and, optionally, sends a notification about the cancellation to the payer, merchant, and Cc: emails.
     */
    public static HttpRequest<Void> cancel(CancelNotification cancelNotification, String invoiceId) {
    	String path = "/v1/invoicing/invoices/{invoice_id}/cancel?"
			.replace("{invoice_id}", String.valueOf(invoiceId));

    	return new HttpRequest<Void>(path, "POST", Void.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing")
			.requestBody(cancelNotification);
    }

    /**
     * Creates a draft invoice. You can optionally create an invoice [template](/docs/api/invoicing/#templates). Then, when you create an invoice from a template, the invoice is populated with the predefined data that the source template contains. To move the invoice from a draft to payable state, you must [send the invoice](/docs/api/invoicing/#invoices_send). In the JSON request body, include invoice details including merchant information. The `invoice` object must include an `items` array.<blockquote><strong>Note:</strong> The merchant specified in an invoice must have a PayPal account in good standing.</blockquote>
     */
    public static HttpRequest<Invoice> create(Invoice invoice) {
    	String path = "/v1/invoicing/invoices?";

    	return new HttpRequest<Invoice>(path, "POST", Invoice.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing")
			.requestBody(invoice);
    }

    /**
     * Deletes a draft invoice, by ID. Note that this call works for invoices in the draft state only. For invoices that have already been sent, you can [cancel the invoice](/docs/api/invoicing/#invoices_cancel). After you delete a draft invoice, you can no longer use it or show its details. However, you can reuse its invoice number.
     */
    public static HttpRequest<Void> delete(String invoiceId) {
    	String path = "/v1/invoicing/invoices/{invoice_id}?"
			.replace("{invoice_id}", String.valueOf(invoiceId));

    	return new HttpRequest<Void>(path, "DELETE", Void.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing");
    }

    /**
     * Deletes an external payment, by invoice ID and transaction ID.
     */
    public static HttpRequest<Void> deleteExternalPayment(String invoiceId, String transactionId) {
    	String path = "/v1/invoicing/invoices/{invoice_id}/payment-records/{transaction_id}?"
			.replace("{invoice_id}", String.valueOf(invoiceId))
			.replace("{transaction_id}", String.valueOf(transactionId));

    	return new HttpRequest<Void>(path, "DELETE", Void.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing");
    }

    /**
     * Deletes an external refund, by invoice ID and transaction ID.
     */
    public static HttpRequest<Void> deleteExternalRefund(String invoiceId, String transactionId) {
    	String path = "/v1/invoicing/invoices/{invoice_id}/refund-records/{transaction_id}?"
			.replace("{invoice_id}", String.valueOf(invoiceId))
			.replace("{transaction_id}", String.valueOf(transactionId));

    	return new HttpRequest<Void>(path, "DELETE", Void.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing");
    }

    /**
     * Generates the next invoice number that is available to the user.
     */
    public static HttpRequest<Void> generateNumber() {
    	String path = "/v1/invoicing/invoices/next-invoice-number?";

    	return new HttpRequest<Void>(path, "POST", Void.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing");
    }

    /**
     * Shows details for a specified invoice, by ID.
     */
    public static HttpRequest<Invoice> get(String invoiceId) {
    	String path = "/v1/invoicing/invoices/{invoice_id}?"
			.replace("{invoice_id}", String.valueOf(invoiceId));

    	return new HttpRequest<Invoice>(path, "GET", Invoice.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing");
    }

    /**
     * Lists merchant invoices. Optionally, you can specify one or more query parameters to filter the response.
     */
    public static HttpRequest<Invoices> getAll(int page, int pageSize, boolean totalCountRequired) {
    	String path = "/v1/invoicing/invoices/?";
		path += "page=" + String.valueOf(page) + "&";
		path += "page_size=" + String.valueOf(pageSize) + "&";
		path += "total_count_required=" + String.valueOf(totalCountRequired) + "&";

    	return new HttpRequest<Invoices>(path, "GET", Invoices.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing");
    }

    /**
     * Generates a QR code for an invoice, by ID.<br/><br/>The QR code is a PNG image in [Base64-encoded](https://www.base64encode.org/) format that corresponds to the invoice ID. You can generate a QR code for an invoice and add it to a paper or PDF invoice. When a customer uses their mobile device to scan the QR code, he or she is redirected to the PayPal mobile payment flow where he or she can pay online with PayPal or a credit card.<br/><br/>Before you get a QR code, you must:<ol><li><p>[Create an invoice](#invoices_create). Specify `qrinvoice@paypal.com` as the recipient email address in the `billing_info` object. Use a customer email address only if you want to email the invoice.</p></li><li><p>[Send an invoice](#invoices_send) to move the invoice from a draft to payable state. If you specify `qrinvoice@paypal.com` as the recipient email address, the invoice is not emailed.</p></li></ol>
     */
    public static HttpRequest<Void> qrCode(String action, int height, String invoiceId, int width) {
    	String path = "/v1/invoicing/invoices/{invoice_id}/qr-code?"
			.replace("{invoice_id}", String.valueOf(invoiceId));
		path += "action=" + String.valueOf(action) + "&";
		path += "height=" + String.valueOf(height) + "&";
		path += "width=" + String.valueOf(width) + "&";

    	return new HttpRequest<Void>(path, "GET", Void.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing");
    }

    /**
     * Marks the status of a specified invoice, by ID, as paid. Include a payment detail object that defines the payment method and other details in the JSON request body.
     */
    public static HttpRequest<Void> recordPayment(PaymentDetail paymentDetail, String invoiceId) {
    	String path = "/v1/invoicing/invoices/{invoice_id}/record-payment?"
			.replace("{invoice_id}", String.valueOf(invoiceId));

    	return new HttpRequest<Void>(path, "POST", Void.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing")
			.requestBody(paymentDetail);
    }

    /**
     * Marks the status of an invoice, by ID, as refunded. In the JSON request body, include a payment detail object that defines the payment method and other details.
     */
    public static HttpRequest<Void> recordRefund(RefundDetail refundDetail, String invoiceId) {
    	String path = "/v1/invoicing/invoices/{invoice_id}/record-refund?"
			.replace("{invoice_id}", String.valueOf(invoiceId));

    	return new HttpRequest<Void>(path, "POST", Void.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing")
			.requestBody(refundDetail);
    }

    /**
     * Sends a reminder about an invoice, by ID, to a customer. In the JSON request body, include a `notification` object that defines the subject of the reminder and other details.
     */
    public static HttpRequest<Void> remind(Notification notification, String invoiceId) {
    	String path = "/v1/invoicing/invoices/{invoice_id}/remind?"
			.replace("{invoice_id}", String.valueOf(invoiceId));

    	return new HttpRequest<Void>(path, "POST", Void.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing")
			.requestBody(notification);
    }

    /**
     * Lists invoices that match search criteria. In the JSON request body, include a `search` object that specifies the search criteria.
     */
    public static HttpRequest<Invoices> search(Search search) {
    	String path = "/v1/invoicing/search?";

    	return new HttpRequest<Invoices>(path, "POST", Invoices.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing")
			.requestBody(search);
    }

    /**
     * Sends an invoice, by ID, to a customer.<blockquote><strong>Note:</strong> After you send an invoice, you cannot resend it.</blockquote><br/>Optionally, set the `notify_merchant` query parameter to also send the merchant an invoice update notification. Default is `true`.
     */
    public static HttpRequest<Void> send(String invoiceId, boolean notifyMerchant) {
    	String path = "/v1/invoicing/invoices/{invoice_id}/send?"
			.replace("{invoice_id}", String.valueOf(invoiceId));
		path += "notify_merchant=" + String.valueOf(notifyMerchant) + "&";

    	return new HttpRequest<Void>(path, "POST", Void.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing");
    }

    /**
     * Fully updates an invoice, by ID. In the JSON request body, include a complete `invoice` object. This call does not support partial updates.
     */
    public static HttpRequest<Invoice> update(Invoice invoice, String invoiceId, boolean notifyMerchant) {
    	String path = "/v1/invoicing/invoices/{invoice_id}?"
			.replace("{invoice_id}", String.valueOf(invoiceId));
		path += "notify_merchant=" + String.valueOf(notifyMerchant) + "&";

    	return new HttpRequest<Invoice>(path, "PUT", Invoice.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing")
			.requestBody(invoice);
    }
}


