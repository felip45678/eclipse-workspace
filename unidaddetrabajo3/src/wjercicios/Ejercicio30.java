package wjercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		// Programa que lea números enteros positivos hasta que el usuario introduzca el
		// cero, y que para cada número
		// indique si es primo o no.
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("dime un numero entero: ");
			int num=sc.nextInt();
			while(num!=0) {
					if(num>0) {
				if(Ejercicio29.Primos(num)) {
					System.out.println("es primo");
				}else
					System.out.println("no es primo");
				}
					System.out.print("dime otro numero entero: ");
				num=sc.nextInt();
			
			}
		}catch(InputMismatchException ime) {
			System.out.println("gay");
		}
		sc.close();
	}

}
