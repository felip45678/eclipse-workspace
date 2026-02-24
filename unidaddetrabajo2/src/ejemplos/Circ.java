package ejemplos;

public class Circ {
	
	final static double PI=3.1416; //variable global
	/**
	 * funcion que calcula la longitud o perimetro de una circunferencia 
	 * @param r - radio de la circunferencia (tipo entero)
	 * @return - longitud de la circunferencia de radio r
	 */
	public static double longitud(int r) {
	
	return 2*PI*r;
	
	}
	/**
	 * funcion que callcula el area d eun circulo
	 * @param r - radio del circulo(tipo entero)
	 * @return area del circulo de radio r
	 */
	public static double area(int r) {
	
		return PI*r*r;
	}
	//programa principal
	public static void main(String[] args) {
		// declaramos y definimos el radio
		int radio=3	;	//variable local
		System.out.println(radio+"la longitud es "+longitud(radio));
		System.out.println(radio+"la longitud es "+area(radio));

	}

}
