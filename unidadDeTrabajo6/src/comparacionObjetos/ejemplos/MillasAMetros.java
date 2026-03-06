package comparacionObjetos.ejemplos;

public class MillasAMetros {

	private int millas;

	/**
	 * @param millas
	 */
	public MillasAMetros(int millas) {
		this.millas = millas;
	}
	/**
	 * funcion que permite convertir las millas marinas en metros
	 * @param millas
	 * @return
	 */
	public static int millaMetro(int millas){
		return millas*1852;
	}
	/**
	 * funcion que permite convertir las millas marinas en kilometros
	 * @param millas
	 * @return
	 */
	public static double millaKm(int millas){
		return 1.852*millas;
	}
}
