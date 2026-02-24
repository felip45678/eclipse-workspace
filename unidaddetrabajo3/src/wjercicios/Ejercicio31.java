package wjercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio31 {
public static int mayorsi(int n) {
	int num=Math.abs(n);
	int div=0;
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			div=i;
		}
	}
	return div;
}
	public static void main(String[] args) {
		// Función que reciba como parámetro un número entero, y devuelva su mayor divisor distinto del propio número.
		//Ejemplos: el mayor divisor de 6 es 3, el mayor divisor de 15 es 5, el mayor divisor de 23 es 1.
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("dime un numero: ");
			int num=sc.nextInt();
			System.out.println(mayorsi(num));
		}catch(InputMismatchException ime) {
			System.out.println("ERROR");
		}
		
		
		sc.close();
	}

}
