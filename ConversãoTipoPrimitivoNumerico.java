package fundamentos;

public class ConversãoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		//exemplo que conversão implicita
		double a = 1;
		System.out.println(a);
		
		/*exemplo que conversão explicita/cast
		 * de double pra float poderia ou colocar um F apos ou numero
		 *ou fazer -> float b = (float) 1.0;
		 */
		
		float b = (float) 1.123456788888;
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.99999999;
		int f = (int) e;
		System.out.println(f);
		
	}

}
