package arraysOrdenacion;

import java.util.Scanner;

public class Ejerc9 {

	public static boolean iguales(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;

		}
		return true;
	}

	public static void mostrar(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void ordenar(int[] a) {
		int aux;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i - 1; j++) {
				if (a[j] > a[j + 1]) {
					aux = a[j + 1];
					a[j + 1] = a[j];
					a[j] = aux;

				}
			}
		}
	}

	public static void main(String[] args) {
		// programa que lea dos conjuntos de valores enteros y los almacene cada uno en
		// un arrya,el prograa,haciendo uso de funciones,debe indicar si los arrays
		// son iguales(es,decir si almacenan los mismos valores en las mismas
		// posiciones) y si almacenan el mismo conjunto de numero ssin importar el orden
		//
		int[] a = new int[5];
		int[] b = new int[5];
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("vector A");
			for (int i = 0; i < a.length; i++) {
				System.out.print("valor[" + i + "]:");
				a[i] = sc.nextInt();
			}
			System.out.println("vector B");
			for (int i = 0; i < b.length; i++) {
				System.out.print("valor[" + i + "]:");
				b[i] = sc.nextInt();
			}
		} catch (Exception e) {
			System.out.println("error");
		} finally {
			sc.close();
		}
		System.out.println("vector a");
		mostrar(a);
		System.out.println("\nvector b");
		mostrar(b);
		System.out.println();
		if (iguales(a, b)) {
			System.out.println("son iguales");
		}else {
			System.out.println("no son iguales");
		} 
		ordenar(a);
		ordenar(b);
		if(!iguales(a,b))
			System.out.println("son equivalentes");
	}
}
