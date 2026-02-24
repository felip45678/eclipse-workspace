package matrices.ejercicios;

public class Ejercicio02 {

	public static void mostrar(int[][] array) {
		for (int filas = 0; filas < array.length; filas++) {
			for (int columnas = 0; columnas < array[filas].length; columnas++)
				System.out.print(array[filas][columnas] + "\t");
			System.out.println();
		}
	}

	final static int FILA=8;
	final static int COLUMNA=6;
	public static void main(String[] args) {
		// Crear una matriz “marco” de tamaño 8x6. Una matriz “marco” es aquella que
		// todos sus elementos son 0 salvo los
		// de los bordes que deben ser 1. Mostrarla.

		int[][] array = new int[FILA][COLUMNA];
		for (int filas = 0; filas < array.length; filas++) {
			for (int columnas = 0; columnas < array[filas].length; columnas++) {
				if(filas==0 || filas==FILA-1 ||columnas==0 ||columnas==COLUMNA-1 ) {
					array[filas][columnas]=1;
					
				}
			}
				
		}
		mostrar(array);
	}
}
