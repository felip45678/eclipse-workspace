package stringEjercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Crea un programa que reciba una cadena de caracteres y la devuelva invertida con efecto espejo, este
		//es, se concatena a la palabra original su inversa, compartiendo la última letra, que hará de espejo, por
		//lo que la palabra obtenida se lee igual hacia adelante que hacia atrás. Por ejemplo, al introducir
		//“teclado” devolverá “tecladodalcet” y al introducir “hola” devolverá “holaloh”.
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduce una cadena de caracteres: ");
		String cad1=sc.nextLine();
		sc.close();
		String cad2=cad1;
		for(int i=cad1.length()-2;i>=0;i--) {
			cad2=cad2+cad1.charAt(i);
		}
		System.out.println("Cadena invertida!! "+cad2);
	}

}
