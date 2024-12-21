package application4;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter Student data: ");
		System.out.println();
		
		System.out.print("Enter the Student name: ");
		String name = sc.nextLine();
		student.name = name;
		
		System.out.print("Enter the Student grade 1: ");
		double grade1 = sc.nextDouble();
		student.grade1 = grade1;
		
		System.out.print("Enter the Student grade 2: ");
		double grade2 = sc.nextDouble();
		student.grade2 = grade2;
		
		System.out.print("Enter the Student grade 3: ");
		double grade3 = sc.nextDouble();
		student.grade3 = grade3;
		
        student.hasStudantPassed();
		
		System.out.println();
		System.out.println("Updated Student data: " + student);

	}

}
