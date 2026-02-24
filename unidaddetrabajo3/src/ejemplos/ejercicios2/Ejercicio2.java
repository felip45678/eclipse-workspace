package ejemplos.ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static boolean esCapicua(int n) {
		//descomponer el numero en unidades,decenas,centenas,unidades de millar
		int u,d,c,um,dm;
		//calculamos las unidades
		u = n%10;
		//calculamos las decenas
		int num=n/10;
		d = num%10;
		//calculamos las centenas
		num= num/10;
		c=num%10;
		//calculamos las unidades de millar
		num=num/10;
		um=num%10;
		//calculamos las deceneas de millar
		num=num/10;
		dm=num%10;
		//si el numero es de cinco cifras
		if(dm==u && um==d)
			return true;
		//si el numero es de cuatro cifras
		if(dm==0 && um==u && d==c)
			return true;
		//si el numero es de tres cifras
		if(dm==0 && um==0 && c==u)
			return true;
		//si el numero es de dos cifras
		if(dm==0 && um==0 && c==0 && d==u)
			return true;
		return false;
	}
	public static void main(String[] args) {
		//Pedir un número entre 1 y 99999 y decir si es capicúa.
		Scanner sc = new Scanner(System.in);
		try {int num;
			do {
				System.out.print("dime un numero: ");
				num=sc.nextInt();
			}while(num<1 || num>99999);
			//comprobamos si el numero es capicua
			if(esCapicua(num)==true)
				System.out.println("tu numero es capicua: ");
			else
				System.out.println("tu numero no es capicua: ");
			
		} catch (InputMismatchException ime) {
			System.out.println("ERROR");
		} finally {
		sc.close();
		}

	}

}
