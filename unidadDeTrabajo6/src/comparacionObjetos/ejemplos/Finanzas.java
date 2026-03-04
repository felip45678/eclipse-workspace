package comparacionObjetos.ejemplos;

public class Finanzas {

	//atributos 
	double dinero;
	/**
	 * @param constructor por defecto
	 */
	public Finanzas() {
		dinero = 1.36;
	}
	/**
	 * constructor
	 * @param c
	 */
	public Finanzas(double c) {
		dinero=c;
	}
	/**
	 * convierte de dolares a euros
	 * @param dol
	 * @return
	 */
	public double dolaresToEuros(double dol) {
		return dol/dinero;
	}
	/**
	 * convierte de euros a dolares 
	 * @param eur
	 * @return
	 */
	public double eurosToDolares(double eur) {
		return eur*dinero;
	}

}
