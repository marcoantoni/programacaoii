import java.util.Scanner;

public class Correcao1{

	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		// correcao exercicio 1
		/*
		System.out.printf("Informe qual é o seu sexo: \n");
		String sexo = sc.nextLine();
		
		System.out.printf("Informe qual é sua altura: \n");
		float altura = sc.nextFloat();
		
		float pesoIdeal = 0;
		
		if (sexo.equals("masculino") ) {
			// (72.7*h) – 58
			pesoIdeal = (72.7f * altura) - 58f;
		} else if (sexo.equals("feminino") ){
			// (62.1*h) - 44.7
			pesoIdeal = (62.1f * altura) - 44.7f;
		}
		
		System.out.printf("Considerando sua a sua altura e seu sexo, seu peso ideal é %.2f", pesoIdeal);
		*/
		// correcao exercicio 2
		/*System.out.printf("Digite seu peso\n");
		float peso = sc.nextFloat();
		
		System.out.printf("Digite sua altura\n");
		float altura = sc.nextFloat();
		
		float imc = peso / (altura*altura);
		
		if (imc < 18.5)
			System.out.printf("Seu imc é %.2f, sendo considerado magreza\n", imc);
		else if (imc >= 18.5 && imc <= 24.9)
			System.out.printf("Seu imc é %.2f, sendo considerado normal\n", imc);
		else if (imc >= 25 && imc <= 29.9)
			System.out.printf("Seu imc é %.2f, sendo considerado sobrepeso\n", imc);
		else if (imc >= 30 && imc <= 39.9)
			System.out.printf("Seu imc é %.2f, sendo considerado obesidade\n", imc);
		else 
			System.out.printf("Seu imc é %.2f, sendo considerado obresidade grave\n", imc);
		*/
			
		// exercicio 3 - corrigido na última aula
		
		// exercicio 4 

		float alturaJuca = 0.6f;
		float alturaChico = 0.8f;
		int anos = 0;
		
		while (alturaJuca < alturaChico) {
			alturaJuca = alturaJuca + 0.09f;
			alturaChico = alturaChico + 0.06f;
			anos++;
		}
		
		System.out.printf("Levará %d anos para Juca ser maior que Chico. Chico terá %.2f e Juca terá %.2f", anos, alturaChico, alturaJuca);
	}
	
}
