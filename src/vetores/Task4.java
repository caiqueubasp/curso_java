package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Task4 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar?: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero: ");
			double num = sc.nextDouble();
			vect[i] = num;
		}
		
		
		double biggestVal = 0.0;
		int biggestValIndex = 0;
		
		
		for(int i = 0; i< vect.length; i++) {
			if(vect[i] > biggestVal) {
				biggestVal = vect[i];
				biggestValIndex = i;
			}
		}
		
	
		System.out.println("MAIOR VALOR = " + biggestVal);
		System.out.print("POSICAO DO MAIOR VALOR = " + biggestValIndex);
		
		sc.close();
	}

}
