package matrices.ejercicios;

public class Ejercicio01 {

	final static int FINAL=5;
	public static void mostrar(int[][] array) {
		for(int filas=0;filas<array.length;filas++) {
			for(int columnas=0;columnas<array[filas].length;columnas++)
			System.out.print(array[filas][columnas]+"\t");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// Crear una tabla bidimensional de tamaño 5x5 y rellenarla de forma que los elementos de la diagonal principal
		//sean 1 y el resto 0. Mostrarla.
		int[][] vector=new int[FINAL][FINAL];
		for(int i=0;i<vector.length;i++) {
			
			vector[i][i]=1;
			
		}
		mostrar(vector);
	}

}
