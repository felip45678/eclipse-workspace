package repaso;

import java.util.Scanner;

public class Numbers {

	/**
	 * funcion que muestra los valores en el array 
	 * @param vector
	 */
	private static void mostrar(int[]vector) {
		for(int i=0;i<vector.length;i++) {
			System.out.print(vector[i]+" ");
		}
	}
	/**
	 * funcion que ordena los valores del array
	 * @param vector
	 */
	private static void ordenar(int[]vector) {
		int aux;
		for(int i=vector.length;i>0;i--) {
			for(int j=0;j<vector.length-1;j++) {
				if(vector[j]>vector[j+1]) {
					aux=vector[j+1];
					vector[j+1]=vector[j];
					vector[j]=aux;
				}
			}
		}
	}
	/**
	 * funcion que muestra el mayor valor del array
	 * @param vector
	 * @return
	 */
	private static int mayor(int[]vector) {
		int mayor=0;
		for(int j=0;j<vector.length;j++) {
			if(vector[j]>mayor)
				mayor=vector[j];
		}
		return mayor;
	}
	/**
	 * funcion que muestra el menor valor del array
	 * @param vector
	 * @return
	 */
	private static int menor(int[]vector) {
		int menor=vector[0];
		for(int j=0;j<vector.length;j++) {
			if(vector[j]<menor)
				menor=vector[j];
		}
		return menor;
	}
	final static int TOTAL=5;
	public static void main(String[] args) {
		//creamos el vector
		int[]vector=new int[TOTAL];
		Scanner sc=new Scanner(System.in);
		try {
			for(int i=0;i<vector.length;i++) {
			System.out.print("dime "+TOTAL+" numeros: ");
			vector[i]=sc.nextInt();
			}
		}catch(Exception e) {
			System.out.println("ERROR");
		}finally {
			sc.close();
		}

		mostrar(vector);
		ordenar(vector);
		System.out.print("\nArray ordenado: ");
		mostrar(vector);
		System.out.println("\nEl mayor: "+mayor(vector));
		System.out.println("El menor: "+menor(vector));
		
		
	}

}
