package entities;

public class Employee {

	public String name;
	public double salary;
	public double tax;

	public double netSalary() {
		return this.salary -= this.tax;
	}

	public void increaseSalary(double encrease) {
		this.salary += encrease;
	}

	public String toString() {
		return name + ", " + "Salary: $ " + salary + " Salary with tax discount: " + String.format("%.2f", this.netSalary());
	}

}
