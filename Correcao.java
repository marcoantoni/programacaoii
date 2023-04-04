import java.util.Scanner;

public class Correcao {
	
	public static void main (String args[]) {

		Scanner sc = new Scanner(System.in);
		
		// 1. Informar um saldo e imprimir o saldo com reajuste de 10%
		
		System.out.printf("Informe um número");
		float num = sc.nextFloat();
		
		System.out.printf("%f + 10 por cento = %f\n", num, (num*1.1) );
		
		// Faça um programa que leia três números inteiros, e em seguida, calcule e exiba a média aritmética desses números
		System.out.printf("Informe a nota 1 \n");
		int nota1 = sc.nextInt();
		
		System.out.printf("Informe a nota 2\n");
		int nota2 = sc.nextInt();
				
		System.out.printf("Informe a nota 3\n");
		int nota3 = sc.nextInt();
		
		float media = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("A média é %f \n", media);
		
		// Faça um programa que leia três variáveis (representando uma data), sem seguida, a escreva por extenso. Ex: 15/03/2022 → 15 de março de 2022.
		int dia = 4, mes = 4, ano = 2023; // declarao de variaveis do mesmo tipo na mesma linha
	
		// declarando uma variavel, concatenando o valor da variavel dia com a preposicao de
		String data = dia + " de ";	
		
		switch (mes) {
			case 1:
				data += "janeiro";
				break;
			case 2:
				data += "fevereiro";
				break;
			case 3:
				data += "março";
				break;
			case 4:
				data += "abril";
				break;	
			case 5:
				data += "maio";
				break;
			case 6:
				data += "junho";
				break;
			case 7:
				data += "julho";
				break;
			case 8:
				data += "agosto";
				break;
			case 9:
				data += "setembro";
				break;
			case 10:
				data += "outubro";
				break;
			case 11:
				data += "novembro";
				break;
			case 12:
				data += "dezembro";
				break;								
		}
		// concatenando a preposicao de com o valor da variavel ano
		data += " de " + ano;
		
		System.out.printf(data);
	
	}

}
