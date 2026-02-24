package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int tabla[]=new int[5];
		int posiciones=0;
		Scanner sc=new Scanner (System.in);
		try {
			System.out.println("introduce cinco numeros enteros...");
			for(int i=0;i<tabla.length;i++) {
				System.out.print("numero "+i+":");
				tabla[i]=sc.nextInt();
			}
			System.out.println("que posicion quiere eliminar?");
			posiciones=sc.nextInt();
		}catch(Exception e) {
			System.out.println("error");
		}finally {
			sc.close();
		}
		for(int i=posiciones;i<tabla.length-1;i++) {
			tabla[i]=tabla[i+1];
		}
		
		for(int i=0;i<tabla.length-1;i++) {
			System.out.print(tabla[i]+" ");
		}
	}

}
