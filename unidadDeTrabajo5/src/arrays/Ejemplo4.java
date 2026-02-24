package arrays;

public class Ejemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[]= {5,10,15,20,25,30,35,40,45,50};
		//mostramos el vector
		System.out.print("vector: ");
		for(int i=0;i<vector.length;i++)
			System.out.print(vector[i]+" ");
		//mostramos los valores almacenados en algunas posiciones 
		System.out.print("\nPrimero: ");
		System.out.print(vector[0]);
		System.out.print("\nUltimo: ");
		System.out.print(vector[vector.length-1]);
		System.out.print("\nSegundo: ");
		System.out.print(vector[1]);
		System.out.print("\nPenultimo: ");
		System.out.print(vector[vector.length-2]);
		System.out.print("\nTercero: ");
		System.out.print(vector[2]);
		System.out.print("\nAntepenultimo: ");
		System.out.print(vector[vector.length-3]);
		
	}

}
