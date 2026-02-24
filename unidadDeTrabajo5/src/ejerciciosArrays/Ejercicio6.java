package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio6 {

	final static int NUM=5;
	public static void main(String[] args) {
		//Leer por teclado una serie de 5 números enteros. El programa debe indicarnos si los números están ordenados de
		//forma creciente, decreciente o si están desordenados.
		int array[]= new int[NUM];
		Scanner sc=new Scanner(System.in);
		try {
			for(int i=0;i<NUM;i++) {
				System.out.print(i+": ");
				array[i]=sc.nextInt();
				
			}
		}catch(Exception e) {
			System.out.println("error");
		}finally {
			sc.close();
		}
		boolean creciente=false;
		boolean decreciente=false;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]<array[i+1])
				creciente=true;
			if(array[i]>array[i+1])
				decreciente=true;
		}
		if(creciente==true && decreciente==false)
			System.out.println("creciente");
		if(creciente==false && decreciente==true)
			System.out.println("decreciente");
		if(creciente==true && decreciente==true)
			System.out.println("desordenados");
		if(creciente==false && decreciente==false)
			System.out.println("son iguales");
	}

}
