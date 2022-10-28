package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		// Do/While e a unica que a sentenca termina com ;
		
		//do sentenca; ou {} while(...);

		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		do {
			System.out.println("Voce precisa falar" 
					+ "as palavras magicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
		}while(!texto.equalsIgnoreCase("por favor"));
		
				
		System.out.println("Obrigada!");
		entrada.close();
		
		
	}
	
}
