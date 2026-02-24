package wjercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		//Programa que lea un entero positivo introducido por el usuario y que muestre por pantalla todos sus divisores.
		//Ejemplo:
		Scanner sc=new Scanner (System.in);
		try {
			
			System.out.print("dime un numero entero: ");
			int num=sc.nextInt();
			if(num<=0) {
				System.out.println("ERROR !!NO HAS INTRODUCIDO UN VALOR VALIDO");
			}else {
				for(int divisores=1;divisores<=num;divisores++)
					if(num%divisores==0) {
						System.out.print(divisores+" ");
					}
				
			}
			
		}catch(InputMismatchException ime) {
			System.out.println("ERROR");
		}
		
		sc.close();
	}

}
