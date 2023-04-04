public class LacosRepeticao {

	public static void main (String args[]){

		// laco de repeticao contado - usado para executar algo um determinado numero de vezes
		// 1ª condicao: inicializacao da variavel
		// 2ª condicao: saida - ate quando o laco deve ser executado
		// 3ª condicao: incremento da variavel - Exemplo de como pular de dois em dois: i=i+2
		
		for (int i=0; i < 10; i=i+3) {
			System.out.printf("i=%d\n", i);
		}
		
		// exemplo while
		boolean status = true;
		
		// variavel de controle para a condicao de saida
		int i=0;
		while (status == true){
			System.out.printf("Executando o laco de repeticao while pela %d vez\n", i);
			
			// criando uma condicao de saida pro laco de repeticao
			if (i == 100)
				status = false;
				// o break elimina a necessidade de usar a linha anterior
				
			i++;
			
		}
	}
}
