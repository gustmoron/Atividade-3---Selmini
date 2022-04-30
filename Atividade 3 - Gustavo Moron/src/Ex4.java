//			------------------------------------------------------------------				//
//								Atividade 3 - Gustavo Moron									//
//			------------------------------------------------------------------				//
//																							//
//	Exercício 4: Reescreva o método do exercício anterior para usar recursividade. 			//
// ----------------------------------------------------------------------------------------	//

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um valor em binário: ");
		int valorbinario = teclado.nextInt();

		System.out.println(convertorrecursivo(valorbinario, 0));
	}

		// ------------------------------------------------------------------ 	//
		//					Converter de binario para decimal					//
		// ------------------------------------------------------------------	//
	
	public static int convertorrecursivo(int valorbinario, int contador) {
		
		int valor = valorbinario % 10; 

		if (valorbinario == 0 || valorbinario == 1) {
			
			return (int) Math.pow(2, contador) * valorbinario;
			
		}
		
		return (int) (Math.pow(2, contador) * valor) + convertorrecursivo(valorbinario / 10, ++contador);

	}

}

		// ------------------------------------------------------------------ 	//
		//							Fim	- Exercicio 4							//
		// ------------------------------------------------------------------	//