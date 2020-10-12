package com.nacre.ofd.vo;

public class PaymentVo {
	private String payment;
	private String cardname;
	private String cardnumber;
	private String validThru;
	private String cvv;
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getCardname() {
		return cardname;
	}
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getValidThru() {
		return validThru;
	}
	public void setValidThru(String validThru) {
		this.validThru = validThru;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
}