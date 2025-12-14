package com.encapsulation;

public class ProductDetails {

	public static void main(String[] args) {
		
		
		Product p=new Product();
		
		p.setProductName("MAKEUPKIT");
		p.setPrice(10000);
		p.setDiscount(50);
		
		System.out.println("Product name:"+p.getProductName());
		System.out.println("Product price :"+p.getPrice()+"RS");
		System.out.println("You get discount :"+p.getDiscount()+"%");
		System.out.println("After discount your price is :"+p.calculateFinalPrice()+"RS");
	}

}
