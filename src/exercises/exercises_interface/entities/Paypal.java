package exercises.exercises_interface.entities;

public class Paypal implements ServicePayment {
	
	private double paymentTax = 1.02;
	private double tax = 1.01;
	
	public double calcPayment(Double value, int months) {
        double valueWithFees = value * tax;

        double valueBaseInstalment = valueWithFees / months;

        double valueInstallmentWithFees = Math.ceil(valueBaseInstalment * paymentTax);

        return valueInstallmentWithFees;
	}

}
