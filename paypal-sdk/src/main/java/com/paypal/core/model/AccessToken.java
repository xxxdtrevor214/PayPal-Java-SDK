package com.paypal.core.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true, fluent = true)
public class AccessToken {

	@Getter
	private final transient Date createDate = new Date();

	@SerializedName("access_token")
	private String accessToken;

	@SerializedName("token_type")
	private String tokenType = "Bearer";

	@SerializedName("expires_in")
    private int expiresIn;

    public boolean isExpired() {
    	Date expireDate = new Date(createDate.getTime() + (expiresIn * 1000));
    	return new Date().after(expireDate);
    }
}
