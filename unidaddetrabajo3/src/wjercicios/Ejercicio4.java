package wjercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Programa que lea un número positivo de un dígito y diga en letra a qué dígito
		// corresponde. Ejemplo: si se introduce el 1, se mostrará por pantalla el
		// “uno”; si se introduce el 11, se mostrará el mensaje “Error: no es un
		// número de un dígito”.
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("dime un numero entero: ");
		int num=sc.nextInt();
		if (num>=10)
			System.out.println("el numero tiene que ser de un digito");
		switch (num){
		case 1: System.out.println("uno");break;
		case 2: System.out.println("dos");break;
		case 3: System.out.println("tres");break;
		case 4: System.out.println("cuatro");break;
		case 5: System.out.println("cinco");break;
		case 6: System.out.println("seis");break;
		case 7: System.out.println("siete");break;
		case 8: System.out.println("ocho");break;
		case 9: System.out.println("nuevo");break;
		default :System.out.println("ERROR");break;
		}
		
		
		
		
		
		
		} catch (Exception e) {
			System.out.println("error");
		}
sc.close();
	}
}
