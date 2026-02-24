package ejemplos.ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la
		//cantidad de ceros.
		Scanner sc=new Scanner (System.in);
		try {
			float sumapo=0;
			int contap=0;
			int contan=0;
			int contao=0;
			int num=0;
			float sumares=0;
	
			for(int i=1;i<=10;i++) {
				System.out.print("dime un numero: ");
				num=sc.nextInt();
			
				if(num>0) {
					contap++;
					sumapo+=num;
				}if(num<0) {
					contan++;
					sumares+=num;
				}if(num==0) {
					contao++;
					
				}
			}
			System.out.println("la media de los positivos es: "+sumapo/contap);
			System.out.println("la media de los negativos es: "+sumares/contan);
			System.out.println("la media de los ceros es: "+contao);
		}catch(InputMismatchException ime){
			System.out.println("ERROR");
		}finally {
			sc.close();
		}
	}

}
		
		
		
		
