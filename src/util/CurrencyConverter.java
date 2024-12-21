package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	public static double dollarPrice;
	public static double dollarQuantity;

	public static double calculateDollarPrice() {

		double convertedValue = dollarQuantity * dollarPrice;
		double additionalTax = convertedValue * IOF;
		return convertedValue + additionalTax;

	}
}
