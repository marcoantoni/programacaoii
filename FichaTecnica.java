class FichaTecnica {
	String modelo;
	int ano;
	String combustivel;
	String motor;
	int potencia;
	int vMax;
	float temp0a100; // tempo 0 a 100
	float consumoCidade;
	float consumoEstrada;
	float tanque; // capacidade do tanque
	boolean cambioAT; // true - automatico / false - manual
	int nMarchas;
	// atributos para armazenar a autonomia do veiculo
	float autCidade;
	float autEstrada;

	public FichaTecnica(String modelo, int ano, String combustivel, String motor, int potencia, int vMax, float temp0a100, float consumoCidade, float consumoEstrada, float tanque, boolean cambioAT, int nMarchas) {
		
		// validacao apenas pelo numero de caracteres
		if (modelo.length() >= 10){
			this.modelo = modelo; 
		} else {
			System.out.println("Marca ou modelo inválido\n");
			this.modelo = "";	// definindo um valor vazio para a string que não foi preenchida. "" não é a mesma coisa que null
		}
		
		// validacao do ano
		if (ano >= 1950){
			this.ano = ano;
		} else {
			System.out.println("Ano inválido \n");
			// em atributos do tipo int, o valor padrão de inicialização do atributo é 0, ou seja, mesmo que não tenha a linha
			// this.ano = 0, o valor será igual a 0
		}
		
		// combustivel aceitos: alcool / etanol, gasolina, diesel, elétrico, hibrido
		if (combustivel.equalsIgnoreCase("alcool") || combustivel.equalsIgnoreCase("etanol") ||
			combustivel.equalsIgnoreCase("gasolina") || combustivel.equalsIgnoreCase("diesel") ||
			combustivel.equalsIgnoreCase("elétrico") || combustivel.equalsIgnoreCase("hibrido") ){
				this.combustivel = combustivel;
			} else {
				this.combustivel = "Gasolina";
				System.out.println("Combustível inválido\n");
			}
		
		// validação com 3 letras: permite o "1.0"
		if (motor.length() >= 3){
			this.motor = motor;
		} else {
			System.out.println("Motor inválido \n");
			this.motor = "";
		}
		
		// potencia sempre será maior que zero
		if (potencia > 0){
			this.potencia = potencia;
		} else {
			System.out.println("Potência inválida \n");
		}
		
		// velocidade máxima > 50 pois desconheço algum carro que tenha velocidade inferior
		if (vMax > 50){
			this.vMax = vMax;
		} else {
			System.out.println("Velocidade máxima inválida \n");
		}
		
		/* nos próximos 4 testes, não é possível valores negativos, com excessão do tanque de combustível: 
		 * o tanque de combustível pode ser igual a zero em carros elétricos, pois não tem tanque */
		if (temp0a100 > 0){
			this.temp0a100 = temp0a100;
		} else {
			System.out.println("Tempo de 0 a 100 inválido\n");
			// em atributos do tipo float, o valor padrão de inicialização do atributo é 0.0, ou seja, mesmo que não tenha a linha
			// this.temp0a100 = 0.0, o valor será igual a 0.0
		}
		
		if (consumoCidade > 0){
			this.consumoCidade = consumoCidade;
		} else {
			System.out.println("Consumo inválido \n");
		}
		
		if (consumoEstrada > 0){
			this.consumoEstrada = consumoEstrada;
		} else {
			System.out.println("Consumo inválido \n");
		}
		
		if (tanque >= 0){
			this.tanque = tanque;
		} else {
			System.out.println("Valor inválido para o tanque de combustível \n");
		}
		
		// não é necessário testar a condicao da variavel booleana, pois é possível ter somente dois valores
		this.cambioAT = cambioAT;
		
		// carro vai ter no mínimo uma marcha (mesmo se for carro elétrico)
		if (nMarchas >= 1){
			this.nMarchas = nMarchas;
		} else {
			System.out.println("Número de marchas inválido para o veículo \n");
		}
		
		// calculando a autonomia do veiculo
		autCidade = consumoCidade * tanque;
		autEstrada = consumoEstrada * tanque;
	}
	
	public void imprimirInformacoes(){
		if (modelo != "")
			System.out.printf("Marca/modelo: %s \n", modelo);
		
		if (ano != 0)
			System.out.printf("Ano de fabricação: %d \n", ano);
		
		if (combustivel != "")
			System.out.printf("Combustível: %s \n", combustivel);
		
		if (motor != "")
			System.out.printf("Motor: %s \n", motor);
		
		if (potencia != 0)
			System.out.printf("Potência: %d \n", potencia);
		
		if (vMax != 0)
			System.out.printf("Velocidade máxima: %d \n", vMax);
		
		if (temp0a100 != 0)
			System.out.printf("Tempo de 0 a 100: %.2f \n", temp0a100);
		
		if (autCidade != 0)
			System.out.printf("Consumo de combustível na cidade: %.2f - Autonomia de %.2f km \n", consumoCidade, autCidade);
		
		if (autEstrada != 0)
			System.out.printf("Consumo de combustível na estrada: %.2f - Autonomia de %.2f km \n", consumoEstrada, autEstrada);
		
		// para exibir o cambio é necessário testar o conteudo da variavel cambioAT
		// definimos que se for igual a true, o cambio é automático
		if (cambioAT == true){
			System.out.printf("Cambio automático de %d marchas \n", nMarchas);
		} else {
			System.out.printf("Cambio manual de %d marchas \n", nMarchas);
		}
		
		System.out.printf("Capacidade do tanque: %.2f litros \n", tanque);
	}
	
	public static void main (String args[]){
		
		/* criacao do veiculo 1, conforme o enuncionado do exercício
		 * os argumentos passados na criacao devem estar na ordem dos parametros do método construtor, que são:
		 * (String modelo, int ano, String combustivel, String motor, int potencia, int vMax, 
		 * float temp0a100, float consumoCidade, float consumoEstrada, float tanque, boolean cambioAT, int nMarchas)
		 */
		
		FichaTecnica veic1 = new FichaTecnica("Volkswagen Polo 200 TSI Highline", 1940, 
			"", "1.0 turbo", 0, 192, 9.6f, 0f, 13.9f, 52, true, 6);
			
		veic1.imprimirInformacoes();	// chama o método responsável por printar as informacoes
	}
	
}
