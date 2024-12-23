package application7;

import java.util.Locale;
import java.util.Scanner;
import entities.ProductsV2;


public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
	
		ProductsV2 product = new ProductsV2(name, price);
		
		product.setName("Computer");
		System.out.println("Product name: " + product.getName());
		product.setPrice(300);
		System.out.println("Product price: " + product.getPrice());

		
		
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
		
		sc.close();
		
	}

}
