package com.nacre.ofd.dto;

public class ImageDTO {
	private String iid;
	private String iname;
	private String price;
	private String deliverycharges;
	private String discount;
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDeliverycharges() {
		return deliverycharges;
	}
	public void setDeliverycharges(String deliverycharges) {
		this.deliverycharges = deliverycharges;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getIid() {
		return iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
}
