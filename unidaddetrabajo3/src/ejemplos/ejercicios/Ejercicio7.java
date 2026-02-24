package ejemplos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Programa que pida al usuario un número repetidamente hasta que el número introducido esté entre 1 y 10.
		// ceclaramos y creamos el lector
		Scanner sc =new Scanner(System.in);
		try {
			//pedimos al usuario que introduzca el primer valor y lo leemos 
			
			int num;
			//mientras el numero no se encuentre entre 1 y 10 seguimos pidiendo
		do {
			System.out.print("dime un valor entre 1 y 10: ");
			num=sc.nextInt();
			if (num<1 ||num>10)
				System.out.println("<<no se encuentra entre 1 y 10");
		
		}while (num<1 ||num>10) ;
		
		System.out.println("Has introducido el valor "+num);
		}catch(InputMismatchException ime) {
			System.out.println("ERROR");
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		

	}

}
