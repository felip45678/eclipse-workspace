package arrays;

public class Ejemplo2mejorado {
	
	private static void imprimir(int array[]) {
		for(int i=0;i<array.length; i++)
			System.out.print(array[i]+" ");
	}
	public static void main(String[] args) {
		// array
		int A[]=new int[10];
		System.out.println("Longitud: "+A.length);
		//mostramos la longitud del array
		
		//mostramos los valores contenidos en el array
		System.out.print("valores iniciales: ");
		imprimir(A);
		
		//asignamos nuevos valores que guardamos en las posiciones del array
		for(int i=0;i<A.length;i++)
			A[i]=i+1;
		
		//mostramos los valores contenidos en el array
		System.out.print("\nvalores actuales: ");
		imprimir(A);
		
		//mostramos los valores contenidos en el array en modo inverso
		System.out.print("\nvalores inverso: ");
		for(int i=A.length-1;i>=0;i--)
			System.out.print(A[i]+" ");
	}

}
