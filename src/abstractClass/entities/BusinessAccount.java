package abstractClass.entities;

public class BusinessAccount extends Account {

	BusinessAccount() {

	}

	public BusinessAccount(int number, String holder, double balance) {
		super(number, holder, balance);
	}

	@Override
	public boolean hasBlackCard() {
		return true;
	}

}
