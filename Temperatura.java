package fundamentos;

public class Temperatura {

	//Formula (°F - 32) * 5/9 = °C 
	// 5/9 da 0 pq o resultado e quebrado de um calculo de inteiros
	// para que a conta saia correta é necessario fazer 5/9.0 ou 5.0/9 ou 5.0/9.0
	
	public static void main(String[] args) {
		
		double F = 90;
		final double ajuste = 32;
		
		double result1 = F - ajuste;
		
		System.out.println(result1);
		
		double x = 58.0;
		final double fator = 5.0/9.0;
		
		double C = x * fator;
		
		System.out.println( C + "Celcius");
		
	}
}
