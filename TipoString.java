package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		
		//charAt me permite selecionar letras especificas dentro da String conforme a posição
		System.out.println("Ola pessoal".charAt(5));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("tarde")); // define se o argumento é true ou false (start começo da string)
		System.out.println(s.startsWith("boa"));
		System.out.println(s.startsWith("BOA"));
		System.out.println(s.toLowerCase().startsWith("boa")); //LowerCase ignora se é maiusculo ou minusculo
		System.out.println(s.length()); // diz quanto caracteres tem a string
		System.out.println(s.endsWith("tarde")); // define se o argumento é true ou false (end final da string)
		System.out.println(s.endsWith("TARDE"));
		System.out.println(s.equals("boa tarde")); // define se o argumento é true ou false (equals igual a string)
		System.out.println(s.equalsIgnoreCase("boa tarde"));//Esse ignora se é maiusculo ou minusculo
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		//exemplos com inicio System ***************
		System.out.println("\nNome: " + nome + "\nSobrenome: " 
		+ sobrenome + "\nIdade: " + idade + 
		"\nSalario: " + salario); // "\n" quebra a linha - abaixo forma resumida
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", 
				nome, sobrenome, idade, salario); // %s substitui string, %d substitui int, %f substitui ponto flutuante.
		
		

		//exemplos com inicio String ***************
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", 
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " 
				+ sobrenome + "\nIdade: " + idade + 
				"\nSalario: " + salario;
		System.out.println(maisUmaFrase);
		
		// a explorar
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
	}
}
