package stringEjercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Crea un programa en Java que solicite al usuario dos cadenas de caracteres y que devuelva la primera
		//cadena, pero transformando en mayúsculas la parte que coincide con la segunda cadena introducida.
		//Por ejemplo, si se introducen las cadenas “Esta es mi amiga Ana” y “amiga” devolverá “Esta es mi
		//AMIGA Ana”.
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduce una cadena de caracteres: ");
		String cadena=sc.nextLine();
		System.out.print("Introduce la cadena que se busca: ");
		String subcadena=sc.nextLine();
		sc.close();
		cadena = cadena.replaceAll(subcadena, subcadena.toUpperCase());
		System.out.println(cadena);
		}

	}


