package wjercicios;

import java.util.Scanner;

public class Ejercicio2 {
	/**
	 * funcion que nos diga el menor entre dos numeros
	 * 
	 * @param a
	 * @param b
	 * @return nos devuelve el menor
	 */

	public static int menor(int a, int b) {
		if (a < b)
			return a;
		else
			return b;

	}

	/**
	 * el menor de tres numeros utilizando la funcion de antes
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return nos devuelve el mayor de los tres valors
	 */
	public static int menor3(int a, int b, int c) {
		return menor(a, menor(b, c));
	}

	public static void main(String[] args) {
		// Función que reciba como parámetros tres números enteros y devuelva el menor  de los tres números.
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("dime un numero entero: ");
			int num1 = sc.nextInt();
			System.out.print("dime otro numero entero: ");
			int num2 = sc.nextInt();
			System.out.print("dime otro numero entero: ");
			int num3 = sc.nextInt();
			System.out.println(" el menor de los tres numeros es: "+menor3(num1,num2,num3));
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		sc.close();
	}
}
