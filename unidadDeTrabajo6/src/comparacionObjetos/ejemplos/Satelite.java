package comparacionObjetos.ejemplos;

public class Satelite {

	// Atributos
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;

	Satelite(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}

	Satelite() {
		meridiano = paralelo = distancia_tierra = 0;
	}

	public void setPosicion(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}

	public void printPosicion() {
		System.out.print("El satelite se emncuentra en ");
		System.out.print("el paralelo " + paralelo + " meridiano " + meridiano);
		System.out.println(" a una distancia de de la tierra de " + distancia_tierra + " kms");
	}

	/**
	 * Varía la distancia a La Tierra del satélite según un desplazamiento. Un valor
	 * positivo de desplazamiento aleja el satélite de La Tierra, un valor negativo
	 * lo acerca.
	 * 
	 * @param desplazamiento
	 */
	public void variaAltura(double desplazamiento) {
		distancia_tierra += desplazamiento;
	}

	/**
	 * funcion que nos dice si el satelite esta en la tierra o no
	 * 
	 * @return
	 */
	public boolean enOrbita() {
		if (distancia_tierra == 0)
			return false;
		return true;
	}

	/**
	 * Modifica la posición del satélite
	 * 
	 * @param variap variación del paralelo
	 * @param variam variación del meridiano
	 */
	void variaPosicion(double variap, double variam) {
		paralelo += variap;
		meridiano += variam;
	}
}
