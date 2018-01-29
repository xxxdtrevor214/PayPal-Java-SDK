// This class was generated on Mon, 29 Jan 2018 12:12:00 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// InvoiceQrCodeRequest.java
// @version 0.1.0-dev+ecea6f
// @type request
// @data H4sIAAAAAAAC/8xW32/bNhB+319x4F5aQJXcbd2Dn7Ym/RFs65wf7TBkQXyWThYLimTIU1whyP8+HCU7dtLOLToMexOPd8f7vvt41I16gy2pqdL22umS8qtwWbqKVKYOKZZBe9bOqql6RZYCMkVAOD4B8YHaBUALY2gGix6ODvO/usnk+3IRivRB95ZnDW3itSSbvXkFusUlgbZw/hwj/fjDE7LiUF08aph9nBbFarXKF2lv2MpdWBaPpYIWGbhBhtKFQNE7W0VgB9zQujKpCv50HZRoYTkC+SQOQFsBVhVoljwIHj0FcAFmhy/XTjn80ZAFhLKL7FoK0EWKcqgO0LqFNgQVXUs6dhDlYL5DnkFDkjA2iYRAlQ5UMlXrwmfYz9CsE3nsW7IMtXErWDUUaCteUnvswVmjLcFKc7MOF1hQSnaGEkO1pzXPqXaBoHcdLInv+MmSqe0iT4cIZ7bjjd5e+WFxfhAokbyh9eLRt+NXvCzT5uMcTj2Vuu5hfhXGzZ889h5NXrp2DpgYhUCl9loYoBa1keYEilEEI9vzhTZG2+WltrWbg1u8p5JzeBtpuz+7oc6aHnSdkK3Qpk4PHlu6Gfkq/DbAYhfvx9Gfkmjoo9gj2eqxHNe6a9pRaR1cCwhVwDrV47HHhSGIjEw5HA3Vxq+hLNs5UEewbvSg6nPQFuvWq0wddxT6GQZsiSlENT2/UWe9l2ESOWi7VJl6h0ELhnHIYJmmSaZ+oX40PRg0MiC49wSuhrcnv6bLuWp02QglDy9vDodUY2dY0Mw99vN0f/VAQ2pz7Lx3QW7XNZqOcpWpn0PAfih2kqkTwup3a3o1rdFEEsNVpwNVG8MsOE+BNUU1tZ0xt9kGq7ZMSwoPwTaklw3vBzv4ZaJmrz+QiZlA5+05KeMxh3do9IhB8CW5PH02EV6eTSY7RMj6P4K50hU3+1Emt/8nyItMvSasKOyI+SJTL11o79tmyM2XiX68bZe62s/S0eGals1Q2CP/LyGAQ/cJ/OJDkYckYhSTvKWRBtsG5fEJHAz/B/dg/jO44e2G8V0fH3yBKjc9rQqfyPuabn5GL+SknUrXlt1y/xVZ3WbqwFkmO/Kq0HujS5QzivcxDcLXzP434sZV8o/14kwNClNTVVw/LQYRaLss1s9HcXMnp9viKjwZf9ZefPDpB+KUkbuYOjT9bjK5/eZvAAAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.invoices;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Generates a QR code for an invoice, by ID.<br/><br/>The QR code is a PNG image in [Base64-encoded](https://www.base64encode.org/) format that corresponds to the invoice ID. You can generate a QR code for an invoice and add it to a paper or PDF invoice. When a customer uses their mobile device to scan the QR code, he or she is redirected to the PayPal mobile payment flow where he or she can pay online with PayPal or a credit card.<br/><br/>Before you get a QR code, you must:<ol><li><p>[Create an invoice](#invoices_create). Specify `qrinvoice@paypal.com` as the recipient email address in the `billing_info` object. Use a customer email address only if you want to email the invoice.</p></li><li><p>[Send an invoice](#invoices_send) to move the invoice from a draft to payable state. If you specify `qrinvoice@paypal.com` as the recipient email address, the invoice is not emailed.</p></li></ol>
 */
public class InvoiceQrCodeRequest extends HttpRequest<QrCode> {

    public InvoiceQrCodeRequest(String invoiceId) {
        super("/v1/invoicing/invoices/{invoice_id}/qr-code?", "GET", QrCode.class);
        try {
            path(path().replace("{invoice_id}", URLEncoder.encode(String.valueOf(invoiceId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }

    public InvoiceQrCodeRequest action(String action) {
        String params = String.valueOf(action);
        try {
		    path(path() + "action=" + URLEncoder.encode(params, "UTF-8") + "&");
        } catch (UnsupportedEncodingException ignored) {}
        return this;
    }

    public InvoiceQrCodeRequest height(Integer height) {
        String params = String.valueOf(height);
        try {
		    path(path() + "height=" + URLEncoder.encode(params, "UTF-8") + "&");
        } catch (UnsupportedEncodingException ignored) {}
        return this;
    }

    public InvoiceQrCodeRequest width(Integer width) {
        String params = String.valueOf(width);
        try {
		    path(path() + "width=" + URLEncoder.encode(params, "UTF-8") + "&");
        } catch (UnsupportedEncodingException ignored) {}
        return this;
    }
    
}
