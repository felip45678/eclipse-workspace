package ejemplos.ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
static final int TOTAl=5;
	public static void main(String[] args) {
		// Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
		Scanner sc=new Scanner(System.in);
		try {
			int num=0,contar=0;
			for(int i=1;i<=5;i++){
				System.out.print("dime las calificaciones: ");
				num=sc.nextInt();
				if(num<TOTAl){
				contar++;
				}
			}if(contar>0) {
					System.out.println("hay "+contar+" suspensos");
				}
			
		}catch(InputMismatchException ime){
			System.out.println("ERROR");
		}finally {
			sc.close();
		}

	}

}

		
		
		