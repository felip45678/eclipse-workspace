package wjercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		// Programa que lea números enteros entre -100 y 100 hasta que se introduzca el número cero. Imprimir por
		//pantalla cuál ha sido el mayor y cuál el menor entre los números introducidos, y la media entre ambos. Ejemplo:
			//si imagináramos el programa ejecutándose en el ordenador, nos debería aparecer por pantalla algo como esto:
		Scanner sc=new Scanner(System.in);
		try {
			
			System.out.print("dime un numero: ");
			int num=sc.nextInt();
			if(num>-100 && num<100) {
			int menor=num;
			int mayor=num;
			while(num!=0) {
				if(num<menor) {
					menor=num;
				}if(num>mayor) {
					mayor=num;
				}
				System.out.print("dime otro numero: ");
				num=sc.nextInt();
			}
			System.out.println("el numero menor es: "+menor);
			System.out.println("el numero mayor es: "+mayor);
			System.out.println("la media es: "+(double)mayor/menor);
			
			
			
			
			
			
			}
		}catch(InputMismatchException ime) {
			System.out.println("ERROR");
		}
		sc.close();
		
		
	}

}
