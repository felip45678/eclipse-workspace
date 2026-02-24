package ejemplos.fraccion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fraccionestested {

	public static void main(String[] args) {
		Fracciones t1=new Fracciones();
		Fracciones t2=new Fracciones();
		Scanner sc=new Scanner (System.in);
		try {
			System.out.println("dos fracciones equivalentes cuando representan la misma cantidad pero se escriben distinto.introduce dos fracciones para comprobar si son o no equivalentes");
			System.out.println();
			System.out.println("Primera fraccion");
			System.out.print("	Numerador:");
			t1.setNumerador(sc.nextInt());
			System.out.print("	denominador:");
			t1.setDenominador(sc.nextInt());
			System.out.println();
			System.out.println("segunda fraccion");
			System.out.print("	Numerador:");
			t2.setNumerador(sc.nextInt());
			System.out.print("	denominador:");
			t2.setDenominador(sc.nextInt());
			System.out.println("\nLas fracciones "+t1+" y "+t2);
			t1.equivalente(t2);
			if(t1.equivalente(t2))
				System.out.print("EQUIVALENTES");
			else
				System.out.print(" NO EQUIVALENTES");
			
		}catch(InputMismatchException ime) {
			System.out.println("error");
		}finally {
			sc.close();
		}
	}

}
