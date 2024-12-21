package application8;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Account data: ");
		System.out.println("Enter Client Account Number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Client Account Name: ");
		String name = sc.nextLine();

		System.out.println("Is there an initial deposit (y/n)?");
		String initialDepositResponse = sc.nextLine();

		Account account;

		if (initialDepositResponse.equals("y")) {
			System.out.println("Enter Client Account Initial Balance: ");
			double balance = sc.nextDouble();
			account = new Account(accountNumber, name, balance);
		} else {
			account = new Account(accountNumber, name);
		}

		System.out.println("Updated data: " + account);
		
		System.out.println("Enter a deposit value: ");
		double credit = sc.nextDouble();
		account.creditAccount(credit);
		
		System.out.println("Updated data: " + account);
		
		System.out.println("Enter a withdraw value: ");
		double debit = sc.nextDouble();
		account.debitAccount(debit);
		
		System.out.println("Updated data: " + account);


		sc.close();

	}

}
