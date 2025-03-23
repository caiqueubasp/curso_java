package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {

		method1();
	}

	public static void method1() {
		System.out.println("*** METHOD 1 START ***");
		method2();
		System.out.println("*** METHOD 1 END ***");

	}

	public static void method2() {
		System.out.println("*** METHOD 2 START ***");
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Type the Array:");
			String vect[] = sc.nextLine().split(" ");
			System.out.println("Type the Array Position:");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!");
			e.printStackTrace();
			sc.next();

		} catch (InputMismatchException e) {
			System.out.println("Input Error");
		}

		System.out.println("End of program");
		sc.close();
		System.out.println("*** METHOD 2 END ***");

	}
}
