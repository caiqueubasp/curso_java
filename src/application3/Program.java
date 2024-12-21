package application3;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Enter Employee data: ");
		System.out.println();
		
		System.out.println("Enter Employee Name: ");
		employee.name = sc.nextLine();
		System.out.println("Enter Employee Gross Salary: ");
		employee.salary = sc.nextDouble();
		System.out.println("Enter Employee Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		System.out.println("Enter Employee Salary Encrease: ");
		double encrease = sc.nextDouble();
		employee.increaseSalary(encrease);
		
		System.out.println();
		System.out.println("Encreased Salary: " + employee);
		
		
		

		
	}

}
