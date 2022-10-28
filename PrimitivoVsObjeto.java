package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		
		//String s = "texto";
		// Assim ^ ou assim v
		String s = new String("texto"); // forma menos usual pra criar string
		s.toUpperCase(); // comportamento do objeto
		
		//Tudo que é atribuido a uma classe se chama de objeto
		// e o objeto tem atributos e comportamentos 
		//como no exemplo s.toUpperCase();
		
		int a = 123;
		System.out.println(a);
		
		//não existe nenhum comportamento associado a um tipo primitivo
		// como o int pro exemplo
		
		//Wrappers - aquilo que envolve(versao obejeto dos tipos primitivos)
		
		//IMPORTANTE: TUDO EM JAVA E OBJETO, MENOS OS 8 TIPOS PRIMITIVOS
	}

}
