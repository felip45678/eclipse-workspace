package arrays;

import java.util.Scanner;

public class Numbers2array {

	final static int TAM=5;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			// declaracion y creacion del array
			int numeros[]=new int[TAM];
			//leemos los numeros que va a introducir el usuario
			for(int i=0;i<TAM;i++) {
				System.out.print("dime un numero:");
				numeros[i]=sc.nextInt();
				
			}
			
			//mostramos los numero es orden
			System.out.print("numeros: ");
			for(int i=0;i<TAM;i++) {
				System.out.print(numeros[i]+" ");
			}
			
			//mostramos los numero en desorden
			System.out.print("\nnumeros: ");
			for(int i=TAM-1;i>=0;i--) {
				System.out.print(numeros[i]+" ");
			}
			
			System.out.println("\nprimer numero: "+numeros[0]);
			System.out.println("ultimo numero: "+numeros[TAM-1]);
		}catch(Exception e) {
			System.out.println("error");
		}finally {
			sc.close();
		}

	}

}
