package ejemplos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio32 {
public static int divisor(int num) {
	int div=1;
	for(int i=2;i<num;i++) {
		if(num%i==0)
			div=i;
	}
	return div;
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in) ;
		try {
			int num=1;
			int contar=0;
			num=Math.abs(num);
			
			do {
			System.out.print("dime un numero entero: ");
			num=sc.nextInt();
			
			System.out.println(">el mayor divisor de "+num+" es "+divisor(num));
			if(num<1||num>100) {
				System.out.println("el numero esta fuera de rango");
				contar++;
				
			}
			}while(num!=0);
			System.out.println(">numero de errores cometidos: "+contar);
			
		}catch(InputMismatchException e) {
			System.out.println("error");
		}
		sc.close();

	}

}
