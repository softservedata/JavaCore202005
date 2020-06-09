package com.softserve.homework5;

public class Product {
	
	private String name;
	private double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Product() {
			}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) && (getClass() != obj.getClass())) {
			return false;
		}
		
		Product other = (Product) obj;
		if ((Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price) ||
				((name == null) && (other.name != null)) ||
				(name != null) && (other.name == null))) {
				return false;
				} 
			return name.equals(other.name);
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}
