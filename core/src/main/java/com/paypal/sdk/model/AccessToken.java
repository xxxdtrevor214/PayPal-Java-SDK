package com.paypal.sdk.model;

import lombok.Data;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true, fluent = true)
public class AccessToken {

	@Getter
	private final transient Date createDate = new Date();

	private String accessToken;
	private String tokenType = "Bearer";
    private int expiresIn;

    public boolean isExpired() {
    	Date expireDate = new Date(createDate.getTime() + (expiresIn * 1000));
    	return new Date().after(expireDate);
    }
}
