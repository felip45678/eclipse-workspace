package wjercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		// Programa que lea números y acepte únicamente aquellos que sean mayores que el último introducido
		//correctamente. Ejemplo: si doy 3, 5, 25, 16 deberá dar un mensaje de error al introducir el 16, pues el siguiente
		//número debería ser mayor que 25. El programa terminará cuando se introduzca un cero. Al final, el programa
		//mostrará el número de errores que se han cometido.

		//creamos el scanner
		Scanner sc=new Scanner(System.in);
		try {
		//inicializamos y creamos las variables
			int errores=0;
			System.out.print("dime un numero: ");
			int num=sc.nextInt();
			int numultimo=num;
		//creamos el bucle
			while(num!=0) {
				System.out.print("dime otro numero: ");
				num=sc.nextInt();
				if(num!=0) {
				if(num<numultimo) {
					System.out.println("has introducido un valor menor que el ultimo");
					errores++;
				}else {
					numultimo=num;
				}
			}
			}
			System.out.println("FIN "+"numero de errores: "+errores);
	
		}catch(InputMismatchException ime) {
			System.out.println("ERROR");
		}

		sc.close();
		
	}

}
