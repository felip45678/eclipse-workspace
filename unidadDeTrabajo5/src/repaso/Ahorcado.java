package repaso;

import java.util.Scanner;

public class Ahorcado {

	/**
	 * seleccion de forma aleatoria una palabra del aray 
	 * @return
	 */
	private static String generapalabra() {
		String array[]= {"PIZARRA","DROMERARIO","EMPANADILLA","AUSTRALOPITHECUS","ANTICAPITALISMO","CORONAVIRUS","GERIFALTE","EPITAFIO","LINFOCITO","ACELERADORA","FONTANERO","MATASUEGRAS"};
		return array[(int)(Math.random()*array.length)];
	}
	public static void main(String[] args) {
		//constantes 
		final int totalintentos=10;
		String palabra=generapalabra();
		Scanner sc=new Scanner(System.in);
		String asterisco="";
		int intentos=0;
		String resuelve;
		char letra;
		boolean acierto=false;
		//generamos una palabar a mostrar con tantos * comom letras tenga la plabra 
		System.out.println("numero de letras de la palabra a acertar: "+palabra.length());
		for(int i=0;i<palabra.length();i++) {
			asterisco+="*";
		}
		do {
		System.out.println("palabra a acertar: "+asterisco);
		System.out.println("numero de intentos realizados: "+intentos);
		System.out.println("numero de intentos restantes: "+totalintentos);
		//pedimos al usuario que introduzca un caracter
		System.out.print("Introduce una letra: ");
		resuelve=sc.nextLine().toUpperCase();
		if(resuelve.startsWith("RESUELVO:")) {
			//Si el usuario opta por reslover el la palabra
			//comprobamos si coincide la palabra a acerta con la palabra introducida
			if(palabra.equals(resuelve.substring(9)))
				acierto=true;
			else
				System.out.println("OHHHH la palabra introducida no es correcta");
		}else {
			//si el usuario no opta por resolver 
			//comprobamos si el caracter introducido se encuenntra la en la palabra
			letra=resuelve.charAt(0);
			System.out.println("letra introducida "+letra);
			if(palabra.indexOf(letra)==-1) {
				System.out.println("OHHHH la letra "+letra+" no se encuentra en la palabra ");
			}else {
				//hemos acertado una de las letras 
				System.out.println("¡¡HAs acertado una de las letras ");
				//sustituimos la letra que hemos encontrado dento de  la palabra que contiene los asteriscos 
				for(int j=0;j<palabra.length();j++) {
					if(palabra.charAt(j)==letra)
						asterisco=asterisco.substring(0,j)+letra+asterisco.substring(j+1);
				}
				//si la palabra  a acertar es igual a la palabra a mostrar,la hemos acertado
				if(palabra.equals(asterisco))
					acierto=true;
			}
		}
		intentos++;
		}while(intentos<totalintentos && !acierto);
		sc.close();
		if(acierto) {
			System.out.println("\nCorrecto has acertado");
			System.out.println("lo has hecho en "+intentos+" intentos");
		}else {
			System.out.println("has agotado los intentos");
		}
		
		
		
	}

}
