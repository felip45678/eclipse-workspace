package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio9 {

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
			System.out.println("cuantas posiciones quieres desplazar?");
			posiciones=sc.nextInt();
		}catch(Exception e) {
			System.out.println("error");
		}finally {
			sc.close();
		}
		int ultimo=tabla.length-1;
		for(int veces=1;veces<=posiciones;veces++) {
			ultimo=tabla[tabla.length-1];
			for(int i=tabla.length-2;i>=0;i--) {
			tabla[i+1]=tabla[i];
			}
			tabla[0]=ultimo;
		}
		for(int i=0;i<tabla.length;i++) {
			System.out.print(tabla[i]+" ");
		}

	}

}
