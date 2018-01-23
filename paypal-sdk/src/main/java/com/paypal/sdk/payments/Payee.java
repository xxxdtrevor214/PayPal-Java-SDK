// This class was generated on Mon, 22 Jan 2018 14:30:02 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// Payee.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/7xVT2vbThC9/z7FsJf8ApZkpyUF30qTgyltQxraQwhmvDu2Flaz6uwqrij57mXlf5GdkNKaHPXmj+a92X37S920NamxqrElUgP1DcXizNFnrBKsBuojtbuPCwpabB2tZzVWNyVBVwjL0oOQJntPAWJJMG/YBEA2MG/c3Dq3gr0YklwN1HsRbFf/Hg7UNaH5wq5V4zm6QAn40VghswWuxNck0VJQ49vt1CGK5cXh2FShdb3ZN8ghgS4CaIxQCIAheG0xkoGljWU3dEfxJMAVtlfoALX2DcccJvNVWPy9NWT2OtkA7ONBQ+R2r9Fg9xPQyODZtRsxN6nf0TmKKakijiGHCyukI2ghYyNoFLMNAgqBIbZkwDQE0a/i2le1s8iaQFbyrnr94za4ce5h8OJKKhJdIsepNb3F9PEn1sNa2jrJ11cNJhcw97LT7sg8up5TY0PtsJ1WFNFgxENez+btKD6bcsh2nZR1Z2CTeVyeL9+emSCbKaePxzR68NNGICcBZk2wnC5AyjzyUjYa1qXnJ9xqP7ybfT/yjI+dBOgygJtq9hpG1R1laafam/7Ae4HDeW/j0me6REEdSWDydZi9GZ2fZyNYl0Iqvfu/jLEO46IwdE8ujZbX2Nbocu2rwngdCsuRFoKpd2E6WymEQizWfbLUJxSn4Oc9N1yHX8k+VgvpSbSFDsWxnG1UeLzPAViG28t8dP52jVheQO2Q0xWrMO7kWi6XuY1NbjmpoYub7PryQ9aVZmfD0XA0yianR+F+9wfs//49e2wdksMn/GmrpgJHvIhleqNGZ+9ge4zCkRjdPfz3GwAA//8=
// DO NOT EDIT
package com.paypal.sdk.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The payee who receives the funds and fulfills the order.
 */
@Model
public class Payee {

    // Required default constructor
    public Payee() {}

	/**
	* The email address associated with the payee's PayPal account. If the provided email address is not associated with any PayPal account, the payee can only receive PayPal Wallet payments. Direct credit card payments are denied due to card compliance requirements.
	*/
	@SerializedName("email")
	private String email;

	public String email() { return email; }
	
	public Payee email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* The encrypted PayPal account ID for the payee.
	*/
	@SerializedName("merchant_id")
	private String merchantId;

	public String merchantId() { return merchantId; }
	
	public Payee merchantId(String merchantId) {
	    this.merchantId = merchantId;
	    return this;
	}

	/**
	* The display-only metadata for the payee.
	*/
	@SerializedName("payee_display_metadata")
	private PayeeDisplayMetadata payeeDisplayMetadata;

	public PayeeDisplayMetadata payeeDisplayMetadata() { return payeeDisplayMetadata; }
	
	public Payee payeeDisplayMetadata(PayeeDisplayMetadata payeeDisplayMetadata) {
	    this.payeeDisplayMetadata = payeeDisplayMetadata;
	    return this;
	}
}
