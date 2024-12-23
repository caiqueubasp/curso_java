package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductVector;

public class App2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor:");

		int n = sc.nextInt();

		ProductVector[] vect = new ProductVector[n];
		double sum = 0.0;

		for (int i = 0; i < n; i++) {
			System.out.println("Nome do seu produto: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Preco do seu produto: ");
			double price = sc.nextDouble();

			vect[i] = new ProductVector(name, price);

			sum += vect[i].getPrice();

		}

		double avg = sum / n;

		System.out.println();

		System.out.printf("SEU PRECO MÉDIO É: %.2f%n", avg);

		sc.close();
	}

}
