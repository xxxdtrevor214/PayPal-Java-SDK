package com.paypal.api.payments;

import com.paypal.base.rest.PayPalResource;

import java.util.List;

/**
 * @deprecated PaymentInstruction object is not available for public use.
 */
public class PaymentInstruction extends PayPalResource {

	/**
	 * ID of payment instruction
	 */
	private String referenceNumber;

	/**
	 * Type of payment instruction
	 */
	private String instructionType;

	/**
	 * Recipient bank Details.
	 */
	private RecipientBankingInstruction recipientBankingInstruction;

	/**
	 * Amount to be transferred
	 */
	private Currency amount;

	/**
	 * Date by which payment should be received
	 */
	private String paymentDueDate;

	/**
	 * Additional text regarding payment handling
	 */
	private String note;

	/**
	 * 
	 */
	private List<Links> links;

	/**
	 * Parameterized Constructor
	 */
	public PaymentInstruction(String referenceNumber, String instructionType, RecipientBankingInstruction recipientBankingInstruction, Currency amount) {
		this.referenceNumber = referenceNumber;
		this.instructionType = instructionType;
		this.recipientBankingInstruction = recipientBankingInstruction;
		this.amount = amount;
	}


	/**
	 * Setter for referenceNumber
	 */
	public PaymentInstruction setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
		return this;
	}

	/**
	 * Getter for referenceNumber
	 */
	public String getReferenceNumber() {
		return this.referenceNumber;
	}


	/**
	 * Setter for instructionType
	 */
	public PaymentInstruction setInstructionType(String instructionType) {
		this.instructionType = instructionType;
		return this;
	}

	/**
	 * Getter for instructionType
	 */
	public String getInstructionType() {
		return this.instructionType;
	}


	/**
	 * Setter for recipientBankingInstruction
	 */
	public PaymentInstruction setRecipientBankingInstruction(RecipientBankingInstruction recipientBankingInstruction) {
		this.recipientBankingInstruction = recipientBankingInstruction;
		return this;
	}

	/**
	 * Getter for recipientBankingInstruction
	 */
	public RecipientBankingInstruction getRecipientBankingInstruction() {
		return this.recipientBankingInstruction;
	}


	/**
	 * Setter for amount
	 */
	public PaymentInstruction setAmount(Currency amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Getter for amount
	 */
	public Currency getAmount() {
		return this.amount;
	}


	/**
	 * Setter for paymentDueDate
	 */
	public PaymentInstruction setPaymentDueDate(String paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
		return this;
	}

	/**
	 * Getter for paymentDueDate
	 */
	public String getPaymentDueDate() {
		return this.paymentDueDate;
	}


	/**
	 * Setter for note
	 */
	public PaymentInstruction setNote(String note) {
		this.note = note;
		return this;
	}

	/**
	 * Getter for note
	 */
	public String getNote() {
		return this.note;
	}


	/**
	 * Setter for links
	 */
	public PaymentInstruction setLinks(List<Links> links) {
		this.links = links;
		return this;
	}

	/**
	 * Getter for links
	 */
	public List<Links> getLinks() {
		return this.links;
	}

}
