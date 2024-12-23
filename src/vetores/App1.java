package vetores;

import java.util.Locale;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor:");

		int n = sc.nextInt();

		double[] vect = new double[n];

		System.out.println("Digite os dados: ");

		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}

		double avg = sum / n;

		System.out.println();
		System.out.printf("A sua média é: %.2f%n", avg);

		sc.close();

	}

}
