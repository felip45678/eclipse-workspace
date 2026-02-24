package wrappers;

import java.util.Scanner;

public class DoubleTest {

	public static void main(String[] args) {
		// envolver un double a Double (autoboxing)
		double num=25.76;
		Double numwrapper=num;		//autoboxing automático
		System.out.println("valor (Double): "+numwrapper);
		
		//convertir un Double a double(unboxing)
		
		double numDesenvuelto=numwrapper;
		System.out.println("valor (double): "+numDesenvuelto);
		
		//conversion de String a Double con parseDouble
		
		String textoNum="123.45";
		Double numconvertido=Double.parseDouble(textoNum);
		System.out.println("conversion de String a Double: "+numconvertido);
		
		//crear un Double a partir de un String con valueof
		Double numvalueof=Double.valueOf("20.25");
		System.out.println("creado con valueof desde un string: "+numvalueof);
		
		//conversion de double  a string
		String textonum2=numwrapper.toString();
		System.out.println("conversion de double a string: "+textonum2);
		
		//entrada de usuario con scanner y cnversion a double
		Scanner sc=new Scanner(System.in);
		System.out.println("introduce un numero decimal: ");
		String entrada=sc.nextLine();
		try {
			Double numerousuario=Double.parseDouble(entrada);
			System.out.println("has introducido el numero: "+numerousuario);
		}catch(NumberFormatException nfe) {
			System.out.println("no se pudo convertir "+entrada+" a un numero decimal");
		}finally {
			sc.close();
		}

	
	}

}
