package ejemplos.ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		// Pedir un número entre 1 y 999 y mostrarlo con las cifras al revés.
		Scanner sc=new Scanner(System.in);
		try {
			int num;
			do {
				System.out.print("Dime un numero: ");
				num=sc.nextInt();
			}while(num<1 || num>999);
			int valor=0;
			System.out.println(num/valor);//lanzara una excepcion por dividir entre cero
			System.out.println("hola");//no llega a ejecutarse
		}catch(InputMismatchException ime) {
			//se ejecuta si la excepcion es la introduccion de un valor que no sea entero
			System.out.println("ERROR");
			
		}catch(Exception e) {
			//se ejecuta si se ha producido cualquier otra excepcion
			System.out.println("ERROR");
		}finally {
		sc.close();
		}
	}

}
