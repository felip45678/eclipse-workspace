package stringEjercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Crea un programa en Java que solicite al usuario la introducción de una cadena de caracteres y
		//devuelva esta cadena invertida.
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduce una cadena de caracteres: ");
		String cad1=sc.nextLine();
		sc.close();
		StringBuffer cad2=new StringBuffer(cad1);
		System.out.println(cad2.reverse());
		
	}

}
