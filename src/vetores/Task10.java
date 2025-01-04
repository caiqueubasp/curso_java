package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Task10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas?: ");
		int n = sc.nextInt();

		double highestHeight = 0.0;
		double shorterHeight = Double.MAX_VALUE;
		int mensNumber = 0;
		int womensNumber = 0;
		double womenTotalHeight = 0.0;

		Person[] vect = new Person[n];

		for (int i = 0; i < vect.length; i++) {
			int cI = i + 1;
			System.out.println("Altura da pessoa " + cI + ":");
			double height = sc.nextDouble();

			System.out.println("Genero da pessoa " + cI + ":");
			sc.nextLine(); 
			String gender = sc.nextLine();

			vect[i] = new Person();
			vect[i].setGender(gender);
			vect[i].setHeight(height);
			
			System.out.println("VECT " + vect[i].toString());

			if (vect[i].getHeight() > highestHeight) {
				highestHeight = vect[i].getHeight();
			}
			if (vect[i].getHeight() < shorterHeight) {
				shorterHeight = vect[i].getHeight();
			}
			
			if (vect[i].getGender() == "M") {
				mensNumber++;
				System.out.println("Entrou no Genero ");
			}
			
			if (vect[i].getGender() == "F") {
				womenTotalHeight += vect[i].getHeight();
				womensNumber++;
				System.out.println("Entrou no Mulher ");

			}
		}
		
        double average = Math.round(womenTotalHeight / womensNumber);


		System.out.println("Maior altura: " + highestHeight);
		System.out.println("Menor altura: " + shorterHeight);
		
		System.out.println("Media das alturas das mulheres = " + average);
		System.out.println("Numero de homens = " + mensNumber);



		sc.close();
	}
}
