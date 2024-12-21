package application2;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Products product = new Products();
		System.out.println("Enter Product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		
		System.out.println("Product data: " + product); 
		
		System.out.print("Enter the number of products to be ADDED in stock: ");
		int quantityToAdd = sc.nextInt();
		product.addProducts(quantityToAdd);
		
		System.out.println();
		System.out.println("Updated data: " + product); 
		
		
		System.out.print("Enter the number of products to be REMOVED in stock: ");
		int quantityToRemove = sc.nextInt();
		product.removeProducts(quantityToRemove);

		
		System.out.println();
		System.out.println("Updated data: " + product); 
		

		
	}

}
