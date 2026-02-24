package ejemplos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		// Pedir un número entero positivo N. A continuación, introducir por teclado N números enteros. Mostrar la media
		//de los N números introducidos, el mayor y el menor.
		Scanner sc=new Scanner (System.in); 
		try {
			int N, num, mayor, menor, suma;
			// Pedimos un número hasta introducir un entero positivo
			do {
			System.out.print("Introduce un número entero positivo: ");
			N=sc.nextInt();
			} while (N<=0);
			// Leemos el primer número
			System.out.print("(1) Dime un número:");
			num=sc.nextInt();
			// Inicializamos mayor, menor y suma al primer número introducido
			mayor=menor=suma=num;
			// Leemos el resto de números
			for (int i=2; i<=N; i++) {
			System.out.print("("+i+") Dime un número:");
			num=sc.nextInt();
			suma+=num;
			if (num<menor)
			menor=num;
			if (num>mayor)
			mayor=num;

			}
			System.out.println("\nMedia: "+((float)suma/N));
			System.out.println("Mayor: "+mayor);
			System.out.println("Menor: "+menor);
			
		}catch(InputMismatchException e) {
			System.out.println("error");
		}
		
		
		
		
		
		
		sc.close();	
		
	}

}
