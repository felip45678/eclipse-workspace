package ejemplos.aserciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Horaok {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int hora, minuto, segundos;
			// leemos las horas
			System.out.print("dime la hora: ");
			hora = sc.nextInt();
			if (hora < 0 || hora > 23) {
				System.out.println(">>Hhoras fuera de rango permitido");
			} else {
				System.out.print("dime los minutos: ");
				minuto = sc.nextInt();
				if (minuto < 0 || minuto > 59) {
					System.out.println(">>Minutos fuera de rango permitido");
				} else {
					// leemos los segundos
					System.out.print("dime los segundos: ");
					segundos = sc.nextInt();
					if (segundos < 0 || segundos > 59) {
						segundos = sc.nextInt();
						System.out.println(">>segundos fuera de rango permitido");

					} else {
						System.out.println("la hora introducida es correcta!!!");
					}
				}

			}
		} catch (InputMismatchException ime) {
			System.out.println("ERROR");
		} finally {
			sc.close();
		}
	}

}
