package com.encapsulation;

/*4. Create a class Car with private fields brand and price.
Provide setters and getters and print details.**
*/
public class Car {

	
	private String brand;
	private int price;
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
}
