package arrays;

public class Ejemplo5 {

	public static void imprimir(int array[]) {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
	public static void main(String[] args) {
		// 1.declaramos y creamos el array
		int[]vector = {1,2,3,4,5,6,7,8};
		//2.visualizamos el array
		System.out.println("vector: ");
		imprimir(vector);
		//3.incrementamos los valores pares y decrementamos los valores impares
		System.out.println("\nvalores pares e impares: ");
		for(int i=0;i<vector.length;i++) {
			if(vector[i]%2==0) {
				vector[i]++;
			}else {
				vector[i]--;
			}
			
		}
		//4.visualizamos el array con las modificaciones
		imprimir(vector);
			
		//5.multiplicamos por 10 los valores impares
		for(int i=0;i<vector.length;i++) {
			if(vector[i]%2!=0)
				vector[i]*=10;
		}
		
		//6visualizamos el array con los valores actuales
		System.out.println();
		imprimir(vector);
	}

}
