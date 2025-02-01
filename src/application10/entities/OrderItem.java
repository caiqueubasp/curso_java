package application10.entities;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class OrderItem {

	private int quantity;
	private double price;
	private Product product;
	private List<Product> products = new ArrayList<>();

	public OrderItem() {

	}

	public OrderItem(int quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
		for (int i = 0; i < quantity; i++) {
			this.products.add(product);
		}
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subTotal() {
		double total = this.quantity * this.product.getPrice();
		BigDecimal bd = new BigDecimal(Double.toString(total));
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		double resultado = bd.doubleValue();
		return resultado;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void removeProduct(Product product) {
		products.remove(product);
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("Quantity: " + quantity + "\n");
		sb.append(" Subtotal - " + subTotal() + "\n");
		for (Product prod : products) {
			sb.append(prod.getName() + "\n");
			sb.append("Price: " + prod.getPrice() + "\n");
		}

		return sb.toString();
	}

}
