package ejemplos.scanner;

import java.util.Scanner;

public class ElswitcheSemana {

	public static void main(String[] args) {
		//teclado
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Dime l numero de un dia de la semana: ");
			int num=sc.nextInt();
			switch (num){
			case 1:System.out.println(num+" LUNES");break;
			case 2:System.out.println(num+" MARTES");break;
			case 3:System.out.println(num+" MIERCOLES");break;
			case 4:System.out.println(num+" JUEVES");break;
			case 5:System.out.println(num+" VIERNES");break;
			case 6:System.out.println(num+" SABADO");break;
			case 7:System.out.println(num+" DOMINGO");break;
			default: System.err.println("no has introducido un valor");
		}
	}catch (Exception e) {
		System.out.println("INTRODUCE SOLO NÚMEROS ENTEROS ");
	}sc.close();

}
}
