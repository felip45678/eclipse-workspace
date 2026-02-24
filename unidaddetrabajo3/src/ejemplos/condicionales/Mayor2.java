package ejemplos.condicionales;

public class Mayor2 {
	/**
	 * funcion que devuelve un numero aleatorio entre 1 y n
	 * @param n limite superior
	 * @return numero entero aleatorio
	 */
	public static int num(int n) {
		return (int)(Math.random()*n+1);
	}
	public static void main(String[] args) {
		// Declaramos e inicializamos las variables
		int a=num(10);
		int b=num(10);
		
		//comprobamos y mostramos el resultado por pantalla
		if (a>b)
			System.out.println(a+" es mayor que "+b);
		else if (a<b)
			System.out.println(a+" es menor que "+b);
		else 
			System.out.println(a+" es igual que "+b);
	}

}
