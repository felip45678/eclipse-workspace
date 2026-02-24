package ejemplos.scanner;

import java.util.Scanner;

public class Sumas {

	public static void main(String[] args) {
		// iniciamos el teclado
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("introduce 2 numeros enteros");
			System.out.print("primer numero: ");
			int num1=sc.nextInt();
			System.out.print("segundo numero: ");
			int num2=sc.nextInt();
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
			System.out.println(num1+" * "+num2+" = "+(num1*num2));
			if (num2!=0) {
				System.out.println(num1+" / "+num2+" = "+(num1/num2));
				System.out.println(num1+" % "+num2+" = "+(num1%num2));
			}else {
				System.out.println("no se puede dividir entre cero");
			}
		}catch(Exception e) {
			System.out.println("error no has introducido un numero entero");
		}
		sc.close();
	}

}
