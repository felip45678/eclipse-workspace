package wjercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		// Programa que lea una serie de números enteros y obtenga su media. Un número negativo indicará el fin de datos.
		//creamos el lector
		Scanner sc=new Scanner(System.in);
		try {
			//asiganmos valor a las variables 
			int totaldenumeros=0;
			int sumadenumeros=0;
			System.out.print("dime un numero: ");
			int num=sc.nextInt();
			//crearemos el bucle que nos pida numeros hasta que introduzcamos u8n numero negativo
			while(num>=0) {
				System.out.print("dime otro numero: ");
				num=sc.nextInt();
				sumadenumeros+=num;
				totaldenumeros++;
			}
			if(num!=0) {
				System.out.println("la media es: "+(float)sumadenumeros/totaldenumeros);
			}
		}catch(InputMismatchException ime) {
			System.out.println("ERROR");
		}

		sc.close();

	}

}
