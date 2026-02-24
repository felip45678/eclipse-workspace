package ejemplos.ejercicios;

import java.util.Scanner;

public class EjercicioMenor1v2 {
	public static int menor(int num1, int num2) {
		if (num1 < num2)
			return num1;
		else
			return num2;

	}

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("introduce un numero entero: ");
			int num1 = sc.nextInt();
			System.out.print("introduce otro numero entero: ");
			int num2 = sc.nextInt();
			System.out.print("el valor menor es " + menor(num1, num2));

		} catch (Exception e) {
			System.err.println("has introducio un valor que no es un numero entero");
		}
		sc.close();

	}

}
