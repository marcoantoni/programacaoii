public class Exemplo1 {
	
	public static void main (String[] args) {
		// declaracao de variaveis
		String nome = "João";	// variavel do tipo texto
		int idade = 16;	// variavel do tipo inteiro
		char sexo = 'i';	// variavel para armazenar uma letra
		float altura = 1.91f; // varivel para armazenar ponto flutuando - obrigatório colocar o f
		
		// exemplo de concatenacao de string
		String sobrenome = " da Silva";
		String nomeCompleto = nome + sobrenome;
	
		
		
		System.out.printf("Nome: %s \n", nome); // %s para mostrar uma string
		System.out.printf("Nome completo: %s \n", nomeCompleto);
		System.out.printf("Idade: %d \n", idade); // %d para mostrar um inteiro
		System.out.printf("Altura: %.2f \n", altura); // %f mostrar numero com virgula
		
		if (sexo == 'm'){
			System.out.printf("Sexo: Masculino\n");
		} else if (sexo == 'f'){
			System.out.printf("Sexo: Feminino\n");
		} else {
			System.out.printf("Sexo: Intersexo\n");
		}
		
		if (idade >= 18){
			System.out.printf("Tem idade para tirar a CNH\n");
		} else {
			System.out.printf("Você deve aguardar até ter 18 anos\n");
		}
		
		// operadores matemáticos
		int soma = 18 + 8; // + operador de soma
		int subtracao = 17 - 9; // - operador de subtração
		int multiplicacao = 9 * 9; // * multiplicaço
		int divisao = 10/3;
		int resto = 10 % 3;	// vai dar 1
		System.out.printf("10/3=%d\n", divisao);
		System.out.printf("10 mod 3 = %d\n", resto);
	}
}

