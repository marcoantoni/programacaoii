class Paciente {
	// declaracao dos atributos da classe
	String nome;
	String nascimento;
	String fone;
	String prontuario;
	String cpf;
	
	// método principal do programa
	public static void main (String args[]) {
		// criacao de uma instancia da classe paciente
		Paciente paciente1 = new Paciente();
		
		// o paciente tem os atributos nome, nascimento, fone, cpf e prontuario
		paciente1.nome = "Fernanda";
		paciente1.nascimento = "20/05/2006";
		paciente1.fone = "51 9 9812 1234";
		paciente1.cpf = "123.456.789-10";
		
		// print para mostrar os atributos
		System.out.printf("Nome: %s \n", paciente1.nome);
		System.out.printf("Nascimento: %s \n", paciente1.nascimento);
		System.out.printf("Fone: %s   CPF: %s \n", paciente1.fone, paciente1.cpf );
		
		Paciente paciente2 = new Paciente();
		
		paciente2.nome = "Julius";
		paciente2.nascimento = "06/07/2002";
		paciente2.cpf = "987.654.321-19";
		
		// print para mostrar os atributos
		System.out.printf("Nome: %s \n", paciente2.nome);
		System.out.printf("Nascimento: %s \n", paciente2.nascimento);
		System.out.printf("Fone: %s   CPF: %s \n", paciente2.fone, paciente2.cpf );
		
	}
}
