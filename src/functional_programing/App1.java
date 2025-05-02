package functional_programing;

import java.util.function.Consumer;

public class App1 {
	
	   public static void main(String[] args) {
	        // Função anônima usando expressão lambda
	        Consumer<String> imprimirMensagem = mensagem -> System.out.println(mensagem);

	        // Chamando a função anônima
	        imprimirMensagem.accept("Olá, esta é uma função anônima em Java!");
	    }

}
