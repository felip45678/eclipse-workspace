package ejemplos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		// Programa que lea una serie de números enteros hasta introducir el cero, y que
		// indique cuántos números han sido
		// pares y cuántos impares.

		Scanner sc = new Scanner(System.in);
		try {
			int num;
			int guardo = 0;
			int pares = 0;
			int impares = 0;

			do {
				System.out.print("dime un numero: ");
				num = sc.nextInt();
				guardo += num;
				if (num != 0) {
					if (num % 2 == 0) {
						pares++;
					} else {
						impares++;
					}
				}else {
					
				}
			} while (num > 0);
			
			System.out.println("numeros pares " + pares);
			System.out.println("numeros impares " + impares);
			
			
		} catch (InputMismatchException ime) {
			System.out.println("error lilo");
		}

		sc.close();

	}

}
