//			------------------------------------------------------------------				//
//								Atividade 3 - Gustavo Moron									//
//			------------------------------------------------------------------				//
//																							//
// 	Exercicio 1: Escreva um programa em Java que preencha um vetor de 10 posições com 		//
//	valores inteiros (o preenchimento deverá ser feito por um método). Um segundo método	//
//	deverá ser chamado para calcular e retornar a soma dos elementos armazenados no array.	//
// ----------------------------------------------------------------------------------------	//

import java.util.Random;

public class Ex1 {	
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] vetor = new int[10];
		
		prenchervetor(vetor);
		printvetor(vetor);
		
		System.out.println("Resultado = " + somaelementos(vetor));
	}
	
			// ------------------------------------------------------------------ 	//
			//				Prencher vetor com numeros aleatorios					//
			// ------------------------------------------------------------------	//
		
	public static void prenchervetor(int[] vetor) {
		Random aleatorio = new Random();
		
		for(int i = 0; i<vetor.length;i++) {
			
			vetor[i] = aleatorio.nextInt(75);
			
		}
	}
	
			// ------------------------------------------------------------------ 	//
			//							Print do vetor								//
			// ------------------------------------------------------------------	//
		
	public static void printvetor(int[] vetor) {
		
		for(int i = 0; i<vetor.length;i++) {
			
			System.out.println(vetor[i]);
			
		}
	}
	
			// ------------------------------------------------------------------ 	//
			//						Somar elementos do vetor						//
			// ------------------------------------------------------------------	//
	
	public static int somaelementos(int[] vetor) {
		int aux = 0;
		
		for(int i=0;i<vetor.length;i++) {
			
			aux+= vetor[i];
			
		}
		
		return aux;
		
	}
}

			// ------------------------------------------------------------------ 	//
			//							Fim	- Exercicio 1							//
			// ------------------------------------------------------------------	//