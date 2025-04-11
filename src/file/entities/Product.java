package file.entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public Product() {

	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalValue() {
		BigDecimal valorBigDecimal = new BigDecimal(this.quantity * this.price).setScale(2, RoundingMode.HALF_UP);
		return valorBigDecimal;
	}

	public String toString() {
		return "Product: " + "Name: " + getName() + " " + "Price: " + getPrice() + " " + "Quantity: " + getQuantity()
				+ " ";
	}

}
