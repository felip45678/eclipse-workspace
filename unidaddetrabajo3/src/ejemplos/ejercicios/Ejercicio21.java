package ejemplos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio21 {
	public static int total = 5;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			int num,mayor,menor;
			System.out.print("dime el primer valor: ");
			mayor=menor =sc.nextInt();
		
			for(int i=1;i<total;i++) {
				System.out.print("dime un valor: ");
				num=sc.nextInt();
			
			if (num>mayor)
				mayor=num;
			if (num<menor)
				menor=num;
			}
			System.out.println("mayor "+mayor);
			System.out.println("menor "+menor);
		} catch (InputMismatchException ime) {
			System.out.println("error");
		}

		sc.close();
	}

}
