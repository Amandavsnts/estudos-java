package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		
		// defino a variavel em java dizendo o tipo, nome e valor em sequencia
		// variavel inteira é int e nao inteiro é double
		// para que nao haja a possibilidade do valor de pi variar...
		// é colocado final na frente de double para que isso nao ocorra e a variavel
		// se torne constante
		
		
		double raio = 3.4;
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area = " + area + "m2.");
				
		
		/*
		 *  para que o resultado saia pode ser feito tanto como o calculo do 
		 *  raio direto dentro dos parenteses de system como o que foi feito no exemplo acima
		 *  NOME DE CONSTANTES COM LETRA MAIUSCULA
		 */
	}
}
