package entities;

public class Employee {

	public String name;
	public double salary;
	public double tax;
	private int id;

	public Employee(String name, double salary, double tax, int id) {
		this.name = name;
		this.salary = salary;
		this.tax = tax;
		this.id = id;
	}

	public Employee(String name, double salary, int id) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double netSalary() {
		return this.salary -= this.tax;
	}

	public void increaseSalary(double encrease) {
		this.salary += encrease;
	}

	public String toString() {
		return name + ", " + "Salary: $ " + salary + " Salary with tax discount: "
				+ String.format("%.2f", this.netSalary());
	}
	
	public String summary() {
		return " " + id + ", " + name + ", " + salary;
	}

}
