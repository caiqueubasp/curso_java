package vetores;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] vect = new int[n];
		ArrayList<Integer> evenList = new ArrayList<>();
		double totalSum = 0;

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero: ");
			int num = sc.nextInt();
			vect[i] = num;

			Boolean isEven = num > 0 && num % 2 == 0 ? true : false;
			if (isEven) {
				evenList.add(num);
				totalSum += num;
			}
		}

		double average = Math.round(totalSum / vect.length);

		if (evenList.size() > 0) {
			System.out.println("MEDIA DOS PARES = " + average);

		} else {
			System.out.println("NENHUM NUMERO PAR");

		}

		sc.close();
	}

}
