package ejemplos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio30while {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		try {
			System.out.print("dime un valor entero: ");
				int num=sc.nextInt();
		
			while(num!=0){
				
				if(num<0) 
					System.out.println("error no es un valor positivo");
					else {
					
					if(Ejercicio28.esPrimo(num))
						System.out.println("es primo");
						
					else
						System.out.println(">no es primo");
					}
				
			System.out.print("dime otro valor entero: ");
				num=sc.nextInt();	
			}
		}catch(InputMismatchException ime) {
			System.out.println("error");
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
