package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Crear un programa que lea por teclado una tabla de 5 números enteros y la desplace una posición hacia la
		//derecha: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último pasa a
		//ser el primero.

		int tabla[]=new int[5];
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("dime cinco numeros");
			for(int i=0;i<tabla.length;i++) {
				System.out.print("numero "+i+":");
				tabla[i]=sc.nextInt();
			}
		}catch(Exception e) {
			System.out.println("error");
		}finally {
			sc.close();
		}
		int ultimo=tabla[tabla.length-1];
		
		for(int i=tabla.length-1;i>0;i--) {
			tabla[i]=tabla[i-1];
		}
		tabla[0]=ultimo;
		for(int i=0;i<tabla.length;i++) {
			System.out.print(tabla[i]+" ");
		}
		
		
	}

}
