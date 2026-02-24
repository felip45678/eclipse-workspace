package ejemplos.ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {
	public static int TOTAL=100;
	public static int random(int n) {
		return (int)(Math.random()*TOTAL+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			int num,random=random(TOTAL);
			int contar=0;
			do {
				System.out.print("dime un numero: ");
				num=sc.nextInt();
				if(num<random) {
					System.out.println("el numero es mayor");
				}if(num>random) {
					System.out.println("el numero es menor");
				}
				
				contar++;
				
			}while(num!=random);
			
				System.out.println("has acertado el numero: "+random);
				System.out.println("numero de intentos: "+contar);
		}catch(InputMismatchException ime) {
			System.out.println("error");
		}finally {
		sc.close();
		}
	}

}
