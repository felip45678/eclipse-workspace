package ejemplos.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Preguntanumerovers2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int LIMITE=10;
		int aleatorio=((int)(Math.random()*LIMITE+1));
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("adivina el numero ");
			int valor=sc.nextInt();
			if(valor<1 || valor>LIMITE) {
				System.out.println("el valor que has introducido no se encuentar entre 1 y "+LIMITE);
			}else {
				if(valor==aleatorio)
					System.out.println("enhorabuena!!acertaste");
				else {
					System.out.println("no acertaste");
					System.out.println("el numero correcto era "+aleatorio);
				}
			}
			
		} catch (InputMismatchException e) {
			System.err.println("error: tipo de datos incorrecto. debes introducir un valor entero");
		}
		sc.close();
	}

}
