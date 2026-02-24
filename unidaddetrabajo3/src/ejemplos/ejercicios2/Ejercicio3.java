package ejemplos.ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Pedir una nota de 1 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien, Notable, Sobresaliente.
		
		Scanner sc=new Scanner(System.in);
		try {
			float num;
			do {
				System.out.print("Dime un numero: ");
				num=sc.nextFloat();
			}while(num<1 || num>10);
			if(num>=1 && num<5) {
				System.out.println("insuficiente");
			}else if(num==5) {
				System.out.println("suficiente");
			}else if(num>5 && num<7) {
				System.out.println("bien");
			}else if(num>=7 && num<9) {
				System.out.println("notable");
			}else if(num>=9 && num<=10) {
				System.out.println("sobresaliente");
			}
		
		}catch(InputMismatchException ime) {
			System.out.println("ERROR");
		}finally {
		sc.close();
		}
		

	}

}
