import java.util.Scanner;	// importa a biblioteca para ler do teclado

class Exemplo2 {
	
	public static void main (String args[]) {
		
		// cria a variavel que permitirá fazer o input
		Scanner sc = new Scanner(System.in);	
		
		System.out.printf("Qual seu nome?\n");
		String nome = sc.nextLine();
		
		boolean ehEstudante = false;
		System.out.printf("Qual é o seu saldo?\n");
		float saldo = sc.nextFloat();	//sc.nextFloat(); vai ler um número com ponto
		
		// regra para não pagar tarifa bancária: ser estudante OU ter saldo igual ou superior de 2 mil
		if (ehEstudante == true || saldo >= 2000) {
			System.out.printf("Tem isenção na tarifa bancária \n");
		} else {
			System.out.printf("Deve pagar tarifa para manutenção de conta\n");
		}
		
		
		
		// condições para tirar CNH:
		// maioridade E também passar no teste psicológico
		System.out.printf("Qual sua idade? \n");
		int idade = sc.nextInt();	// ler um int do teclado
		boolean passouNoTeste = false;
		
		if (idade >= 18 && passouNoTeste == true){
			System.out.printf("%s, já pode tirar a CNH\n", nome);
		} else if (idade < 18){
			System.out.printf("%s, é necessário ter 18 para começar\n", nome);
		} else {
			System.out.printf("%s, você deve passar no teste pscicológico\n", nome);
		}
	}
}
