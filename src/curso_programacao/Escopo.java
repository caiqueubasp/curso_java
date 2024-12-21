package curso_programacao;

public class Escopo {

	public static void main(String[] args) {

		double price = 400;
		double discount = 0;

		System.out.println("Preco: " + price);

		if (price < 200) {
			discount = price * 0.1;
		}

		System.out.println("Desconto: " + discount);
	}

}
