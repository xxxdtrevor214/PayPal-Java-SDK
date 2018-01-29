// This class was generated on Mon, 29 Jan 2018 12:12:03 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// ItemDetails.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/+yaX4/bNgzA3/cpCAPDWiB/2m3Y0Hs7tBvQDWuLrRgwdEXCSEzMVZZcib5LMOy7D/KfXBzbbYdd7+X0dLBIWSRN/sSL9Hf2+lBSdpE9FyrgGQmyCdks+x0948bQCyyiNJtlP9Ph5uEZBeW5FHY2u8he5wQc5+tm/iKbZZfe46F596NZ9iuhfmnNIbvYogkUB95X7EkfB155V5IXppBdvDla9YuzdBiag/qvKkhBVlZYuMpKz74x6dBgVXlPVh0ArYZGD7bOA8KWLVrFaOAKTUVzTwaFNGyZjF7Aj84D7bEoDc1ggwatInAeSjzENUFXdHsBCOLZ7oYR6KxfKaep5/25ZOj5G8k90Vzl6FEJeXj+28v5t18//v4mJnHu2wdL7VRYshXaeYwvWGr2pGTpKciyU55H5bB8CJKjAGuywlumAHIS5f8UEfHVWUBsZcw/s49Gpf5evWh0I8Mo1JIZXOescih4lwts6OLP6tGjb1Rl6r/UPBluni4t1LEgXydK61r01PA7gvVPr/5YN0FAT2CdgBxKVmjMAbYx1OwsmkXz0mX31rM1QJPiAs1xxvhar188O1krVBvNV6xJRwsdSO6qgFZLHsaXW3YexmSO38m3wQdbFRvy4LZHQ0qDikJbG70MmUEggjdPT8cCzGM+Qcyntw9ykTJcLJfX19cLDm7h/G7JwdXZNu8n0CKXwjy8jTx5e5IpEwDZYGC1CjmXJdvdGESmNBJIEkgSSO4fSJ7mpN65SuBl8+2HhdQqrFytEPq1NBT2E+nSAkZrY7w6ZWiVF/ADqrx9ghwDIFgsqAZOnX1nzn73GTDRd2AV1/+Qh53CCC773tWedNXD0bUjTjgIqxgQtHV7OYNQqRwwwFo54/w6wnIttJfK0/r/ovITyXDu55AUUxofD0XzLfv7gozode53sIH1xlTUhMOTXsdoGhqf2oXrZHIonJO8nc5laUjfTjQ/YSPWHFTcMce24KEsbb5p802bb+ri27SgvXj8YBc/pZFAkkCSQJJA0qbFjreyuvZYjjFkRJjwkfCR8JHw0aZFjlabiQ5kKEvwSPBI8EjwaNOCbah8LNwxeowIEz4SPhI+7h8+pjKF7ZVjRavG3TN6nIlGrm00Km2wFnBpAU2Zo60K8qygWXVQEAgbNrGtaYNZkFc5WrnlH+GnkClUjNKyN55AmUCZQJlA2aPGoHZORwdHsvWltigcAWCHvK8C7JzTIfIgkL9iRXd0FFmbrk9sHvjVF05e2jsO36XhgxPk09EJU6P0Lm0cO8o/E0xYejy6b+QbCt0JrMrjhhvA2boKyyqmUaBYftLNZgvBFdTep7xLj99XaIXlMHT5RDL0+QYhnT8aKssS4tCxPPAzFciH2oRoxar0rEaSrSdL7UJqF1K7cP/aBcH9ME0E9+0/En3498enr3AJ7ltiBDB0xaRhcwCEnbsib2sIjPD/vI8It3evawKRN/5MuJnAmMCYwHiPwPgp/0lFPJTkFVnBHQ3I0RMNs+dGPIP6LuuW96TnpWMrMwi8s6SPEex+l+qRQ9OWLQHC4yeLJ0++rFMr1hV4FKrvh9aC9d20meIEzWrqN6kxaSJqImoi6v0h6hf/AgAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.sync;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The item details.
 */
@Model
public class ItemDetails {

    // Required default constructor
    public ItemDetails() {}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("adjustment_amount")
	private Money adjustmentAmount;

	public Money adjustmentAmount() { return adjustmentAmount; }
	
	public ItemDetails adjustmentAmount(Money adjustmentAmount) {
	    this.adjustmentAmount = adjustmentAmount;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("basic_shipping_amount")
	private Money basicShippingAmount;

	public Money basicShippingAmount() { return basicShippingAmount; }
	
	public ItemDetails basicShippingAmount(Money basicShippingAmount) {
	    this.basicShippingAmount = basicShippingAmount;
	    return this;
	}

	/**
	* An array of checkout options. Each option has a name and value.
	*/
	@SerializedName(value = "checkout_options", listClass = CheckoutOption.class)
	private List<CheckoutOption> checkoutOptions;

	public List<CheckoutOption> checkoutOptions() { return checkoutOptions; }
	
	public ItemDetails checkoutOptions(List<CheckoutOption> checkoutOptions) {
	    this.checkoutOptions = checkoutOptions;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("discount_amount")
	private Money discountAmount;

	public Money discountAmount() { return discountAmount; }
	
	public ItemDetails discountAmount(Money discountAmount) {
	    this.discountAmount = discountAmount;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("extra_shipping_amount")
	private Money extraShippingAmount;

	public Money extraShippingAmount() { return extraShippingAmount; }
	
	public ItemDetails extraShippingAmount(Money extraShippingAmount) {
	    this.extraShippingAmount = extraShippingAmount;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("gift_wrap_amount")
	private Money giftWrapAmount;

	public Money giftWrapAmount() { return giftWrapAmount; }
	
	public ItemDetails giftWrapAmount(Money giftWrapAmount) {
	    this.giftWrapAmount = giftWrapAmount;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("handling_amount")
	private Money handlingAmount;

	public Money handlingAmount() { return handlingAmount; }
	
	public ItemDetails handlingAmount(Money handlingAmount) {
	    this.handlingAmount = handlingAmount;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("insurance_amount")
	private Money insuranceAmount;

	public Money insuranceAmount() { return insuranceAmount; }
	
	public ItemDetails insuranceAmount(Money insuranceAmount) {
	    this.insuranceAmount = insuranceAmount;
	    return this;
	}

	/**
	* The invoice number. An alphanumeric string that identifies a billing for a merchant.
	*/
	@SerializedName("invoice_number")
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public ItemDetails invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("item_amount")
	private Money itemAmount;

	public Money itemAmount() { return itemAmount; }
	
	public ItemDetails itemAmount(Money itemAmount) {
	    this.itemAmount = itemAmount;
	    return this;
	}

	/**
	* An item code that identifies a merchant's goods or service.
	*/
	@SerializedName("item_code")
	private String itemCode;

	public String itemCode() { return itemCode; }
	
	public ItemDetails itemCode(String itemCode) {
	    this.itemCode = itemCode;
	    return this;
	}

	/**
	* The item description.
	*/
	@SerializedName("item_description")
	private String itemDescription;

	public String itemDescription() { return itemDescription; }
	
	public ItemDetails itemDescription(String itemDescription) {
	    this.itemDescription = itemDescription;
	    return this;
	}

	/**
	* The item name.
	*/
	@SerializedName("item_name")
	private String itemName;

	public String itemName() { return itemName; }
	
	public ItemDetails itemName(String itemName) {
	    this.itemName = itemName;
	    return this;
	}

	/**
	* The item options. Describes option choices on the purchase of the item in some detail.
	*/
	@SerializedName("item_options")
	private String itemOptions;

	public String itemOptions() { return itemOptions; }
	
	public ItemDetails itemOptions(String itemOptions) {
	    this.itemOptions = itemOptions;
	    return this;
	}

	/**
	* The number of purchased units of goods or a service.
	*/
	@SerializedName("item_quantity")
	private String itemQuantity;

	public String itemQuantity() { return itemQuantity; }
	
	public ItemDetails itemQuantity(String itemQuantity) {
	    this.itemQuantity = itemQuantity;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("item_unit_price")
	private Money itemUnitPrice;

	public Money itemUnitPrice() { return itemUnitPrice; }
	
	public ItemDetails itemUnitPrice(Money itemUnitPrice) {
	    this.itemUnitPrice = itemUnitPrice;
	    return this;
	}

	/**
	* An array of tax amounts levied by a government on the purchase of goods or services.
	*/
	@SerializedName(value = "tax_amounts", listClass = Tax.class)
	private List<Tax> taxAmounts;

	public List<Tax> taxAmounts() { return taxAmounts; }
	
	public ItemDetails taxAmounts(List<Tax> taxAmounts) {
	    this.taxAmounts = taxAmounts;
	    return this;
	}

	/**
	* The percentage, as a fixed-point, signed decimal number. For example, define a 19.99% interest rate as `19.99`.
	*/
	@SerializedName("tax_percentage")
	private String taxPercentage;

	public String taxPercentage() { return taxPercentage; }
	
	public ItemDetails taxPercentage(String taxPercentage) {
	    this.taxPercentage = taxPercentage;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("total_item_amount")
	private Money totalItemAmount;

	public Money totalItemAmount() { return totalItemAmount; }
	
	public ItemDetails totalItemAmount(Money totalItemAmount) {
	    this.totalItemAmount = totalItemAmount;
	    return this;
	}
}
