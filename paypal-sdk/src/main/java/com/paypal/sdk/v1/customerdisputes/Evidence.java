// This class was generated on Mon, 09 Apr 2018 16:10:52 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// Evidence.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/8xXW2szNxB9768Yti8t+BIwDdRvAffBtKQhTfqSBiNLs141WmkzmrXrlv73or15L7b7QRzzvSTszNg6Z87Msfaf6GmfYTSPftpqhVZiNIp+F6TF2uC9SEMmGkU/4/7wsEAvSWesnY3m0R2kSDIRlsfgCGTu2aVIY5+vU82MCrD6ZlBO5ilankSj6I5I7Mujb0bRIwr1qzX7aB4L4zEE3nNNqJrAA7kMiTX6aP7SgPZM2m6GkJVg7MCuAl3oTwlCSICwClinOAJt4WVpGckid3MQO0oFv36XMGd+Pp2yc8ZPNHI8cbSZJpyaKcVyNpv9+K1HGc4Y/zC5/X4Cv6F0VnkQhEAVMdgl2iDEJIpKYcC3qlxWBid/5Dc3M7k2Tr69546xeC7/Ss/k7KaM3DvGeRmetuMQOBJuciMI8K+M0HvtLGTkgioeNrlWIoizzhmUQw/WMRD+iZJBGAPaboXRqmiGr/BM+4A+KKjNjfl31Ki6qObkiK5VxnfFbUV7w2lBBFzg4mb6PHAiGHZICIchFb6Z09543l5+PG3412ZQBY6MZwUaQsXksm0+hc7rv7voqsAZdKHiSuhyMh1w5fMZbM+Py4tAe22Bq80Slra0hXDuAGo9UCttY9cB3c8M4dcVY0IjwoDqw0mf75+EcW7VSqvuonXCpzetLIPlwgfTBE4QmIT1pdUFR3FmW1ACTrQHpX2W84f3rjdATyTkm7ab8xpxVTXUqJ85x9fgVliG+iNtsa7agv9XVgoijbQaWFAvMZzIkAhsA5equOHmE50Vy1bl21wLt9UehPdO6mKWd5qTc7w/yzsaSW2erpGOy93khi1o9C1rhvSPaf018e6bZy8xZPz8+AuwK4kXzDRj2vC9kK++fgGFxjE51B310ipzRLZ9VkzuiR/4z+p6aNVKqw7YQ2wIc7mo1ydUXQmkdYxdk68jfb/bD3+TitJr3UpcTrJ3L6lDw16WqbqfjfCwtErLcJOFXYKcIMGD2D8IU9zL0QdS7Q+MSrer3mla18VuUbX19YvQiboLbcs3/wEAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.customerdisputes;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A merchant- or customer-submitted evidence document.
 */
@Model
public class Evidence {

    // Required default constructor
    public Evidence() {}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("date")
	private String date;

	public String date() { return date; }
	
	public Evidence date(String date) {
	    this.date = date;
	    return this;
	}

	/**
	* An array of documents that were submitted as evidence.
	*/
	@SerializedName(value = "documents", listClass = Document.class)
	private List<Document> documents;

	public List<Document> documents() { return documents; }
	
	public Evidence documents(List<Document> documents) {
	    this.documents = documents;
	    return this;
	}

	/**
	* The evidence-related information.
	*/
	@SerializedName("evidence_info")
	private EvidenceInformation evidenceInfo;

	public EvidenceInformation evidenceInfo() { return evidenceInfo; }
	
	public Evidence evidenceInfo(EvidenceInformation evidenceInfo) {
	    this.evidenceInfo = evidenceInfo;
	    return this;
	}

	/**
	* The type of evidence.
	*/
	@SerializedName("evidence_type")
	private String evidenceType;

	public String evidenceType() { return evidenceType; }
	
	public Evidence evidenceType(String evidenceType) {
	    this.evidenceType = evidenceType;
	    return this;
	}

	/**
	* The ID of the item.
	*/
	@SerializedName("item_id")
	private String itemId;

	public String itemId() { return itemId; }
	
	public Evidence itemId(String itemId) {
	    this.itemId = itemId;
	    return this;
	}

	/**
	* Any evidence-related notes.
	*/
	@SerializedName("notes")
	private String notes;

	public String notes() { return notes; }
	
	public Evidence notes(String notes) {
	    this.notes = notes;
	    return this;
	}

	/**
	* The source of the evidence. Indicates whether PayPal requested the evidence, the customer submitted the evidence, or the merchant submitted the evidence.
	*/
	@SerializedName("source")
	private String source;

	public String source() { return source; }
	
	public Evidence source(String source) {
	    this.source = source;
	    return this;
	}
}
