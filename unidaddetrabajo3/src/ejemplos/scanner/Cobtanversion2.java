package ejemplos.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cobtanversion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Dime un valor entero positivo: ");
			int num = sc.nextInt();
			int conta;
			// comprobamos que se trata de un entero positivo
			if (num <= 0) {
				System.err.println("no has introducido un valor positivo");
			} else {
				for (conta = 1; num >= conta; conta++) {
					System.out.print(conta + " ");
				}
				System.out.println();
				for (conta = num; conta >= 1; conta--) {
					System.out.print(conta + " ");
				}
			}
		} catch (InputMismatchException e) {
			System.err.println("error: tipo de datos incorrecto. debes introducir un valor entero");
		}
		sc.close();
	}
}