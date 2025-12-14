package com.encapsulation;

/*
5. Create a class Product using encapsulation and calculate discount using getter and setter methods*/
public class Product {

	private String productName;
	private double price;
	private double discount;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("price must be greater then 0 ");
		}
	}

	public double getDiscount() {

		return discount;

	}

	public void setDiscount(double discount) {
		if (discount > 0 && discount < 100) {
			this.discount = discount;
		} else {
			System.out.println("Your amount should be more than 0 for avail discount");
		}

	}

	public double calculateFinalPrice() {
		return price - (price * discount / 100);
	}

}
