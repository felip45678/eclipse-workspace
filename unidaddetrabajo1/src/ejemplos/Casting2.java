package ejemplos;

public class Casting2 {

	public static void main(String[] args) {
		// declaracio0n de variables 
		int num;
		char letra;
		
		//asignacion de valores 
		letra='A';
		num=letra;
		System.out.println(letra);		//A
		//Casting implicito
		System.out.println(num);		//65
		//Casting explicito
		System.out.println((char)(num+1)); // (char)66 -->B
		System.out.println((char)97);		// a
		
		
	}

}
