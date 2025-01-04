package vetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Task11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many employees will be registered?");

		int n = sc.nextInt();

		List<Employee> list = new ArrayList<Employee>();

		for (int i = 0; i < n; i++) {
			int num = i + 1;
			System.out.println("Employee #" + num);

			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine(); // Limpa o buffer após nextInt()

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			// Cria o objeto Employee e adiciona à lista
			Employee employee = new Employee(name, salary, id);
			list.add(employee);
		}

		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();

		Employee chosen = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (chosen == null) {
			System.out.print("This id does not exist! ");
		} else {
			double result = chosen.getSalary() + (chosen.getSalary() * percentage / 100);
			chosen.setSalary(result);
		}

		for (Employee x : list) {
			System.out.println(x.summary());

		}

		sc.close();

	}

}
