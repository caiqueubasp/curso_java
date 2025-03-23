package heritage;

import heritage.entities.Account;
import heritage.entities.BusinessAccount;
import heritage.entities.SavingsAccount;

public class App {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

//		UPCASTING 

		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

//		DOWNCASTING

		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(400.0);
			System.out.print("Loan!");
		}

		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}

		Account acc1Over = new Account(1012, "Alex", 1000.0);
		acc1Over.withdraw(200.0);
		System.out.println(acc1Over.getBalance());

		Account acc2Over = new SavingsAccount(1013, "Maria", 1000.0, 0.01);
		acc2Over.withdraw(200.0);
		System.out.println(acc2Over.getBalance());
		
		Account acc3Over = new BusinessAccount(1014, "Agnaldo", 1000.0, 500.0);
		acc3Over.withdraw(200.0);
		System.out.println(acc3Over.getBalance());

	}

}
