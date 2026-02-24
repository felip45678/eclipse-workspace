package arrays;

public class Ejemplo3 {

	/**
	 * funcion que muestra por pantalla los valores de el array
	 * @param array
	 */
	public static void imprimir(int array[]) {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
	//programa principal 
	public static void main(String[] args) {
		// primer array
		int A[]=new int[5];  //A=[0,0,0,0,0]
		
		//segundo array
		int B[]= {10,20,30,40}; //B=[10,20,30,40]
		
		//mostramos las longitudes de los arrays
		System.out.println("Longitud de A: "+A.length);
		System.out.println("Longitud de B: "+B.length);
		
		//mostramos los valores que contienen los arrays
		System.out.print("A: ");
		imprimir(A);
		System.out.print("B: ");
		imprimir(B);
		//aumentamos en 1 los valores almacenados en A
		for(int i=0;i<A.length;i++)
			A[i]++;
		//decrementamos en 1 los valores almacenados en B
		for(int i=0;i<B.length;i++)
			B[i]--;
		//mostramos los valores actualizados de A y B
		System.out.print("\n\nA: ");
		imprimir(A);
		System.out.print("\n\nB: ");
		imprimir(B);
	}

}
