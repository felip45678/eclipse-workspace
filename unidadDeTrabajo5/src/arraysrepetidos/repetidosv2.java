package arraysrepetidos;

public class repetidosv2 {

	final static int TAM=5;
	final static int LIM=5;
	/**
	 * funcion que ordena los valores en el array
	 * @param a
	 */
	final static void orden(int[] a) {
		int aux;
		for(int i=0;i<TAM;i++) {
			for(int j=0;j<i-1;j++) {
				if(a[j]>a[j+1]) {
					aux=a[j+1];
					a[j+1]=a[j];
					a[j]=aux;
				}
			}
		}
	}
	/**
	 * funcion que muestra los valores en el array
	 * @param args
	 */
	public static void mostrar(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	
	public static void main(String[] args) {
		// programa que genere de forma aleatoria 5 valores entre 1 y 10 que se guarden en un array 
		//si alguno de los numeros ya se encuentra en el arra es decir esta repetido debe indicarlo con un mensaje 
		int array[]=new int[TAM];
		//generamos valores aleatorios y los almacenamos en el array
		for(int i=0;i<TAM;i++) {
			array[i]=(int)(Math.random()*LIM+1);
			System.out.print(array[i]);
			//recorremos todos los valores anteriores
			for(int j=0;j<i;j++) {
				if(array[i]==array[j]) {
					System.out.print("--> Repetido");
					break;
				}
			}
			System.out.println();
		}

	}

}
