package exercises.exercises_interface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import exercises.exercises_interface.entities.Contract;
import exercises.exercises_interface.entities.Paypal;

public class Program {
	
	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do contrato:");
		System.out.println("Numero: ");
		int contractNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("Data (dd/MM/yyyy hh:mm): ");
		LocalDateTime date = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Entre com o valor do contrato:");
		double contractValue = sc.nextDouble();
		System.out.println("Entre com o numero de parcelas:");
		int instalments = sc.nextInt();
		sc.nextLine();
		
		Contract contract = new Contract(contractNumber, date, contractValue, instalments,  new Paypal());
		contract.processContract();
		contract.toString();
		System.out.println("Parcelas:");
		contract.showInstalments();
		
		System.out.println("Digite o numero de uma parcela para saber os detalhes: ");
		int instalmentEspecific = sc.nextInt();
		System.out.println("Detakhes: " + contract.getEspecificInstalment(instalmentEspecific).getDate() + " " + contract.getEspecificInstalment(instalmentEspecific).getValue());



//		System.out.println(contract.toString());
		
	
		sc.close();
		
	}

}
