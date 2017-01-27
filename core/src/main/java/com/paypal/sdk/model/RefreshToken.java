package com.paypal.sdk.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true, fluent = true)
public class RefreshToken {
	private String refreshToken;
}
