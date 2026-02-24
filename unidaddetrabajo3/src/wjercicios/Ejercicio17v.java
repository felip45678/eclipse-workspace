package wjercicios;

public class Ejercicio17v {
final static int ALTURA=5;
	public static void main(String[] args) {
		int linea,asterisco,blanco;
		for(linea=1;linea<=ALTURA;linea++) {
			for(blanco=ALTURA-1;blanco>=linea;blanco-- ) {
				System.out.print(" ");
			}
			for(asterisco=0;asterisco<linea*2-1;asterisco++) {
				System.out.print("*");
			}
		System.out.println();}
		for(linea=ALTURA;linea<=8;linea++) {
			for(blanco=3;blanco<=5;blanco++) {
				System.out.print(" ");
			}
			for(asterisco=1;asterisco<3;asterisco++) {
				System.out.print("*");
			}
		System.out.println();}
	}

}
