package ejemplos.scanner;

import java.util.Scanner;

public class LeerNum_v2 {

	public static void main(String[] args) {
		//creamos el lector
		Scanner sc =new Scanner(System.in);
		
		//declaramos la variable
		int num;
		try {
			//pedimos un valor de tipo entero al usuaario y los guardamos
			System.out.print("dime un valor de tipo entero: ");
			num=sc.nextInt();
		}catch (Exception e ) {
			num=0;
		}
		
		if(num==0)
			System.out.println("puede que no hayas introducido un valor entero");
		
		//cerramos el lector
		sc.close();
	}

}
