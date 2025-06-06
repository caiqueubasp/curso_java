package application10.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private String name;
	private String email;
	private Date birthDate;
	private Order order;

	public Client() {

	}

	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + name + "\n");
		sb.append(" Email: " + email + "\n");
		sb.append(" Birth Date: " + sdf.format(birthDate) + "\n");
		sb.append(" Order: " + order + "\n");

		return sb.toString();
	}

}
