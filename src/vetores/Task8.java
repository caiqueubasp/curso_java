package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Task8 {
	
	 public static void main(String[] args) {

	        Locale.setDefault(Locale.US);
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Quantas pessoas serao digitadas?: ");
	        int n = sc.nextInt();

	        Person[] vect = new Person[n];
	        Person oldestPerson = new Person();
	        int oldestAge = 0;

	        
	        for (int i = 0; i < vect.length; i++) {
	            int cI = i + 1;
	            System.out.println("Dados da " + cI + "a pessoa: ");
	            sc.nextLine();
	            System.out.println("Nome: ");
	            String name = sc.nextLine();
	            System.out.println("Idade: ");
	            int age = sc.nextInt();

	            vect[i] = new Person(name, age);
	            
	            if(age > oldestAge) {
	            	oldestAge = age;
	            	oldestPerson = vect[i];
	            }
	            
	        }
	        
	        System.out.println("PESSOA MAIS VELHA: " + oldestPerson.getName());
	        
	  
	        sc.close();
	 }

}
