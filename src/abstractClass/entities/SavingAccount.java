package abstractClass.entities;

public class SavingAccount extends Account {

	SavingAccount() {

	}

	public SavingAccount(int number, String holder, double balance) {
		super(number, holder, balance);
	}

	@Override
	public boolean hasBlackCard() {
		return false;
	}

}
