package wjercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		// Programa que lea una serie de números enteros hasta introducir el cero, y que indique cuántos números han sido
		//pares y cuántos impares.
		//creamos el scanner
		Scanner sc=new Scanner(System.in);
		try {
			//asignamos los valores a las variables 
			int pares=0;
			int impares=0;
			System.out.print("dime un numero: ");
			int num=sc.nextInt();
			Math.abs(num);
			//creamos el bucle que se repita hasta que se introduzca el cero
			while(num!=0) {
				if(num%2==0) {
					pares++;
				}else {
					impares++;
				}
				System.out.print("dime otro numero: ");
				num=sc.nextInt();
				Math.abs(num);
			}
			System.out.println("pares: "+pares);
			System.out.println("impares: "+impares);
			
		}catch(InputMismatchException ime) {
			System.out.println("ERROR");
		}
	
		sc.close();
	}

}
