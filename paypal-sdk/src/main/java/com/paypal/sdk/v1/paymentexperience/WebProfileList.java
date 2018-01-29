package com.paypal.sdk.v1.paymentexperience;

import com.braintreepayments.http.annotations.ListOf;
import com.braintreepayments.http.annotations.Model;

import java.util.ArrayList;

@Model
@ListOf(listClass = WebProfile.class)
public class WebProfileList extends ArrayList<WebProfile> {
    public WebProfileList() {
        super();
    }
}
