package wjercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio28 {
	public static boolean Primos(int num) {
		if (num <= 1) {
			return false;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) 
					return false;
				

			}
			return true;
		}
	}

	public static void main(String[] args) {
		// Función que indique si un número entero pasado como parámetro es o no un
		// número primo. Un número primo
		// es un número mayor que 1 que tiene únicamente dos divisores positivos
		// distintos: el 1 y el propio número.
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("dime un numero: ");
			int num=sc.nextInt();
			if (Primos(num)) {
				System.out.println("es primo");
			}else {
				System.out.println("no es primo");
			}
		}catch(InputMismatchException ime) {
			System.out.println("ERROR");
		}
		
		
		sc.close();
		
	}

}
