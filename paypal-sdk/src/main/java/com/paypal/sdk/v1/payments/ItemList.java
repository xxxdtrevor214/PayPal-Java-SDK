// This class was generated on Mon, 29 Jan 2018 12:12:02 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// ItemList.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/8xYX3MbuQ1/76fAqC/xjP7YSpqb8Vvi5tI0zVljWe2Dm5EhLqRlvSI3JDbyptOZfo1+vX6SDshdadcr96ycR3cvthYESPxIEPiB/+xdlzn1znuaaT3PtOdev/dXdBoXGf2Eaxnq9Xsfqdx9/JG8cjpnbU3vvPfGADqHJdglyCQeOEUGdAQL0mYFeeFUip6SYa/feyOqccnTfu+KMLk0Wdk7X2LmSQRfCu0o2QomzubkWJPvnd+0nO36GVZvOVtLnsnj19/vsWenzarrsyqcI6PKltsNYdvz65TghlNHNFApOlRMDj5MLwevxmc/QG0Gyib0+cUoscqPtGFaOZQJRol2pHjkyPOoVh6Ish+d/NLDMUWW/av/s3iTBp4m5La8i1rOCRpKQ5gWeW4dUwLWZCUsrQNOCSZYTjCDHMs1GYY1cWqTI4Ez8q+JqhI8AkdGh/AJ7/W6WENGZsUpaA9n4x9ge7z+SL7nTqu287XkEe+V9bzX+9PjO/+lQMOa27eoIXwEQq3xW4Hh74oWgvjddd6zVXdwR5RLtiqMZngx/Tg72V4CQXcknxnvWz7H70c2nPH+N3lxC5e1QMTvLojZ1V+AbcSizdK6NcZk9OYr6kwmlGFBk2NJDrQJH+zQeFSiCqn2bF35LMA+N6GlOpdwmGOSOPJ+T3R1NRqh1h3swqd7JpNQApVSHzapVuG6FF7EPsCt56rVZBuwPtjnIwGPltSHiUA9lgRkIGbh44SZsoVhV86l5LY9bA/sK/ob2y758PLs9evB2dNqfZy+LvWR7uiEDOulpnholQ5YB45WEtR/L05PX6pFZtXdl8Iyhe/4V3l21qyi5CfLdB7Fo6YcrhvTytLhqr93hAxvnWbURiInWsp4NHv/tpprJwI0CRjLHd3Zxz26VTDWd8/mg4y+UgaJXcuSct6+yjrItYNDmHkKBrcX49uu2xepNggb67JkoyuZsuscXbj1hVHWsLNZRgmEwgkvLmaTkyqN9WGB5g4UuqQfwChnvR8srEvINdODr3Z99HDbDwlQdsX3xWemDZ21ArOWdCNyqZ1nkHGh0bJx1W0fwo/WAd3jOs+oD6ZYL8j1wbMj4ojeW7BmeDRI4w6kcQfSZfiB2TBErSdlTfIEdL7QTH3AHB2HslXD/T6Yv4B6Si3K9Ldw+eeekYt2gn9EoXuwddJuGUA0GMIVceFMs3aHSudh6ewa3jr8prNjMdbUmgeMtZJ0QYWR7eFoAzfvhmfjlxBL+OcXKXPuz0ejzWYz1FwMtZHUqUbXg6t3F4OgOxifnp6djgcfRmRO9jHGP/wKjDG3njHrFpS2fM9+hPGQ3hpFXOL8m85j1pMw/1Lor5hJ1YbrMtcKs6wEV/ld5UBJlFJENppTKfO7mWUKNK1ZpkRwM9mp7HaezHCj73ROicahdauRfI0mOxzH6lAdKZ1rMjzvtHOdoe7GykCdMrbqgAycar9NIkdqJxi5DaCW7CEYT+ERwXzLIuT4EWbTkBvCYQvo3WkHBcspNaJEEkgjepqVD3Qr0Uo8agN2m4E97aY5h5s3biX8xeAhTv8ea6uTPtzEbHWQ/SKYiPEFGkwOW1wFEzH+YBJ9mK0Wi2DKmJWHmYqFmP4ZczQHmf5DLMT0E91rZQ+yXQcTMb5OpTkyyUHmXBmd9CWybmZGS8c4FRV/0ESFx73p+tUpeG1WGQ0WJdOv0Ox3a/QTqnJVh4/U28twq7mPgq57MiD3dD9Luv3T5ad388ur+d8urz7e9uH2/Ycfr2+fmyR9fsqm121u5OX7W+Dt2J6Xl7q1jTqx04i9hPZ1iyu0UKXSiMymkylM0Ck6FinaggiMZx4Zz36YDzT+D9gOe9LsQaGxRigByDV0BiOBriiVoE9oqYUqLsqQ2IVyvX71cxU/KJ1Ui4XFMzRDeGcEpIc1OZWiYQ9swafoqqeW//77Px6kB0NVk/DISKpnpfqVKT578/Y1AmIvYwIfaVnXFvElZ5NaSRrovVUaJRWF2R++7qz1KmVYxE7SCxdAL/kr0cslhYUDTw595t6DuIUF+kCvd4sHbNUC1lSInunK/O5/AAAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * An array of items that are being purchased.
 */
@Model
public class ItemList {

    // Required default constructor
    public ItemList() {}

	/**
	* An array of items that are being purchased.
	*/
	@SerializedName(value = "items", listClass = Item.class)
	private List<Item> items;

	public List<Item> items() { return items; }
	
	public ItemList items(List<Item> items) {
	    this.items = items;
	    return this;
	}

	/**
	* The extended address, which is used as the shipping address in a payment.
	*/
	@SerializedName("shipping_address")
	private ShippingAddress shippingAddress;

	public ShippingAddress shippingAddress() { return shippingAddress; }
	
	public ItemList shippingAddress(ShippingAddress shippingAddress) {
	    this.shippingAddress = shippingAddress;
	    return this;
	}

	/**
	* The shipping method used for this payment, such as USPS Parcel.
	*/
	@SerializedName("shipping_method")
	private String shippingMethod;

	public String shippingMethod() { return shippingMethod; }
	
	public ItemList shippingMethod(String shippingMethod) {
	    this.shippingMethod = shippingMethod;
	    return this;
	}

	/**
	* The shipping phone number, in its canonical international format as defined by the [E.164](https://en.wikipedia.org/wiki/E.164) numbering plan. Enables merchants to share payer’s contact number with PayPal for the current payment. The final contact number for the payer who is associated with the transaction might be the same as or different from the `shipping_phone_number` based on the payer’s action on PayPal.
	*/
	@SerializedName("shipping_phone_number")
	private String shippingPhoneNumber;

	public String shippingPhoneNumber() { return shippingPhoneNumber; }
	
	public ItemList shippingPhoneNumber(String shippingPhoneNumber) {
	    this.shippingPhoneNumber = shippingPhoneNumber;
	    return this;
	}
}
