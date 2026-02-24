package ejemplos.ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Pedir un número entre 1 y 999 y mostrarlo con las cifras al revés.
		Scanner sc = new Scanner(System.in);
		try {
			int num;
			do {
				System.out.print("Dime un numero: ");
				num = sc.nextInt();
			} while (num < 1 || num > 999);
			// descomponer el numero en unidades ,decenas y centenas
			int u, d, c;
			//unidades
			u=num%10;
			//decenas
			num=num/10;
			d=num%10;
			//centenas
			num=num/10;
			c=num%10;
			//imprimimos el numero
			if(c==0) {
				if(d==0) {
					
				}else
					System.out.println(u+""+d);
			}else
				System.out.println(u+""+d+""+c);
			
			
		} catch (InputMismatchException ime) {
			System.out.println("ERROR");
		} finally {
			sc.close();
		}
	}

}
