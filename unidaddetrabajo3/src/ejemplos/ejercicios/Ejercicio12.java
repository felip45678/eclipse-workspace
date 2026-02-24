package ejemplos.ejercicios;

import java.util.Scanner;


public class Ejercicio12 {
	public static int factorial(int n) {
		int resultado=1;
		for (int conta =1; conta <= n; conta++)
			resultado=resultado*conta;
		return resultado;
	}
	public static int factor(int n) {
		int resultado=1;
		for (int conta =n; conta > 1; conta--)
			resultado*=conta;
		return resultado;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.print("escribe un numero entero positivo: ");
			int num = sc.nextInt();
			if (num <= 0)
				System.out.println("solo se admiten numeros positivos");
			else 
				System.out.println(num+"!="+factorial(num));
			
			System.out.println(num+"!="+factor(num));

		} catch (Exception e) {
			System.out.println("ERROR");
		}

		sc.close();

	}

}
