package com.paypal.api.payments;

import java.util.List;

import com.paypal.base.rest.PayPalModel;

public class CreditCardHistory  extends PayPalModel {

	/**
	 * A list of credit card resources
	 */
	private List<CreditCard> items;
	
	/**
	 * Total number of items.
	 */
	private int totalItems;

	/**
	 * Total number of pages.
	 */
	private int totalPages;
	
	/**
	 * HATEOAS links related to this call. Value assigned by PayPal.
	 */
	private List<Links> links;

	/**
	 * Default Constructor
	 */
	public CreditCardHistory() {
	}


	/**
	 * Setter for creditCards
	 */
	public CreditCardHistory setItems(List<CreditCard> creditCards) {
		this.items = creditCards;
		return this;
	}

	/**
	 * Getter for creditCards
	 */
	public List<CreditCard> getItems() {
		return this.items;
	}
	
	public int getTotalItems() {
		return totalItems;
	}


	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}


	public int getTotalPages() {
		return totalPages;
	}


	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}


	public List<String> getLinks() {
		return links;
	}


	public void setLinks(List<String> links) {
		this.links = links;
	}


}
