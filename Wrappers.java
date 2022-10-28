package fundamentos;

public class Wrappers {

	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;
		
		// Integer.parseInt("10000")
		Integer i = 10000; //int
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c.toString());

		// byte
		// byte b = 100;
		// short s = 1000;
		// int i = 10000;
		// long l = 100000L;

		// PARA TORNAR TOPO PRIMITIVO LETRA MAIUSCULA NO COMEÇO
		// E A CLASSE LETRA MINUSCULA NO COMEÇO, A UNICA
		// DIFEREÇA É QUE EM CLASSE É INTEGER E EM PRIMITIVO É INT

	}

}
