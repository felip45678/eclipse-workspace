package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio7 {

	final static int TOTAL=10;
	public static void main(String[] args) {
		//Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 números.
		//Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén
		//detrás.
		int array[]=new int[TOTAL];
		Scanner sc=new Scanner(System.in);
		try {
			for(int i=0;i<TOTAL-1;i++) {
				System.out.print("numero "+i+": ");
				array[i]=sc.nextInt();
			}
			System.out.println("dime un numero?");
			int numero=sc.nextInt();
			System.out.println("en que posicion quieres agregar el numero?");
			int posicion=sc.nextInt();
			for(int i=array.length-1;i>posicion;i--) {
				array[i]=array[i-1];
			}
			array[posicion]=numero;
			
		}catch(Exception e) {
			System.out.println("error");
		}finally {
			sc.close();
		}
		for(int i=0;i<TOTAL;i++) {
			System.out.println(array[i]);
		}
		
	}

}
