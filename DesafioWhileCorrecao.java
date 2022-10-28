package controle;

import java.util.Scanner;

public class DesafioWhileCorrecao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota !=-1) {
			System.out.print("Infome a nota:");
			nota = entrada.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			} else if(nota != -1){
				System.out.println("Digite uma nota valida!");
			}
		}
		
		//calcular a média
		
		double media = total / quantidadeDeNotas;
		System.out.println("Media = " + media);
		
		
		entrada.close();
		
	}
}
