package ejemplos.condicionales;

public class Mayor3 {

	public static void main(String[] args) {
		// Declaramos e inicializamos las variables
		int a=(int)(Math.random()*50+1);
		int b=(int)(Math.random()*50+1);
		
		//comprobamos y mostramos el resultado por pantalla
		if (a>b)
			System.out.println(a+" es mayor que "+b);
		else if (a<b)
			System.out.println(a+" es menor que "+b);
		else 
			System.out.println(a+" es igual que "+b);
	}

}
