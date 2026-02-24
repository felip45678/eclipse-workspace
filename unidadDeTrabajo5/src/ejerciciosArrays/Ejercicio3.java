package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio3 {

	final static int TOTAL=10;
	/**
	 * funcion que muestra la media 
	 * @param array
	 * @return
	 */
	public static int media(int array[]) {
		int media=array[0];
		for(int i=0;i<TOTAL;i++) {
			media+=array[i];
		}
		return media/TOTAL;
	}
	/**
	 * funcion que muestra el mayor de numeros introducidos
	 * @param array
	 * @return
	 */
	public static int mayor(int array[]) {
		int mayor=array[0];
		for(int i=1;i<TOTAL;i++) {
			if(i>mayor)
				mayor=i;
			}
		return mayor;
	}
	/**
	 * funcion que muestra el menor de los numeros introducidos
	 * @param array
	 * @return
	 */
	public static int menor(int array[]) {
		int menor=array[0];
		for(int i=1;i<TOTAL;i++) {
			if(i<menor)
				menor=i;
			}
		return menor;
	}
	public static void main(String[] args) {
		// Igual que el anterior, pero implementa una función para cada tarea (media, mayor y menor de los elementos
		//almacenados en un array pasado como parámetro).
		int array[]=new int[TOTAL];
		Scanner sc=new Scanner(System.in);
		try {
			for(int i=0;i<TOTAL;i++) {
				System.out.print("numero "+i+":");
				array[i]=sc.nextInt();
			}
		}catch(Exception e) {
			System.err.println("los valores introducidos no son correcvtos");
		}finally {
			sc.close();
		}
		
		System.out.println(media(array));
		System.out.println(mayor(array));
		System.out.println(menor(array));
		
	}

}
