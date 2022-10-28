package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog(
				"Informe o numero: ");
		int numero = Integer.parseInt(valor); //transforma em valor inteiro
		
		//para definir se o numero é par ou impar 
		//fazemos um modulo de um numero por 2 (se o resultador for 0 é par e se for 1 é impar)
		
		if(numero % 2 == 0) {
			System.out.println("Numero par!");
		}
		
		if(numero % 2 == 1) {
			System.out.println("Numero impar!");
		}
		
		//ou
		
		if(numero % 2 == 0) {
			System.out.println("Numero par!");
		} else {
			System.out.println("Numero impar!");
		}
		
	}
	
}
