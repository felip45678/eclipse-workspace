package ejemplos.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("dime el numero de horas: ");
		int num1=sc.nextInt();
		System.out.print("dime el numero de minutos: ");
		int num2=sc.nextInt();
		System.out.print("dime el numero de segundos: ");
		int num3=sc.nextInt();
		if (num1<0||num1>23)
			System.err.println("no has introducido un formato horas adecuado");
		else if (num2<0||num1>59)
			System.err.println("no has introducido un formato minutos adecuado");
		else if (num3<0||num1>59)
			System.err.println("no has introducido un formato segundos adecuado");
		else
			System.out.println("la hora "+num1+":"+num2+":"+num3+" es correcta");

	}catch(Exception e) {
		System.err.println("no has introducido un formato adecuado");
	}

sc.close();}
}
