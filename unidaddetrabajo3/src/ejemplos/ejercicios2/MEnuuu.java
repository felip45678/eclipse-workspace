package ejemplos.ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MEnuuu {
	public static void tablamulti(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + num + " = " + i * num);
		}
	}

	public static void menu() {
		System.out.println("\n------MENU-----");
		System.out.println("1) Introducir un número ");
		System.out.println("2) Mostrar el número introducido N");
		System.out.println("3) Contar desde 1 hasta N");
		System.out.println("4) Mostrar los divisores de N");
		System.out.println("5) Mostrar la tabla de multiplicar de N");
		System.out.println("6) Salir");
	}
	public static void vdvi(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				System.out.println(i+" ");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int opcion, num = 0;
			boolean introducido = false;
			do {
				menu();
				do {
					System.out.print("elige una opcion: ");
					opcion = sc.nextInt();
					switch (opcion) {
					case 1:
						do {
							System.out.print("1) Introduce un número: ");
							num = sc.nextInt();
							if (num <= 0)
								System.out.println(">>debe ser un numero positivo");
						} while (num <= 0);
						introducido = true;
						break;
					case 2:
						if (introducido) {
							System.out.print(">> el numero introducido es: " + num);
						} else {
							System.out.println(">>>primero debes introducir el valor de n");
						}
						break;
					case 3:
						if (introducido) {
							System.out.println(" Contaremos desde 1 hasta " + num);
							for (int i = 1; i <= num; i++) {
								System.out.print(i);
							}
						} else {
							System.out.println(">>>primero debes introducir el valor de n");
						}
						break;
					case 4:
						if (introducido) {
							vdvi(num);
						} else {
							System.out.println(">>>primero debes introducir el valor de n");
						}
						break;
					case 5:
						if (introducido) {
							tablamulti(num);
						} else {
							System.out.println(">>>primero debes introducir el valor de n");
						}
						break;
					case 6:System.out.println("\nFIN del programa...bye bye");break;
					default:System.out.println("la opcion elegida no es valida");break;
					}
				} while (opcion < 1 || opcion > 6);
			} while (opcion != 6);
		} catch (InputMismatchException ime) {
			System.out.println("error");
		} finally {
			sc.close();
		}

	}

}
