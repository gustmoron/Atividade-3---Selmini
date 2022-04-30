//			------------------------------------------------------------------				//
//								Atividade 3 - Gustavo Moron									//
//			------------------------------------------------------------------				//
//																							//
//	Exercício 2: Reescreva o segundo método do exercício anterior para ser um método 		//
//	recursivo.																				//
// ----------------------------------------------------------------------------------------	//

import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		int[] vetor = new int[10];

		prenchimentodovetorrecursivo(vetor, vetor.length - 1);
		printrecursivo(vetor, vetor.length - 1);
		
		System.out.println("Resultado = " + somadoselementosrecursiva(vetor, 0));
	}
	
			// ------------------------------------------------------------------ 	//
			//					Prenchimento do vetor - Recursivo					//
			// ------------------------------------------------------------------	//
	
	public static void prenchimentodovetorrecursivo(int[] vetor, int limitador) {
		Random aleatorio = new Random();
		
		if (limitador != -1) {
			
			vetor[limitador]=aleatorio.nextInt(101);
			
			prenchimentodovetorrecursivo(vetor, limitador - 1);
		}
	}
	
			// ------------------------------------------------------------------ 	//
			//						Print do vetor - Recursivo						//
			// ------------------------------------------------------------------	//
	
	public static void printrecursivo(int[] vetor, int limitador) {
		
		if (limitador != -1) {
			
			System.out.println(vetor[limitador]);
			
			printrecursivo(vetor, limitador-1);
		}
	}
	
			// ------------------------------------------------------------------ 	//
			//				Soma dos elementos do vetor - Recursivo					//
			// ------------------------------------------------------------------	//

	public static int somadoselementosrecursiva(int[] vetor, int limitador) {
		
		if (limitador == vetor.length - 1) {
			
			return 0;
			
		}
		
		return somadoselementosrecursiva(vetor, limitador + 1) + vetor[limitador + 1];
		
	}

}

			// ------------------------------------------------------------------ 	//
			//							Fim	- Exercicio 2							//
			// ------------------------------------------------------------------	//