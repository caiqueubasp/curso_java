package vetores;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar?: ");
		int n = sc.nextInt();

		int[] vect = new int[n];
		ArrayList<Integer> evenList = new ArrayList<>();

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero: ");
			int num = sc.nextInt();
			Boolean isEven = num > 0 && num % 2 == 0 ? true : false;
			if (isEven) {
				evenList.add(num);
			}

		}

		System.out.print("NUMEROS PARES: ");
		for (int i = 0; i < evenList.size(); i++) {
			System.out.print(evenList.get(i) + " ");
		}

		int evenQtd = evenList.size();
		System.out.println("");
		System.out.println("QUANTIDADE DE PARES = " + evenQtd);

		sc.close();
	}

}
