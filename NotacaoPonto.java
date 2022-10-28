package fundamentos;

public class NotacaoPonto {
		
	public static void main(String[] args) {
		
		double a = 2.3;
		System.out.println(a);
		String s = "Bom dia, X"; 
		s = s.replace("X", "Senhora"); // precisa atribuir o metodo a variavel
		s = s.toUpperCase(); // precisa atribuir o metodo a variavel
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia, X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem o operador "."
		
		int b = 3;
		System.out.println(b);
		
	}

}
