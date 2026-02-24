package ejemplos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// Programa que lea números hasta que le den el cero, y que diga cuál ha sido el
		// mayor y cuál el menor de los
		// números introducidos (sin tener en cuenta el cero).
		Scanner sc = new Scanner(System.in);
		try {
			int num, mayor, menor;
			System.out.print("valores hasta que escribas 0: ");
			num = mayor = menor = sc.nextInt();
			if (num != 0) {
				do {
					System.out.print("dime un numero: ");
					num = sc.nextInt();
					if (num > mayor && num != 0)
						mayor = num;
					if (num < menor && num != 0)
						menor = num;
				} while (num != 0);

				System.out.println("menor " + menor);
				System.out.println("mayor " + mayor);
			} else
				System.out.println("fin");
		} catch (InputMismatchException ime) {
			System.err.println("error");
		}

		sc.close();

	}

}
