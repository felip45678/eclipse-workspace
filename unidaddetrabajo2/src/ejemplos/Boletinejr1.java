package ejemplos;

public class Boletinejr1 {
	
	/**
	 * funcion para calcular el volumen de una esfera
	 * @param r
	 * @return nos devuelve la operacion calculada
	 */
	public static double volumen(int r) {
		double PI=3.1416;
		return 4.0/3*PI*r*r*r;
	}
	//main
	public static void main(String[] args) {
		// declaracion de variable y mostramos por pantalla 
		int radio=3;
		System.out.println("Radio: "+radio);
		System.out.println("Volumen de la esfera: "+volumen(3));

	}

}
