package string;

import java.util.Scanner;

public class NombreyApellidos {

	public static void main(String[] args) {
		// pedimos al usario que introduzca por teclado el nombre ylos apellidos 
		Scanner sc=new Scanner(System.in);
		System.out.print("Dime tu nobre y apellidos");
		String nombre=sc.nextLine();
		sc.close();
		//2.Mostramos por pantalla el nombre  y apellidos separados
		int pos=nombre.indexOf(' ');
		if(pos==-1) {
			System.out.println("NOmbre: "+nombre);
		}else {
			System.out.println("Nombre: "+nombre.substring(0,pos));
			System.out.println("Apellidos: "+nombre.substring(pos+1));

		}
				
	}

}
