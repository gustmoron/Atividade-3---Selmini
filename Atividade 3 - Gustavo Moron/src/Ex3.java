//			------------------------------------------------------------------				//
//								Atividade 3 - Gustavo Moron									//
//			------------------------------------------------------------------				//
//																							//
//	Exerc�cio 3: Escreva um programa em Java que leia um n�mero representando um n�mero na 	//
//	base bin�ria. O seu programa dever� ter um m�todo para converter e retornar o valor da	//
//	base bin�ria para decimal.																//
// ----------------------------------------------------------------------------------------	//

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um valor em bin�rio: ");
		int valorbinario = teclado.nextInt();

		convertor(valorbinario);
	}

		// ------------------------------------------------------------------ 	//
		//					Converter de binario para decimal					//
		// ------------------------------------------------------------------	//
	
	public static void convertor(int valorbinario) {
		int valordecimal = 0;
		int contador = 0;
		
		while (true) {
			if (valorbinario == 0) {
				
				break;
				
			} else {
				
				int valor = valorbinario % 10;
				
				valordecimal += valor * Math.pow(2, contador);
				valorbinario /= 10;
				
				contador++;
			}
		}
		System.out.println(valordecimal);
	}
}

		// ------------------------------------------------------------------ 	//
		//							Fim	- Exercicio 3							//
		// ------------------------------------------------------------------	//