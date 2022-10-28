package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5; // declaração e inicializacao juntas
		System.out.println(a);
		
		// a = "... texto"; isso não pode acontecer pois a variavel a
		// já foi declarada como valor numerico entao a impossibilita de
		// ser texto
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		// c = 4.5; pelo mesmo motivo acima essa variavel nao pode ser
		// executada por ter sido declada texto anteriormente

		c =  "Outro texto";
		System.out.println(c);
		
		double d; //variável foi declarada aqui
		d = 123.65; //variavel foi inicializada ou dada valor aqui
		System.out.println(d); // aqui foi usada ou aplicada
		
		/*
		 * var e;
		 * e = 123.45;
		 * o caso acima nao pode acontecer por que "var"
		 * pede que os comandos declarar e inicializar sejam feitos juntos
		 */
		
		var e = 123.45; // forma correta de fazer sendo "var"
		System.out.println(e);
		
		var f = 12; // valor inteiro 
		//f = 12.01 nao pode acontecer pq valor declarado inteiro, mas o
		// inverso disso é totalmente viavel como nos exemplos abaixo
		System.out.println(f);
		
		var g = 12.01;
		System.out.println(g);
		
		g = 12;
		System.out.println(g);
		
	}

}
