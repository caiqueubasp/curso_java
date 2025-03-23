package abstractClass;

import java.util.ArrayList;
import java.util.List;

import abstractClass.entities.Account;
import abstractClass.entities.BusinessAccount;
import abstractClass.entities.SavingAccount;

public class App {

	public static void main(String[] args) {

		List<Account> list = new ArrayList<>();
		list.add(new SavingAccount(10001, "Jose", 1000.00));
		list.add(new BusinessAccount(10002, "Priscila", 1300.00));
		list.add(new SavingAccount(10003, "Gouth", 4000.00));
		list.add(new BusinessAccount(10002, "Agnaldo", 3300.00));

		double soma = 0.0;

		for (Account acc : list) {
			soma += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", soma);

		for (Account acc : list) {
			acc.deposit(10.0);
			System.out.printf("Deposit 10.0 : %d %.2f%n", acc.getNumber(), acc.getBalance());
		}

		System.out.println("Cheque if it has blackCard");

		for (Account acc : list) {
			System.out.println(acc.getHolder() + "Has Black Card? " + acc.hasBlackCard());
		}

	}

}
