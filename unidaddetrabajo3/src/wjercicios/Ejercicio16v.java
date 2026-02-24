package wjercicios;

public class Ejercicio16v {
final static int ALTURA=4;
	public static void main(String[] args) {
		int linea, asterisco;
		for(linea=1;linea<=ALTURA;linea++) {
			for(asterisco=1;asterisco<=linea;asterisco++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
