package wjercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio15 {
	
	
	/**
	 * funcion que convierte un numereo en letras
	 * @param n numero introducido
	 * @return nos devuelve los numero devueltos como letras que corresponden a su valor 
	 */
	public static String numerosromanos(int n ) {
		String resultado=" ";
		int num=Math.abs(n);
		while (num>=1000) { num-=1000;resultado+="M";}
		if (num>=900) {num-=900;resultado+="CM";}
		if (num>=500) {num-=500;resultado+="D";}
		if (num>=400) {num-=400;resultado+="CD";}
		while (num>=100) { num-=100;resultado+="C";}
		if (num>=90) {num-=90;resultado+="XC";}
		if (num>=50) {num-=50;resultado+="L";}
		if (num>=40) {num-=40;resultado+="XL";}
		while (num>=10) { num-=10;resultado+="X";}
		if (num>=9) {num-=9;resultado+="IX";}
		if (num>=5) {num-=5;resultado+="V";}
		if (num>=4) {num-=4;resultado+="IV";}
		while (num>=1) { num-=1;resultado+="I";}
		return resultado;
	}
	public static void main(String[] args) {
		// declaramos el scanner
		Scanner sc= new Scanner(System.in);
		try {
			System.out.print("esccribe un numero: ");
			int num= sc.nextInt();
		System.out.print(numerosromanos(num));
			
	
		
		
		
		}catch (InputMismatchException ime) {
			System.err.println("ERROR ");
			
		}
		
		
		
		
		sc.close();

	}

}
