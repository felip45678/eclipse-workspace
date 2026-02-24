package string;

import java.util.Scanner;

public class SubCadenas {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		//.1pedimos la usuario que introduzca una cadena de carracteres
		System.out.print("Introduce la cadena: ");
		String cadena=sc.nextLine().trim();
		//2.pedimos al usuario que introduzca una subcadena de caracteres
		System.out.print("Introdu e la subcadena: ");
		String subcadena=sc.nextLine().trim();
		sc.close();
		if(cadena.indexOf(subcadena)==-1)
			System.out.println("No hemos encontrado la subcadena "+subcadena+" Dentro de la cadena "+cadena);
		else
			System.out.println("la subcadena se encuentra en "+cadena);
		
	}

}
