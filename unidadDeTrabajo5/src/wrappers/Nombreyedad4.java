package wrappers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nombreyedad4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		try {
		
			System.out.print("introduce tu edad: ");
			String edad=sc.nextLine();
			int e=Integer.parseInt(edad);
			System.out.print("ntroduce tu nombre: ");
			String nombre=sc.nextLine();
			
			System.out.println("te llamas "+nombre+" y tu edad es "+e+" años.");
			System.out.println(" el año que viene tendras "+(e+1));
		}catch(InputMismatchException ime) {
			System.out.println("error");
		}finally {
			sc.close();
		}
	}

}
