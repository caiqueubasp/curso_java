package application10.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities_enums.OrderStatus;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private OrderStatus status;
	private OrderItem orderItem;

	private List<OrderItem> orderItems = new ArrayList<>();

	public Order() {

	}

	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public Order(Date moment, OrderStatus status, OrderItem orderItem) {
		this.moment = moment;
		this.status = status;
		this.orderItem = orderItem;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public OrderItem getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}

	public List<OrderItem> getOrders() {
		return orderItems;
	}

	public void addOrderItem(OrderItem orderItem) {
		orderItems.add(orderItem);
	}

	public void removeOrderItem(OrderItem orderItem) {
		orderItems.remove(orderItem);
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("Status: " + status + "\n");
		sb.append(" Date - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Items: " + "\n");
		sb.append("Products " + "\n");
		for (OrderItem c : orderItems) {
			sb.append(c.toString() + "\n");
		}

		return sb.toString();
	}

}
