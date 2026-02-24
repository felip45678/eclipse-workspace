package ejemplos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio13 {
public static void tablamulti(int n) {
	for (int i=1;i<=10; i++)
		System.out.println(n+" x "+i+" = "+(i*n));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {

			
			int num;
			do{
				System.out.print("escribe un numero entre 1 y 10: ");
				num = sc.nextInt();
				
			}while (num<1 || num>10);
			tablamulti(num);
			
		} catch (InputMismatchException e) {
			System.out.println("ERROR");
		}

		sc.close();
	}

}
