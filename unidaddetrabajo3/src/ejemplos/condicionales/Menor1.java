package ejemplos.condicionales;

public class Menor1 {
	/**
	 * funcion que devuelve un numero aleatorio entre 1 y n
	 * @param n limite superior
	 * @return numero entero aleatorio
	 */
	public static int aleatorio(int n) {
		return (int)(Math.random()*n+1);
	}
	/**
	 * funcion que devuelve el mayor valor entre dos valores pasados como parametro
	 * @param x
	 * @param y
	 * @return el mayor va,lor entre x e y
	 */
	public static int menor(int x,int y) {
		if (x<y)
			return x;
		else 
			return y;
	}
	public static void main(String[] args) {
		// Declaramos e inicializamos las variables
		int a=aleatorio(10);
		int b=aleatorio(10);
		
		//comprobamos y mostramos el resultado por pantalla
		if (a>b)
			System.out.println(a+" es mayor que "+b);
		else if (a<b)
			System.out.println(a+" es menor que "+b);
		else 
			System.out.println(a+" es igual que "+b);
	}

}
