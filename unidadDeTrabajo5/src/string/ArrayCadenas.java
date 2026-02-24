package string;

import java.util.Scanner;

public class ArrayCadenas {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		//.1pedimos la usuario que introduzca una cadena de carracteres
		System.out.print("Introduce la cadena: ");
		String cadena=sc.nextLine().trim();
		sc.close();
		//".transformar el string a un array de caracteres
		char[] array=cadena.toCharArray();
		
		//3mostramos el primer caracter del string y el primer caracter del array
		
		System.out.println("primer caracter del string: "+cadena.charAt(0));
		System.out.println("primer caracter del array: "+array[0]);
		
		//3mostramos el ultimo caracter del string y el ultimo caracter del array
		
		System.out.println("primer caracter del string: "+cadena.charAt(cadena.length()-1));
		System.out.println("primer caracter del array: "+array[array.length-1]);
		
		//5mostramos por pantalla el string y el array
		System.out.println("String :"+cadena);
		System.out.println("Array :");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}

	}

}
