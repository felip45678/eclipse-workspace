package repaso;

import java.util.Scanner;

public class MiNombre {

	/**
	 * funcion que invierte el orden del nombre introducido por teclado
	 * @param nombre
	 */
	public static void invertido(String nombre) {
		for(int i=nombre.length()-1;i>=0;i--) {
			System.out.print(nombre.charAt(i));
		}
	}
	/**
	 * devuelve las vocales de la cadena pasada como parametro 
	 * @param cadena
	 * @return
	 */
	public static String vocales(String cadena) {
		String resultado="";
		char c;
		for(int i=0;i<cadena.length();i++) {
			c=cadena.charAt(i);
			if(c=='a' || c=='e' || c=='i'||c=='o'||c=='u')
				resultado+=c;
			if(c=='A' || c=='E' || c=='I'||c=='O'||c=='U')
				resultado+=c;
			if(c=='Á' || c=='É' || c=='Í'||c=='Ó'||c=='U')
				resultado+=c;
		}
		return resultado;
	}
	/**
	 * devuelve el numero de vocales que contiene la cadena pasada como parametro 
	 * @param cadena sobre la que vamos a contar el numero de vocales que contiene
	 * @return numero de vocales de la cadena (integer)
	 */
	private static int contar(String cadena) {
		int conta=0;
		char c;
		for(int i=0;i<cadena.length();i++) {
			c=cadena.toUpperCase().charAt(i);
			if(c=='A' || c=='E' || c=='I'||c=='O'||c=='U')
				conta++;
			if(c=='Á' || c=='É' || c=='Í'||c=='Ó'||c=='U')
				conta++;
		}
		return conta;
	}
	/**
	 * devuelve una cadena de caracteres que contiene una cadena de consonates
	 * @param cadena 
	 * @return cadena string con las consonante de la cadena principal
	 */
	private static String consonantes(String cadena) {
		String resultado="";
		char c;
		for(int i=0;i<cadena.length();i++) {
			c=cadena.charAt(i);
			if(c>='b' && c<='z') {
				if(c!='e' && c!='i' && c!='o' && c!='u')
					resultado+=c;
			}
			if(c>='B' && c<='Z') {
				if(c!='E' && c!='I' && c!='O' && c!='U')
					resultado+=c;
			}
		}
		return resultado;
	}
	/**
	 * devuelve el numeoro de consonantes que hay en una cadena
	 * @param cadena (String)
	 * @return numero de consonantes de la cadena pasada como parametro
	 */
	private static int contarcons(String cadena) {
		int conta=0;
		char c;
		for(int i=0;i<cadena.length();i++) {
			c=cadena.toUpperCase().charAt(i);
			if(c>='B' && c<='Z') {
				if(c!='E' && c!='I' && c!='O' && c!='U')
					conta++;
			}
		}
		return conta;
	}
	/**
	 * funcion que eliminna el caracter 
	 * @param cadena
	 * @param c
	 * @return devueleve la cadena sin el carcater 
	 */
	private static String eliminar(String cadena ,char c) {
		String resultado="";
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i)!=c)
				resultado+=cadena.charAt(i);
		}
		return resultado;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre=sc.nextLine();
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Mayusculas: "+nombre.toUpperCase());
		System.out.println("Minusculas: "+nombre.toLowerCase());
		System.out.print("Invertido: ");
		invertido(nombre);
		System.out.println("\nVocales: "+vocales(nombre));
		System.out.println("Nª vocales: "+contar(nombre));
		System.out.println("consonantes: "+consonantes(nombre));
		System.out.println("Nª consonantes: "+contarcons(nombre));
		
		//Leemos un caracter desde el teclado 
		System.out.print("dime un caracter a eliminar: ");
		char c=sc.nextLine().charAt(0);
		
		//eliminamos el carcater que nosostros queramos 
		System.out.println("Nombre sin "+c+" :"+eliminar(nombre,c));
		
		sc.close();
	}

}
