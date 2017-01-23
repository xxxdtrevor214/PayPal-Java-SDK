// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// TemplatesRequestBuilder.java
// DO NOT EDIT
// @service templates
// @body {"Name":"create","ReturnType":{"Name":"template","IsArray":false},"Parameters":[],"RequestType":{"Name":"Template","ArgumentType":{"Name":"template","IsArray":false},"Location":""},"Visibility":"EXTERNAL","HttpMethod":"POST","Path":"v1/invoicing/templates","OauthScope":"https://uri.paypal.com/services/invoicing"}
// @body {"Name":"delete","ReturnType":{"Name":"void","IsArray":false},"Parameters":[{"Name":"template_id","ArgumentType":{"Name":"string","IsArray":false},"Location":"path"}],"RequestType":null,"Visibility":"EXTERNAL","HttpMethod":"DELETE","Path":"v1/invoicing/templates/{template_id}","OauthScope":"https://uri.paypal.com/services/invoicing"}
// @body {"Name":"get","ReturnType":{"Name":"template","IsArray":false},"Parameters":[{"Name":"template_id","ArgumentType":{"Name":"string","IsArray":false},"Location":"path"}],"RequestType":null,"Visibility":"EXTERNAL","HttpMethod":"GET","Path":"v1/invoicing/templates/{template_id}","OauthScope":"https://uri.paypal.com/services/invoicing"}
// @body {"Name":"get_all","ReturnType":{"Name":"templates","IsArray":false},"Parameters":[{"Name":"fields","ArgumentType":{"Name":"string","IsArray":false},"Location":"query"}],"RequestType":null,"Visibility":"EXTERNAL","HttpMethod":"GET","Path":"v1/invoicing/templates/","OauthScope":"https://uri.paypal.com/services/invoicing"}
// @body {"Name":"update","ReturnType":{"Name":"template","IsArray":false},"Parameters":[{"Name":"template_id","ArgumentType":{"Name":"string","IsArray":false},"Location":"path"}],"RequestType":{"Name":"Template","ArgumentType":{"Name":"template","IsArray":false},"Location":""},"Visibility":"EXTERNAL","HttpMethod":"PUT","Path":"v1/invoicing/templates/{template_id}","OauthScope":"https://uri.paypal.com/services/invoicing"}

package com.paypal.sdk.services.invoices;

import com.paypal.sdk.HttpRequest;
import com.paypal.sdk.models.common.*;
import com.paypal.sdk.models.invoices.*;

public class TemplatesRequestBuilder {

    /**
     * Creates a template.
     */
    public static HttpRequest<Template> create(Template template) {
    	String path = "/v1/invoicing/templates?";

    	return new HttpRequest<Template>(path, "POST", Template.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing")
			.requestBody(template);
    }

    /**
     * Deletes a template, by ID.
     */
    public static HttpRequest<Void> delete(String templateId) {
    	String path = "/v1/invoicing/templates/{template_id}?"
			.replace("{template_id}", String.valueOf(templateId));

    	return new HttpRequest<Void>(path, "DELETE", Void.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing");
    }

    /**
     * Shows details for a template, by ID.
     */
    public static HttpRequest<Template> get(String templateId) {
    	String path = "/v1/invoicing/templates/{template_id}?"
			.replace("{template_id}", String.valueOf(templateId));

    	return new HttpRequest<Template>(path, "GET", Template.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing");
    }

    /**
     * Lists all merchant-created templates. The list shows the emails, addresses, and phone numbers from the merchant profile.
     */
    public static HttpRequest<Templates> getAll(String fields) {
    	String path = "/v1/invoicing/templates/?";
		path += "fields=" + String.valueOf(fields) + "&";

    	return new HttpRequest<Templates>(path, "GET", Templates.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing");
    }

    /**
     * Updates a template, by ID. In the JSON request body, pass a complete `template` object. The update method does not support partial updates.
     */
    public static HttpRequest<Template> update(Template template, String templateId) {
    	String path = "/v1/invoicing/templates/{template_id}?"
			.replace("{template_id}", String.valueOf(templateId));

    	return new HttpRequest<Template>(path, "PUT", Template.class)
    		.oAuthScope("https://uri.paypal.com/services/invoicing")
			.requestBody(template);
    }
}


