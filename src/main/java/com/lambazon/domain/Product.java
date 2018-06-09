package com.lambazon.domain;

public class Product {
	
	private Integer id;
	private String name, description, details;
	private int quantity;
	private double price;
	private double totalInventoryPrice; //private double totalInventoryPrice added

	public Product(int id, int quantity, double price, String name, String description) {
		setId(id);
		setQuantity(quantity);
		setPrice(price);
		setName(name);
		setDescription(description);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		
		if (quantity < 1)
			this.quantity = 0; // condition - if quantity is under 1 unit the quantity is staying at 0.
		
		else {
			this.quantity = quantity; // for the other quantities the quantity indicated is true.
		}
		
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) { 
		
		if (price < 0)
			this.price = 0; //if price is under 0 price is staying at 0
		
		else if (price > 1000)
			this.price = 1000; // if price is more than 1000 price is capped at 1000 max.
		
		else {
			this.price = price; // other conditions the price is the price indicated.
		}
		
	}

	public double getInventoryPrice() {
		// TODO Auto-generated method stub
		totalInventoryPrice = price*quantity; //added function price*quantity
		return totalInventoryPrice;
	}
}
