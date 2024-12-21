package curso_programacao;

import java.util.Scanner;
import java.util.Locale;

public class Main2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		char a;
		
		System.out.println("Digite os dados abaixo:");


		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		a = sc.next().charAt(0);

		System.out.println("Voce digitou a String: " + x);
		System.out.println("Voce digitou o numero inteiro: " + y);
		System.out.println("Voce digitou o numero double: " + z);
		System.out.println("Voce digitou o Char: " + a);

		sc.close();
		
		
		Locale.setDefault(Locale.US);
		Scanner sc2 = new Scanner(System.in);
		
		String s1, s2, s3;
		
		s1 = sc2.nextLine();
		s2 = sc2.nextLine();
		s3 = sc2.nextLine();
		
		System.out.println("DADOS DIGITADOS");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc2.close();

		
		
		
		
		
		
	}

}
