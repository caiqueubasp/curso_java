package entities;

import java.util.Date;

public class Order {
	
	private Date date;
	private ProductsV2 product;
	
	public Order(Date date, ProductsV2 product) {
		super();
		this.date = date;
		this.product = product;
		this.product.name = "TV";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ProductsV2 getProduct() {
		return product;
	}

	public void setProduct(ProductsV2 product) {
		this.product = product;
	}
	
	
	
	
	

}
