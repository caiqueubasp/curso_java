package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Whats the Matriz size? ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];

		System.out.println("Type matriz numbers: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Type chosen number: ");
		int num = sc.nextInt();
		System.out.println();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (num == mat[i][j]) {
					System.out.println("Number: " + mat[i][j]);
					System.out.println("Position: " + i + "," + j);

					// Verifica se há uma posição à esquerda
					if (j - 1 >= 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}

					// Verifica se há uma posição à direita
					if (j + 1 < n) {
						System.out.println("Right: " + mat[i][j + 1]);
					}

					// Verifica se há uma posição acima
					if (i - 1 >= 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}

					// Verifica se há uma posição abaixo
					if (i + 1 < m) {
						System.out.println("Down: " + mat[i + 1][j]);
					}

					System.out.println("-------------------------------");

				}

			}
		}

		sc.close();
	}

}
