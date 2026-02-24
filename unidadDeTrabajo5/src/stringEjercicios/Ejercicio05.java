package stringEjercicios;

import java.util.Scanner;

public class Ejercicio05 {
	/* Indica si un carácter pasado como parámetro es una vocal
	* @param carácter
	* @return true si el parámetro es una vocal ('a','e','i','o','u), false en caso contrario
	*/
	public static boolean esVocal(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			return true;
			
		return false;
	}
	public static boolean esConsonante(char c) {
		// Si es una vocal, devolverá false
		if (esVocal(c))
		return false;
		// Para el resto de caracteres del abecedario (en mayúscula y en minúscula), devolverá true
		if (c >= 'B' && c <= 'Z')
		return true;
		if (c >= 'b' && c <= 'z')
		return true;
		// Si no está en ningún caso de los anteriores, devolverá false
		return false;
	}
	public static void main(String[] args) {
		// Diseña un programa en Java que solicite al usuario una cadena de caracteres y muestre por pantalla un
		//conteo de cuántas vocales, cuántas consonantes y cuántos espacios en blanco contiene la cadena
		//introducida.
		// Pedimos al usuario que introduzca la cadena de caracteres
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce la cadena: ");
		String cadena = entrada.nextLine();
		entrada.close();
		// Recorremos la cadena carácter a carácter para realizar el conteo
		int vocales = 0;
		int consonantes = 0;
		int blancos = 0;
		for (int i=0; i<cadena.length(); i++) {
		if (esVocal(cadena.charAt(i)))
		vocales++;
		if (esConsonante(cadena.charAt(i)))
		consonantes++;
		if (cadena.charAt(i)==' ')
		blancos++;

		}
		// Mostramos por pantalla el conteo
		System.out.println("Vocales: " + vocales);
		System.out.println("Consonantes: " + consonantes);
		System.out.println("Blancos: " + blancos);
	}

}
