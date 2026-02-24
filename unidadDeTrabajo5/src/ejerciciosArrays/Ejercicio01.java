package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio01 {

	final static int TOTAL=10;
	public static void main(String[] args) {
		// creamos el array 
		int array[]=new int[TOTAL];
		Scanner sc=new Scanner(System.in);
		try {
			for(int i=0;i<TOTAL;i++) {
				System.out.print("numero "+i+":");
				array[i]=sc.nextInt();
			}
		}catch(Exception e){
			System.err.println(">>>ERROR en la introduccion de datos");
		}finally {
			sc.close();
		}
		for(int i=0;i<TOTAL;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		for(int i=TOTAL-1;i>=0;i--) {
			System.out.print(array[i]+" ");
		}

	}

}
