package ejemplos.aserciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aserciones {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("introduce un valor positivo: ");
			int num=sc.nextInt();
			//si el numero introducido es positivo,mostramos la lista de numeros impares
			if(num>0) {
				for(int i=3;i<=num;i+=2)
					System.out.print(i+" ");
			}
		}catch(InputMismatchException ime) {
			System.out.println("ERROR");
		}finally {
			sc.close();
		}
	}

}
