package application6;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the dollar price? ");
		CurrencyConverter.dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		CurrencyConverter.dollarQuantity = sc.nextDouble();
		
		double convertedValue = CurrencyConverter.calculateDollarPrice();
		System.out.printf("Amount to be paid em Reais is: %.2f%n", convertedValue);
		
		
		
		
		
		sc.close();
		
	}

}
