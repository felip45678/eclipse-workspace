package ejemplos.entero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Enterotest {

	public static void main(String[] args) {
		Entero num=new Entero();
		Scanner sc=new Scanner (System.in);
		try {
		System.out.print("dime un numero entero: ");
		num.setNumero(sc.nextInt());
		if(num.cero())
			System.out.println("valor del numero: "+num.getNumero());
		else {
		System.out.println("\nnumero: "+num.getNumero());
		System.out.println("doble: "+num.doble());
		System.out.println("triple: "+num.triple());
		System.out.println("mitad: "+num.mitad());
		System.out.println("elevado a 0: "+num.potencia(0) );
		System.out.println("elevado a 1: "+num.potencia(1) );
		System.out.println("elevado a 2: "+num.potencia(2) );
		System.out.println("elevado a 3: "+num.potencia(3) );
		System.out.println("elevado a 4: "+num.potencia(4) );
		if(num.par()) {
			System.out.println("el numero es par");
		}else {
			System.out.println("el numero no es par");
		}
		if(num.esPrimo()) {
			System.out.println("el numero es primo");
		}else {
			System.out.println("el numero no es primo");
		}
		}
		}catch(InputMismatchException ime) {
			System.out.println("error");
		}finally {
			sc.close();
		}
	}

}
