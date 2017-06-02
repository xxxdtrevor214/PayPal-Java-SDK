package com.paypal.core.object;

import com.google.gson.annotations.SerializedName;

public class RefreshToken {

	@SerializedName("refresh_token")
	private String refreshToken;

	public String getRefreshToken() {
		return refreshToken;
	}
}
