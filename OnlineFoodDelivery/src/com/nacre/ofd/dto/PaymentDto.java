package com.nacre.ofd.dto;

public class PaymentDto {
	private String payment;
	private String cardName;
	private long cardNumber;
	private String validThru;
	private int cvv;
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getValidThru() {
		return validThru;
	}
	public void setValidThru(String validThru) {
		this.validThru = validThru;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
}