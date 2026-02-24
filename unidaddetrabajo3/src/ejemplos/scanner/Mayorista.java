package ejemplos.scanner;

import java.util.Scanner;

public class Mayorista {

	public static void main(String[] args) {
		// creamos el escaner
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Escribe un numero: ");
			int num1=sc.nextInt();
			System.out.print("otro numero: ");
			int num2=sc.nextInt();
			System.out.print("ultimo numero: ");
			int num3=sc.nextInt();
			if (num1>num2) {
				System.out.println(num1);
			}	else if (num1>num3) {
					System.out.println(num1);
			}else if (num2>num1) {
				System.out.println(num2);
			}else if (num2>num3) {
				System.out.println(num2);
			
			}else if(num3>num1)  {
				System.out.println(num3);
			}else if(num3>num2) {
				System.out.println(num3);
			}
		}catch(Exception e){
			System.err.println("solo se admiten numeros enteros");
			
		}
sc.close();
	}

}
