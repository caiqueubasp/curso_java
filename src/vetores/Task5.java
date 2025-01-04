package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Task5 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];

		
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i < vectA.length; i++) {
			int num = sc.nextInt();
			vectA[i] = num;
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0; i < vectB.length; i++) {
			int num = sc.nextInt();
			vectB[i] = num;
			int sum = vectA[i] + vectB[i];
			vectC[i] = sum;
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for(int i = 0; i < vectC.length; i++) {
			System.out.println(vectC[i]);
		}

		
		
		
		sc.close();
		
	}
	

}