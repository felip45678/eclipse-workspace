package wjercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// Programa que lea números hasta que le den el cero, y que diga cuál ha sido el
		// mayor y cuál el menor de los
		// números introducidos (sin tener en cuenta el cero).
		Scanner sc = new Scanner(System.in);
		try {

			int num,mayor,menor;
			System.out.print("dime un numero: ");
			num=sc.nextInt();
			if(num!=0) {
			
			menor=num;
			mayor=num;
			
			while(num!=0){
				
				if(num<menor) {
					menor=num;
				}if(num>mayor) {
					mayor=num;
				}System.out.print("dime otro numero: ");
			num=sc.nextInt();
				
			
			}
			
			
			
			
			
			System.out.println("el numero mayor es: "+mayor);
			System.out.println("el numero menor es: "+menor);
			
			}else {
				System.out.println("has introducido el cero");
			}
			
			
			
		}catch(InputMismatchException ime){
			System.out.println("ERROE GAY");
			
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
