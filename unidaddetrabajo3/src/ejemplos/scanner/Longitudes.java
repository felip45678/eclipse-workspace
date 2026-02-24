package ejemplos.scanner;

import java.util.Scanner;

public class Longitudes {
	final static double PI = 3.1416;
	public static double area(double radio) {
		return PI*radio*radio;
	}
	public static double longitud(double radio) {
		return 2*PI*radio;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("dime el radio: ");
			int radio=sc.nextInt();
			//mostramos la longitud de la circunferencia de radio r
			System.out.println("la area es: "+area(radio));
			System.out.println("la longitud es: "+longitud(radio));
		}catch(Exception e) {
			System.out.println("solo se permiten numeros ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
