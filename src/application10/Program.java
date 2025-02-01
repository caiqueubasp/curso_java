package application10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import application10.entities.Client;
import application10.entities.Order;
import application10.entities.OrderItem;
import application10.entities.Product;
import entities_enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Product product1 = new Product("Laptop", 11290.87);
		Product product2 = new Product("Fridge", 4290.24);
		OrderItem orderItem1 = new OrderItem(1, product1);
		OrderItem orderItem2 = new OrderItem(3, product2);

		Order order1 = new Order(sdf.parse("21/01/2025 13:05:44"), OrderStatus.PENDING_PAYMENT);
		order1.addOrderItem(orderItem1);
		order1.addOrderItem(orderItem2);
		order1.getOrders();

		Client client1 = new Client("Caique Souza", "caique@email.com", new Date());
		client1.setOrder(order1);

		System.out.println(client1.toString());

	}

}
