package matrices.ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	final static int FILAS=5;
	final static int COLUMNAS=3;
	/**
	 * funcion que muestra la matriz
	 * @param matriz
	 */
	public static void mostrar(int matriz[][]) {
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
				
		}
	}
	/**
	 * funcion que calcula la media
	 * @param matriz
	 * @param N
	 * @return
	 */
	public static int media(int matriz[][],int N) {
		int media=0;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				media+=matriz[i][j];
			}
		}
		return media/N;
	}
	public static void main(String[] args) {
		int matriz[][]=new int[FILAS][COLUMNAS];
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Introduce los valores de una  matriz 5x3");
			for(int i=0;i<matriz.length;i++) {
				for(int j=0;j<matriz[i].length;j++) {
					System.out.print("valor["+i+"]:");
					matriz[i][j]=sc.nextInt();
				}
			}
		}catch(Exception e) {
			System.out.println("Error");
		}finally {
			sc.close();
		}
		int media=0;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print("valor["+i+"]:");
				media+=matriz[i][j];
			}
		}
		System.out.println("media: "+media/(double)(FILAS*COLUMNAS));

	}

}
