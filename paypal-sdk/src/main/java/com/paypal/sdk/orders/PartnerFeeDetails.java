// This class was generated on Thu, 25 Jan 2018 12:44:28 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// PartnerFeeDetails.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/7xVQW/bRhO9f79iwIu/BCRluYED+FbECWAUSYTUaA+GYYx2h+IUy93t7NIKUfS/F0uRkmjZcJyohU6aeRrtezPz5q/suvOUXWQLlGhJ4AMRXFJENiHLs99QGJeGPmGTQFme/ULd7sslBSXsIzubXWTXNYEfylREEGuMwAGUM4ZUJA2VE4g1gRNesUUDUdAGVKlAmeXZzyLYbR50mmdfCPVna7rsokITKAX+bFlIbwMLcZ4kMoXs4mZL5V0rQlZ1h+/HxrU2TlhsQ4dclhgI1FAM3PIPUrGngMZAxRatYjRwj6alQshgT5HJ6FDCBydAX7HxhnJYokGrKAePXUM2gm4pB7QagoMXUo/SPsk8RGG7OuStdorsmO8FD7nfxFqIClWjoIokcPXr5+LN2fztThDlNN3+f6adCjO2kVaCqcBMs5CKM6EQZyO4SOAwe1XCArsFGtCOAlgXIbTeO4m9pgOaKfygIrY15u/8WVn6zk00GSOHgmzmJIfWQ3Tw+tNr0LziGACrJE+aak2KGzQQyKNgdJIDBtBUsSUNbOFmFPGlsm0XB70X54Ux0rQRxxDsdk+yBXZEh4oJKeJ7koloe8HHDKEjgnXtYICFnkjVWh36DahaU7ExYTAGTfKvrwM1yGZCYYwcvr/PAGotFAJgCE5xv+hrjnX/5p7hSRgnG5VKk1LCVbVJi7tnTfpBJd6M/8OCaLsHhfLdn4BCC86abtRyhP6OxlAc3SWUcNkPEyghzREUit4mASWNqmXSyYbSNPd55RpvONkUyEbdTa0ftOVvXMWGRNVo4x3rSWOm8UfaY5V0Psk3VQ2uLrdL02t3ZB79fsAlB2+wg48UUWPEQ179f9/pDe6u2eF2FJ+EHLIdQEU/AyPyuDyf356loNV3Nn3ZpzEJP+4DchJg2Qa2aQES8shNGduxqJ19xLxGif2Q3r39YeYJGzsJ0CPAts3yhT71XVL3oyzdXXL46e2eJh6732s3ud6nxU/z8/NiDsNPh/Ndx+jDxWym6Z5MelrpsfNoSuWaZ27Ups72RLlq4oZD+j+yj01DJhJtQ4fisC1GFfb7mfc3+n05P38zRNiuwBu0acUajDu51ut1ybEt2SY11Oy6+PL+XdH/tDg7nZ/O58XVq6Nwv/0G9t9/z/atQ0r4iF+5aRswZFexTjdqfvYWtmMUjsQoff73DwAAAP//
// DO NOT EDIT
package com.paypal.sdk.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The partner fee that is collected for the original transaction.
 */
@Model
public class PartnerFeeDetails {

    // Required default constructor
    public PartnerFeeDetails() {}

	/**
	* REQUIRED
	* The base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("amount")
	private Currency amount;

	public Currency amount() { return amount; }
	
	public PartnerFeeDetails amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* REQUIRED
	* The payee who receives the funds and fulfills the order.
	*/
	@SerializedName("receiver")
	private Payee receiver;

	public Payee receiver() { return receiver; }
	
	public PartnerFeeDetails receiver(Payee receiver) {
	    this.receiver = receiver;
	    return this;
	}
}
