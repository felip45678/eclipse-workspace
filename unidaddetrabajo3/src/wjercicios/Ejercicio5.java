package wjercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Programa que determine si una hora expresada en formato horas:minutos:segundos es o no correcta. Las horas, los minutos y los segundos deben ser introducidos por teclado.
		Scanner sc=new Scanner(System.in);
		int hora, minuto,segundo;
		try {
		System.out.println("ingresa una hora: ");
		hora=sc.nextInt();
		System.out.println("ingresa los minutos: ");
		minuto=sc.nextInt();
		System.out.println("ingresa los segundos: ");
		segundo=sc.nextInt();
		
		if(hora<0 || hora>23)
			System.out.println("has introducido mal las horas");
		else 
			System.out.print(" la hora es"+hora+" : ");
		if(minuto<0 || minuto>59)
			System.out.println("has introducido mal los minutos");
		else 
			System.out.print(minuto+" : ");
		if(segundo<0 || segundo>59)
			System.out.println("has introducido mal los segundos");
		else 
			System.out.print(segundo+"  ");
	}catch (Exception e ) {
		System.out.println("ERROR");
	}
		sc.close();
	}

}
