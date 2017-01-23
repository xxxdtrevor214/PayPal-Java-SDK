package com.paypal.sdk.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true, fluent = true)
public class RefreshToken extends AccessToken {
	private String refreshToken;
}
