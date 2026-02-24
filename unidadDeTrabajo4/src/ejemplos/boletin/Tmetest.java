package ejemplos.boletin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tmetest {

	public static void main(String[] args) {
		Time horas=new Time();
		Time minutos=new Time();
		Time segundos=new Time();
		Scanner sc=new Scanner (System.in);
		try {
			System.out.println("Introduce una hora....");
			System.out.print("Horas: ");
			horas.setHours(sc.nextInt());
			System.out.print("minutos: ");
			minutos.setMinutes(sc.nextInt());
			System.out.print("segundos: ");
			segundos.setSeconds(sc.nextInt());
			System.out.println(" hora introducida"+horas.toString()+minutos.toString()+segundos.toString());
		}catch(InputMismatchException ime) {
			System.out.println(">>ERROR en la introduccion de datos");
		}finally {
			sc.close();
		}
		

	}

	

}
