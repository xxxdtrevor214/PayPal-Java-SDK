// This class was generated on Mon, 22 Jan 2018 14:30:02 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// Refund.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/+xYT3PbuA6/v0+BUd+hydhS+tK/uWWm7009r7vNJO5eshkbpmCLG4pUSSiOZ6fffYeiZEuW26bTrLcHnzwCQBrADwR/xJ/ReFVQdBZZmpc6jQbRb2glzhT9irmXR4Po/7TafLwlJ6wsWBodnUXnENYBW9QOhRfH0SA6txZXYeeTQXRJmH7QahWdzVE58oJPpbSUrgUX1hRkWZKLzq7XPmFuSs19n9byjWdrUde/cUZQ4ConzRBMBrCUnMHMEt4Oy8I9nreOrdSLvreitJa0WHX8bQn7Hl9zZomGIkOLgsnC6OrD8Pl/nr2CZhkIk9LN0yQ1wiVSMy0s+g2SVFoSnFhynDTGQ2/skqMYLnB1gQpSQw60YXBlURjLgEo1W0v6vpSwLbcyokulPg+2QJykxCiV66dno9hkZyPrJwfTVPpPH0cwA5yZkoF7WP/92C7knCdLi0XH/ba0H4DXgtfCnCiGX/Be5mUOivSCM5AOnp3AGno3gGUmRQZSC1Wm5M5+L09OTkWpql8KX0qGryu6Iw2pXEh2MKO5sVSlJSUhc1RQGKk5DmuSZlF3i/F3mi9N838496X6wL9LmgB+EKKtYvsSThnqVEm9mMyJOlBtKfpoNQYHsLzLoV9QCnMTVtcdpTl3OXFmUjBareL9ICu1Ky1q0YW1Le1jutYeQO2A6mH7OrJ7AtVlsiiCZoNpS9iHtFEeEN1bT21SPkmlEz1Ctkv7ddigsTycyJ+vzbpyxoZRdTHeCHdAWytrLrYORTLlLobRvPqy9Kkkx2soQUld2wyAM+mgCM6ufBUcH9s6luPjwynfC/CM9x3Mw3cfbsb7AyKPgMjNQzDpncQvH8POGfRQLCgFNs1riQhmq/WHjeF/xtZvejcAS4UlR5pdZVLvwhlya31t3WxqrFxIHZqV3/BQEz/6ln5ISQgsuLQ0kWl3zNAW94tj9BZM6MMOFbWHODAjfy0HbGlfvE9YQqYJy7xL57vyfhwpMgHqFLwFLDPS9eVSzaaW6CDskA5AargeaSaribfWzY3NkW+eZsyFO0sSNka5WBLPY2MXSca5SuxcnJ6evnniqErT8EX88mhPyUlbYXeHJW15Pzl1Flpm+3qadWvxmzW4Y5S4q3u8anWPvT0y74wUNNFlPiO79dLcUu16blYm4AmQRXHrD9boLYQVjxyBkvp20oJ6YmZ/kNgxQ/WG3aFbI9ma8GpA754HqSZrQ0vKHya4fnc+/u+H8yuoljbjSCxkYu7I3klaJk8yZDLohpXJ9lF5+fgTuczSvDvhCYI+LMLkhSL21MUuiOHj5fsYxgZyvKW6HkOYApUaePOZ56ZeU/PvapJckVQfXegtHy9HwJQXfulDO8rLF69OjmIYhSuw+ofpv6cDmD6dDqr2ND2atoq+otKFpWFhjSDnpF7E4COa+lin/pD4LW5pBQ1APlajqbm8KzAA1ykIMYZ40DN355H2hAGV2tMZCzntQLcW9cF7Nx5fNDA0bwLPQHaCt6cILHVJWfjeMd736Q8O+puWVwV9s0RevHn9en3pPD9qWJMje0cO0AFq31N8ZWAFbwC61JjP5KI0pVOr+gqYUagPRzlqlsI1/dcvi+GKCK7f+x0uaw/dxrvlchlL1Fj5hs7JhfYPUpf4tcMmpO3P+N6H8Tj35EPIUIGWNE/q13IHk57qaxdS89w2uk53ddbbLEk6mKHbGz+yhG7r9l+Ldl38XrWh69uO/xMMz/PMbZK6kf38DNUxcpebNpIdExCv6ZKbPXlZFulOHt2VfwePdqa0giomrdAxhI1+Yjp98/lffwEAAP//
// DO NOT EDIT
package com.paypal.sdk.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A refund transaction.
 */
@Model
public class Refund {

    // Required default constructor
    public Refund() {}

	/**
	* The payment amount, with break-ups.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Refund amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The ID of the sale transaction being refunded.
	*/
	@SerializedName("capture_id")
	private String captureId;

	public String captureId() { return captureId; }
	
	public Refund captureId(String captureId) {
	    this.captureId = captureId;
	    return this;
	}

	/**
	* The date and time when the refund was created, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Refund createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The refund description.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public Refund description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The ID of the refund transaction. Maximum length is 17 characters.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Refund id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The invoice or tracking ID number.
	*/
	@SerializedName("invoice_number")
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public Refund invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Refund links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The ID of the payment on which this transaction is based.
	*/
	@SerializedName("parent_payment")
	private String parentPayment;

	public String parentPayment() { return parentPayment; }
	
	public Refund parentPayment(String parentPayment) {
	    this.parentPayment = parentPayment;
	    return this;
	}

	/**
	* The reason that the transaction is being refunded.
	*/
	@SerializedName("reason")
	private String reason;

	public String reason() { return reason; }
	
	public Refund reason(String reason) {
	    this.reason = reason;
	    return this;
	}

	/**
	* The ID of the sale transaction being refunded.
	*/
	@SerializedName("sale_id")
	private String saleId;

	public String saleId() { return saleId; }
	
	public Refund saleId(String saleId) {
	    this.saleId = saleId;
	    return this;
	}

	/**
	* The state of the refund.
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public Refund state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Refund updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
