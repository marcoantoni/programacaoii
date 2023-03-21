class Exemplo2 {
	
	public static void main (String args[]) {
		
		boolean ehEstudante = false;
		float saldo = 202.93f;
		
		// regra para não pagar tarifa bancária: ser estudante OU ter saldo igual ou superior de 2 mil
		if (ehEstudante == true || saldo >= 2000) {
			System.out.printf("Tem isenção na tarifa bancária \n");
		} else {
			System.out.printf("Deve pagar tarifa para manutenção de conta\n");
		}
		
		// condições para tirar CNH:
		// maioridade E também passar no teste psicológico
		int idade = 17;
		boolean passouNoTeste = false;
		
		if (idade >= 18 && passouNoTeste == true){
			System.out.printf("Já pode tirar a CNH\n");
		} else if (idade < 18){
			System.out.printf("É necessário ter 18 para começar\n");
		} else {
			System.out.printf("Você deve passar no teste pscicológico\n");
		}
	}
}
