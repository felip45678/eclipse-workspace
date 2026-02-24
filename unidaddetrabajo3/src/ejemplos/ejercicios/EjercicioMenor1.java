package ejemplos.ejercicios;

import java.util.Scanner;

public class EjercicioMenor1 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("introduce un numero entero: ");
			int num1 = sc.nextInt();
			System.out.print("introduce otro numero entero: ");
			int num2 = sc.nextInt();
			if (num1 < num2) {
				System.out.println("el menor de los valores introducidos es: " + num1);
			} else if (num1 == num2) {
				System.out.println("los valores introducidos son iguales: " + num1 + "=" + num2);
			} else {
				System.out.println("el menor de los valores introducidos es: " + num2);
			}

		} catch (Exception e) {
			System.err.println("has introducio un valor que no es un numero entero");
		}
		sc.close();

	}

}
