package com.chapter3;

public class Invoice {
	private String number;
	private String description;
	private int itemQuantity;
	private double pricePerItem;
	
	public Invoice(String number, String description, int itemQuantity, double pricePerItem) {
		this.number = number;
		this.description = description;
		this.itemQuantity = itemQuantity;
		this.pricePerItem = pricePerItem;
	}

	public Invoice() {
		// TODO Auto-generated constructor stub
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		if(itemQuantity < 0) {
			this.itemQuantity = 0;
		}
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		if(pricePerItem < 0) {
			this.pricePerItem = 0.0;
		}
	}

	public double getInvoiceAmount() {
//		return itemQuantity * pricePerItem;
		double invoiceAmount = itemQuantity * pricePerItem;
		return invoiceAmount;
				
	}




	
}
