package arrays;

public class Ejemplo8 {

	public static void imprimir(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		//creamos el array
		int A[]= {1,3,5,7,9};
		int[] B= {2,4,6,8,10};
		int C[]=new int[A.length+B.length];
		int i=0;//indice para el array c
		for(int j=0;j<A.length;j++) {
			
			C[i]=A[j];
			i++;
			
			
		}
		for(int j=0;j<B.length;j++) {
			C[i]=B[j];
			i++;
	}
		imprimir(A);
		System.out.println();
		imprimir(B);
		System.out.println();
		imprimir(C);
	}

}
