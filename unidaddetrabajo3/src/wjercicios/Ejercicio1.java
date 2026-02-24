package wjercicios;

import java.util.Scanner;

public class Ejercicio1 {
	public static int menor(int a, int b) {
		if (a<b)
			return a;
		else
		return b;
	}
	public static void main(String[] args) {
		// Programa que determine el menor de dos números. Se leerán por teclado dos números enteros y se visualizará por pantalla el menor de los dos
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("dime un numero entero: ");
			int num1=sc.nextInt();
			System.out.print("dime otro numero entero: ");
			int num2=sc.nextInt();
		System.out.println("el menor de los numeros es: "+menor(num1,num2));
		}catch (Exception e ) {
			System.err.println("ERROR");
		}
		
		
		
		
		
		
		
		sc.close();

	}

}
