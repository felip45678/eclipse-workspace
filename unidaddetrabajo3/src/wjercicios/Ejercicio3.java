package wjercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Programa que lea un número por teclado e indique si es múltiplo de 2, 3, 5 o 7.
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("dime un numero entero: ");
			int num1=sc.nextInt();
			if (num1%2==0)
				System.out.println(" el numero  "+num1+" es multiplo de dos ");
			if (num1%3==0)
				System.out.println(" el numero  "+num1+" es multiplo de tres ");
			if (num1%5==0)
				System.out.println(" el numero  "+num1+" es multiplo de cuatro ");
			if (num1%7==0)
				System.out.println(" el numero  "+num1+" es multiplo de cinco ");
			
			
			
			
			
		}catch (Exception e) {
			System.out.println("ERROR");
		}
	sc.close();
	}

}
