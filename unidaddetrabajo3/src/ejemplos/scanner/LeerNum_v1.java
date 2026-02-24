package ejemplos.scanner;

import java.util.Scanner;

public class LeerNum_v1 {

	public static void main(String[] args) {
		//creamos el lector
		Scanner entrada=new Scanner(System.in);
		
		try {
			//leemos desde el teclado un numero con decimales
			System.out.print("dime un valor con decimales: ");
			float num =entrada.nextFloat();
			
			//mostramoss 
			System.out.println("has introducido el valor: "+num);
		
		}catch (Exception e) {
			System.err.println(">>> se ha producido un error");
		}
		
		
		
		
		entrada.close();
	

}}
