package stringEjercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Diseña un programa en Java que solicite al usuario una cadena en la que buscará y otra que será la
		//cadena buscada. El programa indicará cuántas veces aparece la segunda cadena en la primera.
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduce una cadena de caracteres: ");
		String cad1=sc.nextLine();
		System.out.print("Introduce la cadena que se busca: ");
		String cad2=sc.nextLine();
		sc.close();
		int contar=0;
		int posicion=0;
		while(posicion>=0) {
			posicion=cad1.indexOf(cad2, posicion);
			if (posicion >= 0) {
				posicion++;
				contar++;
				}
		}
		
		System.out.println(contar);
	}

}
