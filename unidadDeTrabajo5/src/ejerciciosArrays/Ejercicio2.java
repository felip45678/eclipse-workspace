package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio2 {

	final static int TOTAL=10;
	public static void main(String[] args) {
		// Leer 10 números enteros y a continuación mostrar la media de los números introducidos, el mayor valor y el
		//menor valor.
		int array[]=new int[TOTAL];
		Scanner sc=new Scanner(System.in);
		try {
			for(int i=0;i<TOTAL;i++) {
				System.out.print("numero "+i+":");
				array[i]=sc.nextInt();
			}
		}catch(Exception e) {
			System.err.println("los valores introducidos no son correcvtos");
		}finally {
			sc.close();
		}
		double media=array[0];
		for(int i=0;i<TOTAL;i++) {
		media+=array[i];
		}
		for(int i=0;i<TOTAL;i++) {
			System.out.print(array[i]+" ");
			}
		int mayor=array[0];
		int menor=array[0];
		for(int i=1;i<TOTAL;i++) {
			if(i<menor) {
				menor=i;
			}if(i>mayor){
				mayor=i;
			}
			}
		System.out.println("la media de los numeros es: "+media/10 );
		System.out.println("mayor: "+mayor+" menor: "+menor);
	}

}
