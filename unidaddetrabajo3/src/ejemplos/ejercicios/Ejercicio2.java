package ejemplos.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	/**
	 * funcion para saber el menor de los tres numeros
	 * @param num1 primer valor
	 * @param num2 segundo valor
	 * @param num3 tercer valor
	 * @return nos devuelve el menor de los tres
	 */
	public static int menor(int num1,int num2,int num3) {
		if (num1<num2) {
		 if (num1<num3)
			return num1;
		 else 
			 return num3;
		}else if (num2<num3)
			return num2;
			else 
				return num3;
		
		}
					

	public static void main(String[] args) {
		// creamos el scanner
		Scanner sc= new Scanner(System.in);
		try {
			System.out.print("introduce un valor entero: ");
			int num1=sc.nextInt();
			System.out.print("introduce otro valor entero: ");
			int num2=sc.nextInt();
			System.out.print("introduce un ultimo valor entero: ");
			int num3=sc.nextInt();
			System.out.println("el menor de los tres es: "+menor(num1,num2,num3));
		}catch (Exception e) {
			System.err.println("ERROR solo se admiten introducir numero enteros");
		}
	sc.close();
	
	}

}
