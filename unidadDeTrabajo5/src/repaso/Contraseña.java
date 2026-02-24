package repaso;

import java.util.Scanner;

public class Contraseña {

	/**
	 * funcion que devuelve true si encuentra alguno de los caracteres elegidos
	 * 
	 * @param n
	 * @return
	 */
	public static boolean num(char n) {
		if (n >= '0' && n <= '9')
			return true;
		return false;
	}

	/**
	 * funcion que devuelve true si encuentra alguno de los caracteres elegidos
	 * 
	 * @param n
	 * @return
	 */
	public static boolean mayus(char n) {
		if (n >= 'A' && n <= 'Z')
			return true;
		return false;
	}

	/**
	 * funcion que devuelve true si encuentra alguno de los caracteres elegidos
	 * 
	 * @param n
	 * @return
	 */
	public static boolean minus(char n) {
		if (n >= 'a' && n <= 'z')
			return true;
		return false;
	}

	/**
	 * indice de las opciones
	 */
	public static void indice() {
		System.out.println("Fortaleza de un password:");
		System.out.println("-->DEBIL: si contiene menos de 8 caracteres");
		System.out.println("-->MODERADA: si contiene,al menos, 8 caracteres");
		System.out.println(
				"-->FUERTE: si contiene como minimo  8 caracteres y cumple contres de las siguientes condiciones:");
		System.out.println("\t\t-1 minuscula");
		System.out.println("\t\t-1 mayuscula");
		System.out.println("\t\t-1 numero del 0 al 9");
		System.out.println("\t\t-1 carcater especial");
		System.out.println(
				"-->EXCELENTE: si contiene como minimo  8 caracteres y cumple con todas las condiciones anteriores ");
	}

	public static void main(String[] args) {
		indice();
		//creamos el scanner para introducir datos
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce password: ");
		String nombre = sc.nextLine();
		sc.close();
		//condicional de que si no es mayor de ocho caracteres no entre a comprobar lo demas
		if (nombre.length() < 8)
			System.out.println("DEBIL");
		else {
			//inicializamos las variables 
			int minuscula = 0;
			int mayuscula = 0;
			int numero = 0;
			int caracterEsp = 0;
			int cumplidos = 0;
			//creamos un bucle que recorra todas las letras de la palabra introducida
			for (int i = 0; i < nombre.length(); i++) {
				
				char letra = nombre.charAt(i);		//variable tipo char que la igualamos a la palabra para que tme los valores de cada caracter 
				if (minus(letra)) {
					minuscula++;
				} else if (mayus(letra)) {
					mayuscula++;
				} else if (num(letra)) {
					numero++;
				} else {
					caracterEsp++;
				}
			}
			//si cumplidos se cumple va sucediendo una cosa u otra
			if (mayuscula >= 1)
				cumplidos++;
			if (minuscula >= 1)
				cumplidos++;
			if (numero >= 1)
				cumplidos++;
			if (caracterEsp >= 1)
				cumplidos++;
			if (cumplidos == 4)
				System.out.println("EXCELENTE");
			else if (cumplidos == 3)
				System.out.println("FUERTE");
			else
				System.out.println("MODERADA");
		}
	}
}
