package ejemplos.ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menuoperaciones3 {
	public static void menu() {
		System.out.println("\n------MENU-----");
		System.out.println("elige una operacion aritmetica");
		System.out.println("1) suma");
		System.out.println("2) resta");
		System.out.println("3) multiplicacion");
		System.out.println("4) division");
		System.out.println("5) potencia");
		System.out.println("6) salir");
	}
	public static int potencia(int base,int exponente) {
		int res=1;
		for(int i=1;i<=exponente;i++) {
			res*=base;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int opcion,a,b;
			do {
				//mostramos el menu
				menu();
				do {
				System.out.print("elige una opcion: ");
				opcion = sc.nextInt();
				// ejecutamos la opcion elegida por el usuario
				switch (opcion) {
				case 1:System.out.println("\nSUMA");
						//pedimos los operandos
						System.out.print("dime el primer sumando: ");
						a=sc.nextInt();
						System.out.print("dime el segundo sumando: ");
						b=sc.nextInt();
						//mostramos el resultado
						System.out.println(a+" + "+b+" = "+(a+b));
					break;
				case 2:System.out.println("\nRESTA");
						System.out.print("dime el primer minuendo: ");
						a=sc.nextInt();
						System.out.print("dime el segundo sustraendo: ");
						b=sc.nextInt();
						System.out.println(a+" - "+b+" = "+(a-b));
					break;
					
				case 3:System.out.println("\nMULTIPLICACION");
						System.out.print("dime el primer multiplicando: ");
						a=sc.nextInt();
						System.out.print("dime el segundo multiplicador: ");
						b=sc.nextInt();
						System.out.println(a+" x "+b+" = "+(a*b));
					break;
				case 4:System.out.println("\nDIVISION");
						System.out.print("dime el primer dividendo: ");
						a=sc.nextInt();
						System.out.print("dime el segundo divisor: ");
						b=sc.nextInt();
						if(b!=0)
							System.out.println(a+" / "+b+" = "+((float)a/b));
						else
							System.out.println("No se puede dividir entre cero");
					break;
				case 5:System.out.println("\nPOTENCIA");
						System.out.print("dime la base: ");
						a=sc.nextInt();
						System.out.print("dime el exponente: ");
						b=sc.nextInt();
						
						System.out.println(a+" potencia "+b+" = "+Math.pow(a,b));
					break;
				case 6:System.out.println("\nFIN del programa...bye bye");break;
				default:System.out.println("la opcion elegida no es valida");break;
				
				}
				}while(opcion<1 || opcion>6);
			} while (opcion != 6);
		} catch (InputMismatchException ime) {
			System.out.println(">error");
		} finally {
			sc.close();
		}

	}

}
