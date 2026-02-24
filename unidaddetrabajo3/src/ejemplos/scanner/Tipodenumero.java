package ejemplos.scanner;

import java.util.Scanner;

public class Tipodenumero {

	public static void main(String[] args) {
		// Abrimos el lector
		Scanner teclado=new Scanner(System.in);
		try {
			System.out.print("Dime un valor entero: ");
			int num=teclado.nextInt();
			
			//mostramos en pantalla so es positivo,negativo o cero
			if(num>0)
				System.out.println(num+" es positivo");
			else if (num<0)
				System.out.println(num+" es negativo");
			else
				System.out.println(num+" es cero");
		}catch (Exception e) {
			System.out.println("erroe no has introducido");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		teclado.close();

	}

}
