package com.paypal.sdk.model;

import com.google.gson.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.lang.reflect.Type;

@Data
@Accessors(chain = true, fluent = true)
public class RefreshToken {

	private String refreshToken;
	private AccessToken accessToken;

	public static class RefreshTokenDeserializer implements JsonDeserializer<RefreshToken> {

		@Override
		public RefreshToken deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context)
				throws JsonParseException {
			JsonObject jsonObject = json.getAsJsonObject();

			RefreshToken refreshToken = new RefreshToken();
			refreshToken.refreshToken(jsonObject.get("refresh_token").getAsString());
			AccessToken accessToken = new AccessToken();
			refreshToken.accessToken(accessToken);
			accessToken.accessToken(jsonObject.get("access_token").getAsString());
			accessToken.tokenType(jsonObject.get("token_type").getAsString());
			accessToken.expiresIn(jsonObject.get("expires_in").getAsInt());
			return refreshToken;
		}
	}

	public static class RefreshTokenSerializer implements JsonSerializer<RefreshToken> {

		@Override
		public JsonElement serialize(RefreshToken src, Type typeOfSrc, JsonSerializationContext context) {
			JsonObject serialized = new JsonObject();
			serialized.addProperty("refresh_token", src.refreshToken);
			if (src.accessToken != null) {
				serialized.addProperty("access_token", src.accessToken.accessToken());
				serialized.addProperty("token_type", src.accessToken.tokenType());
				serialized.addProperty("expires_in", src.accessToken.expiresIn());
			}

			return serialized;
		}
	}
}
