// This class was generated on Mon, 29 Jan 2018 12:12:00 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// TemplateSettings.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/6yRT0sDQQzF736KMOdFPPcmeBHxD1q8iLTpTrYTmM2MmZSySL+7bP+6rIJgj/OSSX4v79NNu0xu4qbU5ohG8EJmLMviKveKyriI9IBt3+Iqd0fd6XFDpVbOxkn6AYHADkPKfsilq9y1Kna7LVeVeyb0jxI7N2kwFuqFjxUr+aPwpCmTGlNxk7ff+eCeDD0ajkE9lxyxm2WlhpSkpgH6j+U/mIF2v/F8rhYpRUIZWwjsPckA+ygNUW/Fc41GBdaBLJCCBS7QMEUPXGD37b/Isopx876pjuTFlGU5Bt/unUn/+A4/kMe33tH2ZWiSAkp3MCAwPwQx628/3zasA9cBLEGLGeqkSiUn8SxL2KcLp3TLmcxffAEAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The template settings.
 */
@Model
public class TemplateSettings {

    // Required default constructor
    public TemplateSettings() {}

	/**
	* The template settings metadata.
	*/
	@SerializedName("display_preference")
	private TemplateSettingsMetadata displayPreference;

	public TemplateSettingsMetadata displayPreference() { return displayPreference; }
	
	public TemplateSettings displayPreference(TemplateSettingsMetadata displayPreference) {
	    this.displayPreference = displayPreference;
	    return this;
	}

	/**
	* The field name for any field in `template_data` for which to map corresponding display preferences.
	*/
	@SerializedName("field_name")
	private String fieldName;

	public String fieldName() { return fieldName; }
	
	public TemplateSettings fieldName(String fieldName) {
	    this.fieldName = fieldName;
	    return this;
	}
}
