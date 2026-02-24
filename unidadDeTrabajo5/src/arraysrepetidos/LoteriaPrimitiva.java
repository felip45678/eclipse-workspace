package arraysrepetidos;

import java.util.Scanner;

public class LoteriaPrimitiva {

	final static int TOTAL=6;
	final static int LIM=49; //los numeros leidos y generados se encontraran entre 1 y LIMIT
	/**
	 * funcion que muestra los valores
	 * @param a
	 */
	public static void mostrar(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	public static void boobleshort(int array[]) {
		int aux;
		boolean cambio;
		for(int i=array.length;i>0;i--) {
			cambio=false;
			for(int j=0;j<i-1;j++) {
				if(array[j]>array[j+1]) {
					aux=array[j+1];
					array[j+1]=array[j];
					array[j]=aux;
					cambio=true;
				}
			}
			if (!cambio)
				return;
		}
	}
	/**
	 * funcion que muestra numeros aleatorio
	 * @param numero
	 * @return
	 */
	public static int aleatorio(int numero) {
		return (int)(Math.random()*numero+1);
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

	/**
	 * funcion que devuielve el numero de valores en un array que coinciden con los valores de otro array
	 * @param a
	 * @param b
	 * @return
	 */
	public static int contar(int []a,int []b) {
		int contar=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j])
					contar++;
			}
			
		}
		return contar;
	}
		/**
		  programa principal
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array que almacenara las apuestas del usuario (numeros leidos por teclado)
		int apuestas[]=new int[TOTAL];
		int[] ganadores=new int[TOTAL];
		
		//leemos los valores de las apuestas y los almacenamos en el array apuestas
		Scanner sc=new Scanner(System.in);
		try {
			//pedimos al ususario que introduzca los valores que alamacenamos
			System.out.println("Elige "+TOTAL+" apuestas para la loteria primitiva");
			for(int i=0;i<TOTAL;i++) {
				do {
					System.out.print("numero "+(i+1)+":");
					apuestas[i]=sc.nextInt();
					//informamos de que el numero debe encontrarse entre 1 y limit
					if(apuestas[i]<1 || apuestas[i]>LIM) {
						System.out.println(">>>El numero elegido no es valido debe estar entre 1 y "+LIM);
					}
				}while(apuestas[i]<1 || apuestas[i]>LIM);
			}
		}catch(Exception e) {
			System.err.println("los valores introducidos no son correcvtos");
		}finally {
			sc.close();
		}
		//mostramos los numeros de las apuestas del usuario
		System.out.print("\nNumeros apostados: ");
		boobleshort(apuestas);
		mostrar(apuestas);
		
		//generamos los numeros ganadores de forma aleatoria
		int num=0;
		for(int i=0;i<TOTAL;i++) {
			do {
				ganadores[i]=aleatorio(LIM);
			}while(encontrado(num,ganadores,i));
			
		}
		
		
		System.out.print("\nNumeros ganadores: ");
		boobleshort(ganadores);
		mostrar(ganadores);
		
		System.out.println("\n"+contar(apuestas,ganadores));
	}

}
