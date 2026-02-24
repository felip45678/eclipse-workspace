package wjercicios;

public class Ejercicio18v2 {
	final static int ALT = 5;

	public static void main(String[] args) {
		int asterisco, blanco, linea;
		for (linea = 1; linea <= ALT; linea++) {
			for (blanco = ALT - 1; blanco >= linea; blanco--) {
				System.out.print(" ");
			}
			for (asterisco = 0; asterisco < linea * 2 - 1; asterisco++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (linea = ALT-1; linea >= 1; linea--) {
			for (blanco =ALT; blanco > linea; blanco--) {
				System.out.print(" ");
			}
			for (asterisco = 0; asterisco < linea * 2 - 1; asterisco++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
