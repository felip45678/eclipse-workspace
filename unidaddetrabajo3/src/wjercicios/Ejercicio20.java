package wjercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio20 {
public static void pares(int num1 ,int num2) {
	for(int i=num1;i<=num2;i++)
		if(i%2==0)
	System.out.println(i+" ");
}
	public static void main(String[] args) {
		//20. Programa que lea dos números positivos e imprima por pantalla, de forma ascendente (desde el menor hasta el
		//mayor), todos los números pares que estén entre los dos números dados.
		Scanner sc=new Scanner(System.in);
		try {
			int num1,num2;
		do {
			System.out.print("dime un numero: ");
			num1=sc.nextInt();
					
		}while(num1<=0);
		
		do {
			System.out.print("dime otro numero: ");
			num2=sc.nextInt();
					
		}while(num2<=0);
		if (num1<num2)
	pares(num1,num2);
		else
			pares(num2,num1);
	
		}catch (InputMismatchException e) {
			System.out.println("error");
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
