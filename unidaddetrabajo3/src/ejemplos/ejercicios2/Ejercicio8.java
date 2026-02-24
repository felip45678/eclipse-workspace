package ejemplos.ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			int sup=100, inf=1;
			int opcion;
			int num;
			boolean encontrado;
			encontrado=false;
			int contar=1;
			System.out.println("piensa un valor entre "+inf+ " y "+sup);
			while(encontrado==false) {
				num=(sup+inf)/2;
				System.out.println(" es el "+num+"?");
				System.out.print("pulsa: ");
				System.out.println("1) si "+num+" es el valor pensado");
				System.out.println("2) si "+num+"es menor que el pensado");
				System.out.println("3) si "+num+"es mayor que el pensado");
				//leemos la opcion tecleada
				System.out.print("opcion elegida: ");
				opcion=sc.nextInt();
				switch(opcion) {
				case 1:System.out.println("has acertado!!!");
				encontrado=true;break;
				case 2:inf=num;break;
				case 3: sup=num;break;
				default:System.out.println("no has tecleado una opcion correcta");
				
				}contar++;
			}System.out.print("numero de intentos: "+contar);
		}catch(InputMismatchException ime) {
			System.out.println("error");
		}finally {
		sc.close();
		}
	}

}
