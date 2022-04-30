//			------------------------------------------------------------------				//
//								Atividade 3 - Gustavo Moron									//
//			------------------------------------------------------------------				//
//																							//
//	Exercício 3: Escreva um programa em Java que leia um número representando um número na 	//
//	base binária. O seu programa deverá ter um método para converter e retornar o valor da	//
//	base binária para decimal.																//
// ----------------------------------------------------------------------------------------	//

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um valor em binário: ");
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