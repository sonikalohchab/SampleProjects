package com.prep.Vending;

public enum Item {
	COKE("Coke",25),PEPSI("Pepsi",35),SODA("Soda",30);
	
	private int price;
	private String name;
	
	private Item(String name, int price)
	{
		this.name=name;
		this.price=price;
	}
	
	public String getName()
	{
		return name;
	
	}
	public long getPrice()
	{
		return price;
	
	}

}
