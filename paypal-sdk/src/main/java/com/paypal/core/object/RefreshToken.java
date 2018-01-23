package com.paypal.core.object;

import com.braintreepayments.http.annotations.Model;
import com.braintreepayments.http.annotations.SerializedName;

@Model
public class RefreshToken {

	@SerializedName("refresh_token")
	private String refreshToken;

	public String refreshToken() {
		return refreshToken;
	}
}
