package curso_programacao;

import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + "METROS");
		System.out.printf("RESULTADO = %.2f%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);



		System.out.println("Olá Mundo!");
		
//		Casting
		int a, b;
		double resultado;
		
		a = 2;
		b = 5;
		
		resultado = (double) a / b;
		
		System.out.print(resultado);

	}

}
