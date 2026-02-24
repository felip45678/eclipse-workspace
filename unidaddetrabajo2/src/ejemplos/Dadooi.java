package ejemplos;

public class Dadooi {
	/**
	 * Funcion que devuelve el resultado aleatorio de lanzar un dado
	 * @return un numero entero entre 1 y 6
	 */
	public static int dado() {
		return (int)(Math.random()*6+1);
	}
	//Programa principal
	public static void main(String[] args) {
		System.out.println("primera tirada: "+dado());
		System.out.println("segunda tirada: "+dado());
		System.out.println("tercera tirada: "+dado());
		System.out.println("cuarta tirada: "+dado());
		System.out.println("quinta tirada: "+dado());
	}

}
