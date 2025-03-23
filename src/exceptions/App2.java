package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App2 {
	
	public static void main(String[] args) {

		method1();
		method2();

	}
	
	
	public static void method1() {
		
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
			System.out.println("Finally Block Executed!");
		}
	}
	
	
	
	public static void method2() {
		File file = new File("/Users/caiquesantos/Documents/Caique_Souza_IRPF_2022.docx");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
			System.out.println("Finally Block Executed!");
		}
	}

}
