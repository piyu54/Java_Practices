package com.ops.Polymorphism;

public class OrderSystem {

	
	  void placeOrder(String product) {
	        System.out.println("Order placed for product: " + product);
	    }
	  
	  void placeOrder(String product,int quantity) {
	        System.out.println("Order placed for product : "+product +" And "+ "Quantity :"+  quantity);
	    }
	  
	  void placeOrder(String product,int quantity, double discount) {
		  
		    double price = quantity * 500;
	        double finalAmount = price - discount;
	        
	        System.out.println("Order placed for product: " + product);
	        System.out.println("Your Total bill Amount is : "+price + " And Discount Amount is: "+discount);
	        System.out.println("Final amount After Discount:"+finalAmount);
	    }
	  
	  public static void main(String[] args) {
		
		  OrderSystem o = new OrderSystem();
		  o.placeOrder("Laptop");
		  o.placeOrder("Mobile", 10);
		  o.placeOrder("Ipad ", 50, 100.5);
	}
}
