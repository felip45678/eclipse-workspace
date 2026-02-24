package ejemplos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio27v2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			
			//1. leemos hasta que sea entero positivo
			int num;
		do {
			System.out.print("escribe un numero entero positivo: ");
			num=sc.nextInt();
		}while(num<=0);
	//2.mostramos por pantalla sus divisores
		for(int i=2;i<=num/2;i++) {
			if (num%i==0)
				System.out.print(i+" ");
		}
		
					
				
			
		}catch(InputMismatchException e) {
			System.out.println("ERROR");
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
