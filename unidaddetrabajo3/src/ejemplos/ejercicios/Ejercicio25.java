package ejemplos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		// Programa que lea números y acepte únicamente aquellos que sean mayores que el
		// último introducido
		// correctamente. Ejemplo: si doy 3, 5, 25, 16 deberá dar un mensaje de error al
		// introducir el 16, pues el siguiente
		// número debería ser mayor que 25. El programa terminará cuando se introduzca
		// un cero. Al final, el programa
		// mostrará el número de errores que se han cometido.

		Scanner sc = new Scanner(System.in);
		try {
			int errores = 0;
			System.out.print("dime un valor: ");
			int num = sc.nextInt();
			int ultimo = num;// declaramos una variable "ultimo" y la inicializamos

			while (num != 0) {
				// pedimos el siguiente numero
				System.out.print("dime otro numero: ");
				num = sc.nextInt();
				if (num != 0) {
					if (num <= ultimo) {
						System.out.println("el valor introducido es menor que el anterior");
						System.out.println("debes introducir un valor mayor que " + ultimo);
						errores++;
					} else
						ultimo = num;
				}
			}
			System.out.println("fin");
			System.out.println("errores cometidos: " + errores);
		} catch (InputMismatchException ime) {
			System.out.println("error");
		}

		sc.close();
	}

}
