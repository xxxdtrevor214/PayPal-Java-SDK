package com.paypal.core.object;

import com.braintreepayments.http.serializer.Deserializable;
import com.braintreepayments.http.serializer.Serializable;

import java.util.Map;

public class RefreshToken implements Serializable, Deserializable {

	private String refreshToken;

	public String getRefreshToken() {
		return refreshToken;
	}

	@Override
	public void serialize(Map<String, Object> serialized) {
		if (this.refreshToken != null) {
			serialized.put("refresh_token", refreshToken);
		}
	}

	@Override
	public void deserialize(Map<String, Object> fields) {
		if (fields.containsKey("refresh_token")) {
			this.refreshToken = (String) fields.get("refresh_token");
		}
	}
}
