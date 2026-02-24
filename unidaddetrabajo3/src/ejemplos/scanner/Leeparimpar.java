package ejemplos.scanner;

import java.util.Scanner;

public class Leeparimpar {

	public static void main(String[] args) {
		// declaramos el scanner
		Scanner sc =new Scanner(System.in);
		int num;
		try {
			System.out.print("dime un numero");
			num=sc.nextInt();
					
		}catch (Exception e) {
			num=0;
		}
		
		if (num%2==0)
			System.out.println(num+" has introducido un numero par");
		else
			System.out.println(num+" has introducido un numero impar");
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
