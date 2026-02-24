package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio5 {

	final static int TOTAL=5;
	public static void mostrar(int array[]) {
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		int A[]=new int[TOTAL];
		int B[]=new int[TOTAL];
		int C[]=new int[TOTAL+TOTAL];
		Scanner sc=new Scanner(System.in);
		try {
			// Vector A
			System.out.println("Vector A: ");
			for (int i=0; i<TOTAL; i++) {
			System.out.print("Introduce un número: ");
			A[i]=sc.nextInt();
			}
			// Vector B
			System.out.println("Vector B: ");
			for (int i=0; i<TOTAL; i++) {
			System.out.print("Introduce un número: ");
			B[i]=sc.nextInt();
			}
		}catch(Exception e) {
			System.out.println("error");
		}finally {
			sc.close();
		}
		// Asignamos los elementos a la tabla C
		// Para la tabla C utilizaremos como índice i
		// Para las tablas A y B utilizaremos como índice j
		int i=0;
		for (int j=0; j<TOTAL; j++) {
		C[i]=A[j];
		i++;
		C[i]=B[j];
		i++;
		}
		// Mostramos el contenido de las tablas
		System.out.print("\nVector A: ");
		mostrar(A);
		System.out.print("\nVector B: ");
		mostrar(B);
		System.out.print("\nVector C: ");
		mostrar(C);
	}

}
