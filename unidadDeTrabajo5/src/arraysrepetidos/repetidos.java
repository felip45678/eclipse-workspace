package arraysrepetidos;

public class repetidos {

	final static int TAM=5;
	final static int LIM=10;
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
	public static int contar(int []a,int []b) {
		int contar=0;
		for(int i=0;i<TAM;i++) {
			if(a[i]==b[i])
				contar++;
		}
		return contar;
	}
	public static void main(String[] args) {
		// programa que genere de forma aleatoria 5 valores entre 1 y 10 que se guarden en un array 
		//si alguno de los numeros ya se encuentra en el arra es decir esta repetido debe indicarlo con un mensaje 
		int array[]=new int[TAM];
		//generamos valores aleatorios y los almacenamos en el array
		for(int i=0;i<TAM;i++) {
			array[i]=(int)(Math.random()*LIM+1);
			System.out.print("[i="+i+"]"+array[i]+": ");
			System.out.print("\t -->Anteriores: ");
			for(int j=0;j<i;j++)
				System.out.print(array[j]+" ");
			System.out.println();
		}

	}

}
