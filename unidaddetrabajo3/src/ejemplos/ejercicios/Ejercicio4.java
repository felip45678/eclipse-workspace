package ejemplos.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// inicializamos el scanner
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("dime un numero de un solo digito: ");
		int num=sc.nextInt();
		switch(num) {
		case 1:System.out.println("uno");break;
		case 2:System.out.println("dos");break;
		case 3:System.out.println("tres");break;
		case 4:System.out.println("cuatro");break;
		case 5:System.out.println("cinco");break;
		case 6:System.out.println("seis");break;
		case 7:System.out.println("siete");break;
		case 8:System.out.println("ocho");break;
		case 9:System.out.println("nueve");break;
		default :break;
		
		}
		}catch(Exception e) {
			System.err.println("ERROR!!no has introducido un valor valido");
		}
	sc.close();}

}
