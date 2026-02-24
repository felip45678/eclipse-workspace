package wjercicios;

public class Ejercicio17 {
	final static int ALT = 4;

	public static void main(String[] args) {
		int contar, asterisco, blanco;
		for (contar = 1; contar <= ALT; contar++) {
			for (blanco = ALT - 1; blanco >= contar; blanco--) {
				System.out.print(" ");
			}
			for (asterisco = 1; asterisco <= contar; asterisco++) {
				System.out.print("*");
			}

	System.out.println();	}

	}

}
