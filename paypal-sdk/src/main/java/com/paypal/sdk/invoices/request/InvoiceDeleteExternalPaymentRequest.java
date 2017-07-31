// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// InvoiceDeleteExternalPaymentRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.delete_external_payment","Description":"Deletes an external payment, by invoice ID and transaction ID.","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice from which to delete a payment transaction.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"transaction_id","Description":"The ID of the payment transaction to delete.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}],"RequestType":null,"ResponseType":null,"ContentType":"application/json","HttpMethod":"DELETE","Path":"/v1/invoicing/invoices/{invoice_id}/payment-records/{transaction_id}","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.*;
import java.util.List;


/**
 * Deletes an external payment, by invoice ID and transaction ID.
 */
public class InvoiceDeleteExternalPaymentRequest extends HttpRequest<Void> {

    public InvoiceDeleteExternalPaymentRequest(String invoiceId, String transactionId) {
        super("/v1/invoicing/invoices/{invoice_id}/payment-records/{transaction_id}?"
            .replace("{invoice_id}", String.valueOf(invoiceId))
            .replace("{transaction_id}", String.valueOf(transactionId)), "DELETE", Void.class);
        header("Content-Type", "application/json");
    }
    
}
