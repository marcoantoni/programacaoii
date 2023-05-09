class Paciente {
	// declaracao dos atributos da classe
	String nome;
	String nascimento;
	String fone;
	String prontuario;
	String cpf;
	
	// criacao do método para cadastrar o paciente
	public void cadastrarPaciente(String nome, String nascimento, String fone, String cpf){
		// referencia this serve para resolver a ambiguidade de nomes de parametros e atributos
		// a ambiguidade ocorre quando eles tem o MESMO nome
		// 1º refere-se ao atributo = 2º refere-se ao parametro
		this.nome = nome;
		this.nascimento = nascimento;
		this.fone = fone;
		this.cpf = cpf;
	}
	
	// método para printar os dados na tela
	public void mostrarDados() {
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("Nascimento: %s \n", nascimento);
		System.out.printf("Fone: %s  CPF: %s \n", fone, cpf);
		System.out.printf("______________________\n");
	}
	
	// método principal do programa
	public static void main (String args[]) {
		// criacao de uma instancia da classe paciente
		Paciente paciente1 = new Paciente();	// new é o comando responsável por fazer isso
		
		// chamando o método cadastrarPaciente, passando os dados como pametro
		paciente1.cadastrarPaciente("Fernanda", "20/05/2006", "51 9 9812 1234", "123.456.789-10");
				
		// chamando o método mostrarDados
		paciente1.mostrarDados();
		
		Paciente paciente2 = new Paciente();
		
		paciente2.cadastrarPaciente("Julius", "06/07/2002", "", "987.654.321-19");
		
		paciente2.mostrarDados();
		
		Paciente paciente3 = new Paciente();
		
		paciente3.cadastrarPaciente("Douglas", "21/06/1990", "098.876.543-78", "(48) 9 9128 7917");
		
		paciente3.mostrarDados();
	}
	
}
