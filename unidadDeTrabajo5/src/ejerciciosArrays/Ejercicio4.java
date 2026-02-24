package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio4 {

	final static int TOTAL=10;
	public static void main(String[] args) {
		// Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el
		//penúltimo, el tercero, etc...
		int array[]=new int[TOTAL];
		Scanner sc=new Scanner(System.in);
		try {
			for(int i=0;i<TOTAL;i++) {
				System.out.print("numero "+i+":");
				array[i]=sc.nextInt();
			}
		}catch(Exception e) {
			System.err.println("los valores introducidos no son correcvtos");
		}finally {
			sc.close();
		}
		System.out.println("\nNúmeros: ");
		for (int i=0; i<TOTAL/2; i++) {
		System.out.print(array[i]+" ");
		System.out.print(array[TOTAL-1-i]+" ");
		}
	}

}
