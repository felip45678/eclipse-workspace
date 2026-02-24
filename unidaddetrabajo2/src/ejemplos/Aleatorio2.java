package ejemplos;

public class Aleatorio2 {
	/**
	 * Devuelve un numero aleatorio entre 1 y num
	 * @param num - limite superior
	 * @return un numero entero entre 1 y num
	 */
	public static int aleatorio(int num) {
	int numero=(int)(Math.random()*num+1);
	return numero;
	}
	
	//programa principal
	public static void main(String[] args) {
		// generamos un numero aleatorio entre 1 y 10
		System.out.println("numero aleatorio entre 1 y 10: "+aleatorio(10));
		// generamos un numero aleatorio entre 1 y 10
		System.out.println("numero aleatorio entre 1 y 50: "+aleatorio(50));
		// generamos un numero aleatorio entre 1 y 10
		System.out.println("numero aleatorio entre 1 y 100: "+aleatorio(100));
		// generamos un numero aleatorio entre 1 y 10
		System.out.println("numero aleatorio entre 1 y 1000: "+aleatorio(1000));
		// generamos un numero aleatorio entre 1 y 10
		System.out.println("numero aleatorio entre 1 y 6: "+aleatorio(6));
	}

}
