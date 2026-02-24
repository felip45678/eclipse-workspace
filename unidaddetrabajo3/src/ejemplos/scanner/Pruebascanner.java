package ejemplos.scanner;

import java.util.Scanner;

public class Pruebascanner {

	public static void main(String[] args) {
		// crea el lector
		Scanner teclado = new Scanner(System.in);
		
		//se pide un dato al usuario
		System.out.print("Por favor,dime tu nombre: ");
		
		//se lee el nombre con nextline() que retorna string
		String nombre= teclado.nextLine();
		
		//trabajamos con el dato
		System.out.print("bienvenido "+nombre+". por favro dime tu edad: ");

		//se lee y se guarda la edad con nextint
		int edad =teclado.nextInt();
		System.out.println(nombre+", en diez años tendras: " +(edad+10)+" años");
		
		//le pedimos su nota media 
		System.out.print("dime tu nota media: ");
		float nota= teclado.nextFloat();
		System.out.println(nombre+", tu nota media es: "+nota);
		
		//cerramos el lector
		teclado.close();
	}

}
