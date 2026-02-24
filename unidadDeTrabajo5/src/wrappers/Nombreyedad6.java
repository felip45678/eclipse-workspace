package wrappers;

import java.util.Scanner;

public class Nombreyedad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// pedimos la edad
			System.out.print("introduce tu edad: ");
			String edad = sc.nextLine();
			int e = Integer.parseInt(edad);
			// pedimos el nombre
			System.out.print("ntroduce tu nombre: ");
			String nombre = sc.nextLine();
			//mostramos
			System.out.println("te llamas " + nombre + " y tu edad es " + e + " años.");
			System.out.println(" el año que viene tendras " + (e + 1));
		} catch (NumberFormatException nfe ) {
			System.out.println("error en la introduccion del formatoo del numero");
		} finally {
			sc.close();
		}
	}

}
