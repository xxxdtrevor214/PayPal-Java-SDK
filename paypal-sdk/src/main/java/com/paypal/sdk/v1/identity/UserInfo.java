// This class was generated on Mon, 29 Jan 2018 12:11:59 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// UserInfo.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/8RYTW/jNhC991cM1EMvsuNefQviS9BNd7FNCxhFodDiyJqWIlVylK226H8vSH1EtOw0QL3aU8I3Q/q9GXI41N/JY1tjsk0ahzYjXZgkTX4RlsRB4Y+i8qYkTX7A9mWwQ5dbqpmMTrbJ+xo13O/gzmiNOYNfCPxCthLeZS1N3lSoOYzekf5jWzLX25sbU6MmudbIN67G3PXAKu9WWh2Eo3z1fbZZl1ypb39ioaWw8k4JqlySJrfWirajv0mTjyjke63aZFsI5dADfzZkUY7AB2tqtEzoku2vo3DHlvRxrlrkuWk0Z+zdphE4McTRuNWAuqnQBrVgCuASoZ8Cfopb/0/qulHqnzROnJDSonNnVIyGiYARi7k/lgioZcjgdw5qiwVaixL6CesvHvMQJdtGbF+wOdveduWIXmKnTC4UcUxvAp7hR9yCsTA4LUS0No6FynIj450b43O6n6kGb/SUO98wXIi1xaOnMiU8QnOujgVjCrU1z6Tz8B8WmHNjMfX8u6kLUXdsETk7d9hmprmUolEKOr/xqMGd0EA6V43EUEJK0zgE3VQHtCC0HCZoUV0nQb+9Qac4YmaFPp4UxAk6VzfUvtIoGeqKOCIE94WScyDLpRQck56ir5bB3rFNgTQ87ff7/erhYbXbPUF3xa3BT2hRWHi43cMB4Wmz2WyeUvhUUl4CaUm5YHTApeCQy+BMDkxFzCjX8GjAYm3RoWYwWrWjW+pphFH46fFHlwkdVoJUFLYBeePNgSvvf60L5IT1wRiFQl+gnT2jpYJQzvlPTbGQ+zFZn0rkEm0I/UQaTvX4HA5LLZSRQlSk2syf+khXjJ8pl431tlAalXBd3fAD/9elQ6MyKF1IzRG1RBsJGaFXd1jntRRLekY9D3kEz9kGc4h3QdZxGkf8KwU8NCI4b2D+swp2XguxrEhKhfOIx/icb2fvA/1V4jujfJHrJLbh/g+kSYMkVyvR+jVDre+bANJHEINbLSy7NXwwztFBtUOf4ICJFbquPWiKgv5CB85Y9j18nhsblmFzWtS65IZpXelGnV/9nXKxWRWtf3nGZXoCzkN3vzt9VwX3pfiWRmPWNWIx59jwxhuSUWGY2fd2S6mg0CrHAkZszv3nj+9Oj1SQYQpSCP3Mpbrt5hC32GF87s47/I45+/1SmPgmh74TI+eaxWLefWKJN/oL9to+X4T2xXZqaHGy/rhFAs4Y50oGp/HA+tdbs1SF+Ww09l+2XnhPwFdPKlOF4J2v9Mj65l8AAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.identity;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Open ID Connect user information.documentationLink:http://openid.net/specs/openid-connect-basic-1_0.html#StandardClaims
 */
@Model
public class UserInfo {

    // Required default constructor
    public UserInfo() {}

	/**
	* An enumeration of the account types.
	*/
	@SerializedName("account_type")
	private String accountType;

	public String accountType() { return accountType; }
	
	public UserInfo accountType(String accountType) {
	    this.accountType = accountType;
	    return this;
	}

	/**
	* The end user's preferred address.
	*/
	@SerializedName("address")
	private UserAddress address;

	public UserAddress address() { return address; }
	
	public UserInfo address(UserAddress address) {
	    this.address = address;
	    return this;
	}

	/**
	* The account holder's age range.
	*/
	@SerializedName("age_range")
	private String ageRange;

	public String ageRange() { return ageRange; }
	
	public UserInfo ageRange(String ageRange) {
	    this.ageRange = ageRange;
	    return this;
	}

	/**
	* The end user's birthday, in `YYYY-MM-DD` format. The year MAY be `0000`, which indicates that the year is omitted. To represent only the year, use the `YYYY` format.
	*/
	@SerializedName("birthdate")
	private String birthdate;

	public String birthdate() { return birthdate; }
	
	public UserInfo birthdate(String birthdate) {
	    this.birthdate = birthdate;
	    return this;
	}

	/**
	* The end user's preferred e-mail address.
	*/
	@SerializedName("email")
	private String email;

	public String email() { return email; }
	
	public UserInfo email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* Indicates whether the end user's email address is verified.
	*/
	@SerializedName("email_verified")
	private Boolean emailVerified;

	public Boolean emailVerified() { return emailVerified; }
	
	public UserInfo emailVerified(Boolean emailVerified) {
	    this.emailVerified = emailVerified;
	    return this;
	}

	/**
	* The surname, or last name or names, of the end user.
	*/
	@SerializedName("family_name")
	private String familyName;

	public String familyName() { return familyName; }
	
	public UserInfo familyName(String familyName) {
	    this.familyName = familyName;
	    return this;
	}

	/**
	* The end user's gender.
	*/
	@SerializedName("gender")
	private String gender;

	public String gender() { return gender; }
	
	public UserInfo gender(String gender) {
	    this.gender = gender;
	    return this;
	}

	/**
	* The given, or first, name or names of the end user.
	*/
	@SerializedName("given_name")
	private String givenName;

	public String givenName() { return givenName; }
	
	public UserInfo givenName(String givenName) {
	    this.givenName = givenName;
	    return this;
	}

	/**
	* The end user's locale.
	*/
	@SerializedName("locale")
	private String locale;

	public String locale() { return locale; }
	
	public UserInfo locale(String locale) {
	    this.locale = locale;
	    return this;
	}

	/**
	* The middle name of the end user.
	*/
	@SerializedName("middle_name")
	private String middleName;

	public String middleName() { return middleName; }
	
	public UserInfo middleName(String middleName) {
	    this.middleName = middleName;
	    return this;
	}

	/**
	* The end user's full name in displayable form including all name parts. Possibly includes titles and suffixes sorted according to the end user's locale and preferences.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public UserInfo name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* The ID of the account payer.
	*/
	@SerializedName("payer_id")
	private String payerId;

	public String payerId() { return payerId; }
	
	public UserInfo payerId(String payerId) {
	    this.payerId = payerId;
	    return this;
	}

	/**
	* The end user's preferred telephone number.
	*/
	@SerializedName("phone_number")
	private String phoneNumber;

	public String phoneNumber() { return phoneNumber; }
	
	public UserInfo phoneNumber(String phoneNumber) {
	    this.phoneNumber = phoneNumber;
	    return this;
	}

	/**
	* The URL of the end user's profile picture.
	*/
	@SerializedName("picture")
	private String picture;

	public String picture() { return picture; }
	
	public UserInfo picture(String picture) {
	    this.picture = picture;
	    return this;
	}

	/**
	* The subject ID for the end user at the issuer.
	*/
	@SerializedName("sub")
	private String sub;

	public String sub() { return sub; }
	
	public UserInfo sub(String sub) {
	    this.sub = sub;
	    return this;
	}

	/**
	* The ID of the end user at the issuer.
	*/
	@SerializedName("user_id")
	private String userId;

	public String userId() { return userId; }
	
	public UserInfo userId(String userId) {
	    this.userId = userId;
	    return this;
	}

	/**
	* The verified account status.
	*/
	@SerializedName("verified_account")
	private Boolean verifiedAccount;

	public Boolean verifiedAccount() { return verifiedAccount; }
	
	public UserInfo verifiedAccount(Boolean verifiedAccount) {
	    this.verifiedAccount = verifiedAccount;
	    return this;
	}

	/**
	* The end user's time zone.
	*/
	@SerializedName("zoneinfo")
	private String zoneinfo;

	public String zoneinfo() { return zoneinfo; }
	
	public UserInfo zoneinfo(String zoneinfo) {
	    this.zoneinfo = zoneinfo;
	    return this;
	}
}
