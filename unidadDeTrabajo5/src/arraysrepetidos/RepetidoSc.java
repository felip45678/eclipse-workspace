package arraysrepetidos;

import java.util.Scanner;

public class RepetidoSc {

	final static int TAM = 5;
	final static int LIM = 10;
	/**
	 * funcion que determina si el vallor N se encuentra almacenado en el array A
	 * 
	 * @param N   valor entero a buscar
	 * @param A   array valores enteros
	 * @param pos posicion del array hasta la que vamos a comparar valores
	 * @return true si N se encuentra entre los valores almacenados en A FALse en
	 *         otro caso
	 */
	public static boolean encontrado(int N, int[] A, int pos) {
		for (int i = 0; i < pos; i++) {
			if (N == A[i])
				return true;
		}
		return false;
	}
	public static void mostrar(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int array[]=new int[TAM];
			System.out.println("dime cinco numeros enteros entre 1 y 10");
			for(int i=0;i<TAM;i++) {
				do {
				System.out.print(i+1+" valor:");
				array[i]=sc.nextInt();
				}while(array[i]<1||array[i]>LIM || encontrado(array[i],array,i));
			}
			System.out.println("tus valores son:");
		mostrar(array);
		}catch(Exception ime) {
			System.out.println("Error");
		}finally {
			sc.close();
		}
	}

}
