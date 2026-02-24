package arraysrepetidos;

public class repetidosv4 {

	final static int TAM = 5;
	final static int LIM = 5;

	/**
	 * funcion que ordena los valores en el array
	 * 
	 * @param a
	 */
	final static void orden(int[] a) {
		int aux;
		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < i - 1; j++) {
				if (a[j] > a[j + 1]) {
					aux = a[j + 1];
					a[j + 1] = a[j];
					a[j] = aux;
				}
			}
		}
	}

	/**
	 * funcion que muestra los valores en el array
	 * 
	 * @param args
	 */
	public static void mostrar(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	/**
	 * funcion que determina si el vallor N se encuentra almacenado en el array A
	 * 
	 * @param N   valor entero a buscar
	 * @param A   array valores enteros
	 * @param pos posicion del array hasta la que vamos a comparar valores
	 * @return true si N se encuentra entre los valores almacenados en A FALse en
	 *         otro caso
	 */
	public static boolean encontrado(int N, int[] A, int pos) {
		for (int i = 0; i < pos; i++) {
			if (N == A[i])
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// programa que genere de forma aleatoria 5 valores entre 1 y 10 que se guarden
		// en un array,de forma que no se repitan los numeros(no podran haber valores duplicados)
		int array[] = new int[TAM];
		// generamos valores aleatorios y los almacenamos en el array
		for (int i = 0; i < TAM; i++) {
			array[i] = (int) (Math.random() * LIM + 1);
			do {
				array[i]=(int) (Math.random() * LIM + 1);
			}while(encontrado(array[i],array,i));
			System.out.print(array[i]);
				
			System.out.println();
		}

	}

}
