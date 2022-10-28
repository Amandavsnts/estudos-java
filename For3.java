package controle;

public class For3 {

	public static void main(String[] args) {
		
		//fazer um laço "for", ou seja, um For dentro do outro
		//debug foi usado e retornado da perspectiva java
				
		for(int i = 0; i < 10; i++) {
			for(int j = 0 ; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
				
		}
		
	}
	
	
}
