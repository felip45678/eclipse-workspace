package wjercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio29 {
public static boolean Primos(int num) {
	if(num<=1) {
		return false;
	}else {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
}
	public static void main(String[] args) {
		//Programa que, dado un número entero positivo introducido por teclado, visualice por pantalla todos los números
		//primos menores que él. Ejemplo:
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("dime un numero: ");
			int num=sc.nextInt();
			for(int i=2;i<num;i++) {
				if(Primos(i)){
					System.out.print("  "+i);
				}
			}
		}catch(InputMismatchException ime) {
			System.out.println("ERROR");
		}sc.close();
	}

}
