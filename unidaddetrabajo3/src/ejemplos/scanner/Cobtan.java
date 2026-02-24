package ejemplos.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cobtan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Dime un valor entero positivo");
			int num=sc.nextInt();
			System.out.println("contamos desde 1 a "+num);
			int contar=1;
			System.out.print("contamos con while ");
			while(num>=contar) {
				System.out.print(contar+" ");
				contar++;
			}System.out.println();
			System.out.print("contamos con for ");
			for( contar=1;num>=contar;contar++)
				System.out.print(contar+" ");
			System.out.println();
			System.out.print("contamos con do while ");
			contar=1;
			do {
				System.out.print(contar+" ");
				contar++;
			}while (num>=contar);
				
			
		
		}catch(InputMismatchException e) {
			System.err.println("error no has introducido un numero entero");
		}catch(ArithmeticException wey) {
			System.err.println("no se puede dividir entre cero perroflauta");
		}
		sc.close();
		}
			
	}



