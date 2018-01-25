// This class was generated on Thu, 25 Jan 2018 09:31:12 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// Name.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/7xUwY7TMBC98xUjX/YSrTjntoIbEiC0cEFoNU0m7WidcfBMgAjtv6PY2aRpWjiw6q1+fh2/9/yc3+5+6MiV7j225Ar3BSPjzlNals4V7h0Ny+ItaRW5Mw7iSnd/IBBsCUIDdiDoMNpw6wp3FyMOefDrwn0irD+IH1zZoFcage89R6pn4GMMHUVjUld+nSWpRZb9VhR6oyho9ND03j9IVr7oPL+/lZ7k3ijM/GTmFt6gwI4AYdcrC6kmvADh6jH/ChFQBgh2oJgTsAMaVCgSbPyvdp4NWCxAw1GtAI9q0/xn+9CMc5ZTkp7M+c8Mpff+qfhnkHv+QbLNbwVfji3RUhaTxRN3fFQKYAWEjqIGuZK5luva09bdGr9sL/MmU5+VAL0GsABqIRK0vTfuPB3zFFgq39cs+8m6xSBDy1WOCce+3Gixmn2dNLpIDf9aBTFDZzJIW0m0sXkqRt/LZV5Rt/bNqe4Z2urOW+ld2dFVXlVv3DRuwS63beLkmrTsp5Dhbizdo4SfAqjJ1LkPycWn9rfiTkeelrZdl7YNz6Wd+C8S5LenV38AAAD//w==
// DO NOT EDIT
package com.paypal.sdk.paypalsync;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The name of the party.
 */
@Model
public class Name {

    // Required default constructor
    public Name() {}

	/**
	* The party's alternate name. Can be a business name, nickname, or any other name that cannot be split into first, last name. Required for a business party name.
	*/
	@SerializedName("alternate_full_name")
	private String alternateFullName;

	public String alternateFullName() { return alternateFullName; }
	
	public Name alternateFullName(String alternateFullName) {
	    this.alternateFullName = alternateFullName;
	    return this;
	}

	/**
	* The party's given, or first, name. Required if the party is a person.
	*/
	@SerializedName("given_name")
	private String givenName;

	public String givenName() { return givenName; }
	
	public Name givenName(String givenName) {
	    this.givenName = givenName;
	    return this;
	}

	/**
	* The party's middle name. Use also to store multiple middle names including the patronymic, or father's, middle name.
	*/
	@SerializedName("middle_name")
	private String middleName;

	public String middleName() { return middleName; }
	
	public Name middleName(String middleName) {
	    this.middleName = middleName;
	    return this;
	}

	/**
	* The prefix, or title, to the party name.
	*/
	@SerializedName("prefix")
	private String prefix;

	public String prefix() { return prefix; }
	
	public Name prefix(String prefix) {
	    this.prefix = prefix;
	    return this;
	}

	/**
	* The suffix for the party's name.
	*/
	@SerializedName("suffix")
	private String suffix;

	public String suffix() { return suffix; }
	
	public Name suffix(String suffix) {
	    this.suffix = suffix;
	    return this;
	}

	/**
	* The party's surname or family name. Also known as the last name. Required if the party is a person. Use also to store multiple surnames including the matronymic, or mother's, surname.
	*/
	@SerializedName("surname")
	private String surname;

	public String surname() { return surname; }
	
	public Name surname(String surname) {
	    this.surname = surname;
	    return this;
	}
}
