package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom dia!");
		
		} else if (hora > 12 && hora < 19) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}
		
//		NEW LOGIC with counts
		
		System.out.println("DIGITE os minutos!");
		
		Locale.setDefault(Locale.US);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if(minutos > 100) {
			conta = conta + (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
//		NEW LOGIC switch case
		
		int x = sc.nextInt();
		String dia = "";
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terca";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7: 
			dia = "Sábado";
			break;
		}
		
		
		System.out.println("Dia da semana: " + dia);
		
//		NEW LOGIC - if ternario
		
		System.out.println("Digite o preco para obter o desconto: ");
		
		double preco = sc.nextInt();
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println("Desconto: " + desconto);
		
		sc.close();
		
	}

}
