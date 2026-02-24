package arraysrepetidos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoteriaPrimitivallll {
	
	final static int TAM=6;
	final static int LIM=49;
	
	/**
	 * Genera un aleatorio entre 1 y N
	 * @param N
	 * @return
	 */
	public static int aleatorio(int N) {
		return (int)(Math.random()*N+1);
	}
	
	/**
	 * Procedimiento que nos muestra un array.
	 * @param a - Array de números enteros.
	 */
	public static void mos(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	/**
	 * Función que determina si el valor N se encuentra almacenado en un array
	 * @param N - Valor entero a buscar
	 * @param a - Array de valores enteros
	 * @param pos - Posición del array hasta la que vamos a comparar valores
	 * @return - TRUE si N se encuentra entre los valores almacenados en a. FALSE si no.
	 */
	public static boolean encontrado(int N, int[] a, int pos) {
		for(int i=0; i<pos; i++) {
			if(N==a[i])
				return true;
		}
		return false;
	}
	
	/**
	 * Función que nos devuelve un array ordenado
	 * @param a - Array de números enteros que queremos ordenar.
	 * @return - Array ya ordenado.
	 */
	public static int[] ord(int[] a) {
		int aux;
		boolean cambio;
		for(int i=a.length; i>0; i--) {
			cambio=false;
			for(int j=0; j<i-1; j++) {
				if(a[j]>a[j+1]) {
					aux=a[j];
					a[j]=a[j+1];
					a[j+1]=aux;
					cambio=true;
				}
			}
			if(!cambio)
				return a;
		}
		return a;
	}
	
	/**
	 * Función que nos dice los valores comunes de dos array.
	 * @param a - Primer array de enteros.
	 * @param b - Segundo array de enteros.
	 * @return - La cantidad de valores comunes entre los dos array. Int.
	 */
	public static int comun(int[] a, int[] b) {
		int conta=0;
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j])
					conta++;
			}
		}
		return conta;
	}
	
	public static void main(String[] args) {
		// Declaramos y creamos el array ganador
		int[] gan=new int[TAM];
		
		// Generamos los números aleatorios sin que se repitan
		for(int i=0; i<TAM; i++) {
			do {
				gan[i]=aleatorio(LIM);
			} while(encontrado(gan[i],gan,i));
		}
		
		// Declaramos y creamos el array del usuario
		int[] A=new int[TAM];
		Scanner sc=new Scanner(System.in);
		try {
			// Pedimos los valores por teclado y los almacenamos si no son repetidos
			System.out.println("Dime "+TAM+" valores entre 1 y "+LIM+".");
			for(int i=0; i<TAM; i++) {
				do {
					System.out.print("Valor["+(i+1)+"]:");
					A[i]=sc.nextInt();
					// Mensaje en caso de que el número introducido no está dentro del rango
					if (A[i]<1 || A[i]>LIM)
						System.out.println("Valor fuera de rango, dime otro.");
					// Mensaje en caso de que el número sea repetido
					if(encontrado(A[i],A,i))
						System.out.println("Repetido, dime otro.");
				} while(encontrado(A[i],A,i) || (A[i]<1 || A[i]>LIM));
			}
		} catch (InputMismatchException e) {
			System.out.println("ERROOOOOOOOOOOOOOOOOOOOOOR");
		} finally {
			sc.close();
		}
		
		// Mostramos los array ordenados
		System.out.print("\nTus números: ");
		mos(ord(A));
		System.out.print("\nLos ganadores: ");
		mos(ord(gan));
		
		// Comprobamos los aciertos
		if(comun(A,gan)==TAM)
				System.out.println("\nGanador");
		else if(comun(A,gan)==TAM-1) {
			System.out.println("\nOh no. Te has quedado cerca. Intentalo otra vez.");
		}
		else if(comun(A,gan)!=TAM && comun(A,gan)!=0)
			System.out.println("\nFallaste");
		else {
			System.out.println("\nNo has acertado ninguno pringado");
		}
		System.out.println("\nNúmero de aciertos: "+comun(A,gan));
	}
}
