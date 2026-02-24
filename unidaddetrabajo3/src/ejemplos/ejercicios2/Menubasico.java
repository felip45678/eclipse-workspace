package ejemplos.ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menubasico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int opcion;
			do {
				System.out.println("\n------MENU-----");
				System.out.println("1) opcion 1");
				System.out.println("2) opcion 2");
				System.out.println("3) opcion 3");
				System.out.println("4) salir");
				// leemos la opcion que elige el usuario
				System.out.print("elige una opcion: ");
				opcion = sc.nextInt();
				// ejecutamos la opcion elegida por el usuario
				switch (opcion) {
				case 1:System.out.println("has elegido la opcion 1");break;
				
					
				case 2:System.out.println("has elegido la opcion 2");break;
				
					
				case 3:System.out.println("has elegido la opcion 3");break;
				
					
				case 4:System.out.println("fin del programa BYE Bye....");break;
				
					
				default:System.out.println("la opcion elegida no es valida");break;

				}
			} while (opcion != 4);
		} catch (InputMismatchException ime) {
			System.out.println(">error");
		} finally {
			sc.close();
		}

	}

}
