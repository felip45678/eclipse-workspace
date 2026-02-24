package ejemplos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio29 {

	public static boolean esPrimo(int N) {
		if (N <= 1)
			return false;
		else {
			for (int i = 2; i <= N / 2; i++) {
				if (N % i == 0)
					return false;
			}
			return true;
		}
	}

	public static void main(String[] args) {
		// Programa que, dado un número entero positivo introducido por teclado,
		// visualice por pantalla todos los números
		// primos menores que él. Ejemplo:

		Scanner sc = new Scanner(System.in);
		try {
			int num;
			do {
				System.out.print("introduce un numero: ");
				num=sc.nextInt();
			}while(num<=1);
			for(int contar=2;contar<=num;contar++) {
				if (esPrimo(num)) 
					System.out.print(" "+contar);
				
			}

		} catch (InputMismatchException e) {
			System.out.println("error");
		}

		sc.close();
	}

}
