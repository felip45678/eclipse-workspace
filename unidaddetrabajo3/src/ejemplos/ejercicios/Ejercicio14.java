package ejemplos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio14 {

	public static int comprobar(int n) {
		int num = 0;
		while (n != 0) {
			n /= 10;
			num++;
			
		}
		return num;
	}

	public static void main(String[] args) {
		// Función que, dado un número entero pasado como parámetro, devuelva cuántos
		// dígitos forman el número. Por ejemplo: el número 54326 consta de 5 dígitos.

		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("escribe un numero: ");
		int num=sc.nextInt();
		System.out.println("este numero tiene "+comprobar(num)+" digitos");
	}catch (InputMismatchException e) {
		System.out.println("ERROR");
	}
sc.close();
}
}
