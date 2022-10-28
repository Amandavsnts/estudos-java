package fundamentos;

public class TemperaturaCorrecao {
	
	public static void main(String[] args) {
		
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		
		double F = 86;
		double celsius = (F - AJUSTE) * FATOR;
		
		System.out.println("O resultado e " + celsius + " C");
		
		F = 150;
		celsius = (F - AJUSTE) * FATOR;
		
		System.out.println("O resultado e " + celsius + " C");

	}

}
