package wrappers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nombreyedad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// pedimos la edad
			System.out.print("introduce tu edad: ");
			String edad = sc.nextLine();
			int e = Integer.parseInt(edad);
			// pedimosel nombre
			System.out.print("ntroduce tu nombre: ");
			String nombre = sc.nextLine();
			// pedimos la nota
			System.out.print("introduce tu nota: ");
			String nota=sc.nextLine();
			float f=Float.parseFloat(nota);
			//mostramos
			System.out.println("te llamas " + nombre + " y tu edad es " + e + " años.");
			System.out.println(" el año que viene tendras " + (e + 1));
			System.out.println("subimos un punto tu nota: "+(f+1));
		} catch (InputMismatchException ime) {
			System.out.println("error");
		} finally {
			sc.close();
		}
	}

}
