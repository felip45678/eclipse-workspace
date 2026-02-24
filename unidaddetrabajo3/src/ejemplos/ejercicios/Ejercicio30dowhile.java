package ejemplos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio30dowhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		try {
			int num;
			do {
				System.out.print("dime un valor entero: ");
				num=sc.nextInt();
				if(num>0) {
					if(Ejercicio28.esPrimo(num))
						System.out.println(">Es primo");
					else
						System.out.println(">no es primo");
				}else if (num<0) {
					System.out.println("error no es inn valor positivo");
				
				}
			}while (num!=0);
		}catch(InputMismatchException ime) {
			System.out.println("error");
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
