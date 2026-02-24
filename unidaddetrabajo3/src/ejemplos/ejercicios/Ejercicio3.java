package ejemplos.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//inicializamos el teclado
		Scanner sc= new Scanner(System.in);
		System.out.print("introduce un numero te dire de quien es multiplo: ");
		int num1=sc.nextInt();
		try {
		if (num1%2==0) {
			System.out.print("el numero es multiplo de 2");
		}
			else if (num1%3==0) {
				System.out.print("el numero es multiplo de 3");
		}else if (num1%5==0) {
			System.out.print("el numero es multiplo de 5");
		}else if (num1%7==0) {
			System.out.print("el numero es multiplo de 7");
		}
		}catch(Exception e) {
			System.err.print("no has introducido un numero entero");
		}
	sc.close();}

}
