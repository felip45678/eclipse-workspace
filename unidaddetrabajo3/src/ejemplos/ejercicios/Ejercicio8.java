package ejemplos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Programa que lea un número positivo y muestre por pantalla la lista de número impares desde 2 hasta el leído.
		// declaramos el lector
		Scanner sc =new Scanner(System.in);
		try {
			System.out.print("dime un numero positivo: ");
			int num=sc.nextInt();
			if (num<=0) {
				System.out.println("ERROR el numero que has introducido no es correcto");
			}
			for(int conta=3;conta<=num;conta+=2) {
				System.out.println(conta);
			}
				
			
			
		}catch(InputMismatchException ime) {
			System.out.println("ERROR");
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
