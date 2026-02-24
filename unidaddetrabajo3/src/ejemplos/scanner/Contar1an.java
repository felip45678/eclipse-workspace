package ejemplos.scanner;

import java.util.Scanner;

public class Contar1an {

	public static void main(String[] args) {
		try {
			// creamos el lector
			Scanner entrada=new Scanner(System.in);
		
			//pedimos el numero y leemos la entyrada por teclado como un numero entero
			System.out.print("dime un valor: ");
			int num= entrada.nextInt();
			//mostramos la cuenta desde el hatsa num
			System.out.println("vamos a contar hasta: "+num);
			for (int conta=1;conta<=num;conta++)
				System.out.print(conta+" ");
		entrada.close();
		}catch (Exception e) {
			System.err.println("ERROR!! has introducido un tipo de datos incorrecto");
		}

}
}
