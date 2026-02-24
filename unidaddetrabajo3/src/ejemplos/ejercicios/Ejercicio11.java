package ejemplos.ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// Programa que lea un número entero positivo N y escriba la tabla de dobles y triples desde 1 hasta N.
		Scanner sc= new Scanner(System.in);
		try {
			System.out.print("dime un numero entero positivo: ");
			int num=sc.nextInt();
			if (num<=0) 
				System.err.println("ERROR no has introducido un numero positivo");
			
			for(int conta=1;conta<=num;conta++) 
				System.out.println(conta+"\t"+(2*conta)+"\t"+(3*conta));
				
			
			
			
			
		}catch (Exception e) {
			System.out.println("ERRROR");
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
