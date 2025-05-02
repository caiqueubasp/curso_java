package generics;

import generics.entities.Client;

public class Program2 {
	
	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@email.com");
		Client c2 = new Client("Maria", "maria@email.com");
		
		String s1 = "Teste";
		String s2 = "Teste";
		
		String s3 = new String("Teste");
		String s4 = new String("Teste");
		
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);

	}

}
