package controle;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		System.out.println("Bom dia!");
		System.out.println("Bom dia!");
		System.out.println("Bom dia!");
		System.out.println("Bom dia!");
		System.out.println("Bom dia!");
		System.out.println("Bom dia!");
		System.out.println("Bom dia!");
		System.out.println("Bom dia!");
		System.out.println("Bom dia!");
		System.out.println("Bom dia!");
		
		// ----------------- OU -----------------
		
		int contador = 0;  // primeiro numero que começa o contador
		
		while(contador <= 50) {  //quantidade de repeticoes
			System.out.printf("i = %d\n", contador);
			contador +=5;  // quanto adicionado ao numero que começa e contar
		}
		
	}
	
}

