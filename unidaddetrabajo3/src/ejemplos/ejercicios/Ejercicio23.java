package ejemplos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		// Programa que lea una serie de números enteros y obtenga su media. Un número
		// negativo indicará el fin de datos.

		Scanner sc = new Scanner(System.in);
		try {
			int num;
			int suma = 0;// variable que utilizaremos para sumar los numeros introducidos
			int conta = 0;
			double media;
			do {
				System.out.print("dime un numero: ");
				num = sc.nextInt();
				if (num >= 0) {
					suma += num;
					conta++;
				}

			} while (num >= 0);
			media = suma / (double) conta;

			if (conta == 0) {
				System.out.println("no has introducido valores para realizar calculos");
			} else
				System.out.println("la media es: " + media);

		} catch (InputMismatchException ime) {
			System.err.println("error");
		}

		sc.close();
	}

}
