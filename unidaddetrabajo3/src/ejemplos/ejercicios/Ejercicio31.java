package ejemplos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio31 {
	public static int divisor(int num) {
		int div = 1;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				div = i;
		}
		return div;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		try {
			
			int num;
			do {
			System.out.print("dime un numero entero: ");
			num=sc.nextInt();
			
			System.out.println(divisor(num));
			}while(num>0);
		}catch(InputMismatchException e) {
			System.out.println("error");
		}
		
		
		
		
		
		
		sc.close();

	}

}
