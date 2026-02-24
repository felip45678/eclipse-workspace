package matrices.ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo04 {

	final static int TAM=3;
	/**
	 * procedimiento que myuestra por pantalla los valores almacenados en una matriz
	 * @param M
	 */
	public static void mostrarMatriz(int M[][]) {
		for(int i=0;i<M.length;i++) {
			for(int j=0;j<M[i].length;j++)
				System.out.print(M[i][j]+"\t");
			System.out.println();
		}

	}
	public static void main(String[] args) {
		int[][] matriz=new int[TAM][TAM];
		Scanner sc=new Scanner(System.in);
		try {
			for(int i=0;i<matriz.length;i++) {
				for(int j=0;j<matriz[i].length;j++) {
					System.out.print("Matriz ["+i+"]"+"["+j+"]");
					matriz[i][j]=sc.nextInt();
				}
			}
		}catch(InputMismatchException ime) {
			System.out.println("Error en la introduccion de datos");
		}finally {
			sc.close();
		}

		mostrarMatriz(matriz);
	}

}
