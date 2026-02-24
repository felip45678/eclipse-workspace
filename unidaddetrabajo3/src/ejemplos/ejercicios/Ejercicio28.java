package ejemplos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio28 {
public static boolean esPrimo(int N) {
	if (N<=1)
		return false;
	else {
		for(int i=2;i<=N/2;i++) {
			if (N%i==0)
				return false;
		}
		return true;
	}
}
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("dime un valor entero: ");
			int num=sc.nextInt();
			sc.close();
			
			if (esPrimo(num)) {
				System.out.println(num+" es primo");
			}else
				System.out.println(num+" no es primo");
		}catch(InputMismatchException e) {
			System.out.println("ERROR");
		}
		

	}

}
