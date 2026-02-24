package matrices.ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void mostrar(int matriz[][]) {
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+"\t");
				}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int matriz[][]=new int[3][4];
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Introduce los valores de una  matriz 3x4");
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
		
		for(int i=0;i<matriz.length;i++) {
			int suma=0;
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+"\t");
				suma+=matriz[i][j];
			}
		System.out.println("suma-->"+suma);
		}
		
	}

}
