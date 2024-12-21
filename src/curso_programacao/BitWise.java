package curso_programacao;

import java.util.Scanner;

public class BitWise {

	public static void main(String[] args) {

//		Operação AND bitwise (&):
		int a = 5; // 0101 em binário
		int b = 3; // 0011 em binário
		int result = a & b; // 0001 em binário
		System.out.println("Resultado de 5 & 3: " + result); // Saída: 1

//	        Operação OR bitwise (|):
		int a0 = 5; // 0101 em binário
		int b0 = 3; // 0011 em binário
		int result0 = a0 | b0; // 0111 em binário
		System.out.println("Resultado de 5 | 3: " + result0); // Saída: 7

//	        Operação XOR bitwise (^):

		int a1 = 5; // 0101 em binário
		int b1 = 3; // 0011 em binário
		int result1 = a1 ^ b1; // 0110 em binário
		System.out.println("Resultado de 5 ^ 3: " + result1); // Saída: 6

//	        Operação NOT bitwise (~):
		int a2 = 5; // 0101 em binário
		int result2 = ~a2; // 1010 em binário (em complemento de dois, isso é -6)
		System.out.println("Resultado de ~5: " + result2); // Saída: -6

//	        Deslocamento à esquerda (<<):
		int a3 = 5; // 0101 em binário
		int result3 = a3 << 1; // 1010 em binário
		System.out.println("Resultado de 5 << 1: " + result3); // Saída: 10

//	        Deslocamento à direita (>>):
		int a4 = 5; // 0101 em binário
		int result4 = a4 >> 1; // 0010 em binário
		System.out.println("Resultado de 5 >> 1: " + result4); // Saída: 2

//	        Deslocamento à direita sem sinal (>>>):
		int a5 = -5; // 11111111111111111111111111111011 em binário
		int result5 = a5 >>> 1; // 01111111111111111111111111111101 em binário
		System.out.println("Resultado de -5 >>> 1: " + result5); // Saída: 2147483645
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero com o sexto digito binario sendo equal 1");
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		
		
		if((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}else {
			System.out.println("6th bit is false!");
		}
		
		sc.close();
		

	}

}
