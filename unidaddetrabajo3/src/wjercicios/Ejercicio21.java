package wjercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// 21. Programa que lea 10 números por teclado y diga cuál ha sido el mayor y cuál el menor de los números introducidos.
		Scanner sc =new Scanner(System.in);
		try {
			int num,menor,mayor;
			System.out.print("dime el primer numero: ");
			mayor=menor=num=sc.nextInt();
			for(int i=1;i<10;i++) {
				System.out.print("dime otro numero: ");
				num=sc.nextInt();
				if (num<menor)
					menor=num;
					
					if (num>mayor)
						mayor=num;
			}
			System.out.println(menor);
			System.out.println(mayor);
			
			
			
			
			
			
			
		}catch(InputMismatchException ime) {
			System.out.println("error");
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
