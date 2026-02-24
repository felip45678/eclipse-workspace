package wjercicios;

public class Ejercicio18 {
	final static int ALT = 5;

	public static void main(String[] args) {
		int asterisco, blanco, linea;
		for (linea = 1; linea <= ALT; linea++) {
			for (blanco = ALT - 1; blanco >= linea; blanco--) {
				System.out.print(" ");
			}
		 	for (asterisco = 0; asterisco < linea*2-1; asterisco++) {
				System.out.print("*");
			}
			System.out.println();
		}for(linea=ALT;linea<=8;linea++) {
			for(blanco=0;blanco<3;blanco++) {
				System.out.print(" ");
			}
			for(asterisco=1;asterisco<4;asterisco++) {
				System.out.print("*");
			}
			System.out.println();}
	}

}
