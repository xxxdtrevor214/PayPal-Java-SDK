package com.paypal.core.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true, fluent = true)
public class RefreshToken {

	@SerializedName("refresh_token")
	private String refreshToken;
}
