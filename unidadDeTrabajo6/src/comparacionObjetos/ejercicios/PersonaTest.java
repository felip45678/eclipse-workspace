package comparacionObjetos.ejercicios;

import java.util.Scanner;

public class PersonaTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Dime tu nombre: ");
		String nombre=sc.nextLine();
		System.out.print("Dime tu edad: ");
		int edad=sc.nextInt();
		System.out.print("Dime tu sexo: ");
		char c=sc.next().charAt(0);
		System.out.print("Dime tu peso: ");
		int pes=sc.nextInt();
		System.out.print("Dime tu altura: ");
		int altu=sc.nextInt();
		sc.close();
		Persona a=new Persona(nombre,c,edad,pes,altu);
		if(a.mayorEdad())
			System.out.println("Es mayor de edad¡¡¡¡");
		if(a.calcularIMC()==0)
			System.out.println("Esta debajo de su peso ideal");

		if(a.calcularIMC()==1)
			System.out.println("Tienes sobrepeso( Estas muy gordo chaval)");
		
		if(a.calcularIMC()==-1)
			System.out.println("Esta en su peso ideal");
		System.out.println(a);
	}

}
