package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		//calcular a media das notas de uma turma		
		//usuario vai digitar uma nota valida de 10 a 0
		// quando digitar uma nota valida
		
		Scanner entrada = new Scanner(System.in);
		
		String teclado = "";
		int contador = 0;
		double nota = 0;
		double total = 0;
		
		
		while (true) {      
			System.out.print("Informe a nota ou digite sair ");
			teclado = entrada.nextLine().replace(",", ".");
			
			if(teclado.equalsIgnoreCase("sair"))
		         break;
		    else
		         nota = Double.parseDouble(teclado);
		 
		    if (nota <= 10 && nota >= 0) {
		         total += nota;
		         contador ++;
		     } else {
		         System.out.println("Informe uma nota valida!");		         
		     }
		} double media = total / contador;
		
		System.out.printf("Soma das notas: %s %nMedia das notas: %.2f %nTotal de notas calculadas: %s",
				total, media, contador);
		
		
		entrada.close();
		
	}
	
}
