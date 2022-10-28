package controle;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		// Domingo -> 1
		// Quarta -> 4
		// Terça -> 3
		
		String diaSemana = JOptionPane.showInputDialog(
				"Informe o dia da Semana: ");
		
		if(diaSemana.equalsIgnoreCase("domingo")) {
			System.out.println("Dia 1 da Semana!");
		} else if(diaSemana.equalsIgnoreCase("segunda")) {
			System.out.println("Dia 2 da Semana!");
		}else if(diaSemana.equalsIgnoreCase("terca") 
				|| diaSemana.equalsIgnoreCase("terça")) {
			System.out.println("Dia 3 da Semana!");
		}else if(diaSemana.equalsIgnoreCase("quarta")) {
			System.out.println("Dia 4 da Semana!");
		}else if(diaSemana.equalsIgnoreCase("quinta")) {
			System.out.println("Dia 5 da Semana!");
		}else if(diaSemana.equalsIgnoreCase("sexta")) {
			System.out.println("Dia 6 da Semana!");
		}else if(diaSemana.equalsIgnoreCase("sabado") 
				|| diaSemana.equalsIgnoreCase("sábado")) {
			System.out.println("Dia 7 da Semana!");
		} else {
			System.out.println("Dia Invalido!"); 
		}
	
	}
}
