package arrays;

import java.util.Scanner;

public class Ejemplo6mej {

	final static int TOTAL=5;
	public static void main(String[] args) {
		//Creamos el array que almacenara los numeros leidos en el teclado
		int vector[]=new int[TOTAL];
		
		//leemos los numero sdesde teclado 
		Scanner sc=new Scanner(System.in);
		try {
			for(int i=0;i<TOTAL;i++) {
				System.out.println("Introduce un numero: ");
				vector[i]=sc.nextInt();
			}
		}catch(Exception ime) {
			System.err.println(">>>>ERROR en la introduccion de datos...");
		}finally {
			sc.close();
		}
		//mostramos los valores almacanedaos en el array
		System.out.println("Valores almacenados en el array: ");
		for(int i=0;i<vector.length;i++)
			System.out.println(vector[i]+" ");
	}

}
