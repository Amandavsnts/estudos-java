package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		// %d = numeros inteiro -  %1f = numeros com ponto flutuantes
		// %s = letras/strings - %n = variação de quebra de linha 
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salario: %.1f \n", 1234.5678);
		System.out.printf("Nome: %s%n", "Joao");
		
		/* Scanner é a analise do que é forncecido
		 * System.in é a leitura da entrada, ele pede alguma informação
		 * diferente do System.out que te mostra a informação
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome:");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome:");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade:");
		int idade = entrada.nextInt();
		
		System.out.print("Qual sua pretencao salarial?");
		int psalario = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos e quer receber valor medio de %d.", 
				nome, sobrenome, idade, psalario);
		
		entrada.close();
	}
}
