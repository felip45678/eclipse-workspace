package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo6 {

	final static int CANT=5;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			//declaramos y creamos el array
			int array[]=new int[CANT];
			//pedimos al usuario que introduzca los valores 
			System.out.println("Introduce "+CANT+" valores de tipo entero...");
			
			
			
			for(int i=0;i<array.length;i++) {
				System.out.print("Valor["+(i+1)+"]: ");
				array[i]=sc.nextInt();
				
			}
			//visualizamos los valores
			System.out.print("\nValores introducidos por teclado: ");
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
			//mostramos el mayor valor introducido
			int mayor=array[0];
			for(int i=1;i<array.length;i++) {
				if(array[i]>mayor)
					mayor=array[i];
			}
			System.out.println("\n"+mayor);
		}catch(ArrayIndexOutOfBoundsException obd) {
			System.out.println(">>>>ERROR del programador has excedido los llimites del array");
		}catch(InputMismatchException ime) {
			System.out.println(">>ERROR:valor introducido incorrecto");
		}finally {
			sc.close();
		}
	}

}
