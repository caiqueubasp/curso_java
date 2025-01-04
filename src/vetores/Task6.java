package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Task6 {
	
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar?: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double totalSum = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero: ");
			double num = sc.nextDouble();
			vect[i] = num;
			totalSum += num;
		}
		
        double average = Math.round((totalSum / vect.length) * 1000.0) / 1000.0;

		System.out.println("MEDIA DO VETOR = " + average);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < average) {
				System.out.println(vect[i]);
			}
		}
		
		
		
		sc.close();
	}

}
