package ejemplos;

public class Casting {

	public static void main(String[] args) {
		// Declaracion e inicializacion de variables 
		int x=5;
		float y;
		
		//casting implicito
		y=x;
		System.out.println(y);
		
		//casting explicito
		int z=(int)y;
		System.out.println(z);

	}

}
