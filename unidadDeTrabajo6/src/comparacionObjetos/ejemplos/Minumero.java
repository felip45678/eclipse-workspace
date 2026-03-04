package comparacionObjetos.ejemplos;

public class Minumero {

	//Atributo
	int dato;
	
	
	/**
	 * @param dato
	 */
	public Minumero(int dato) {
		this.dato = dato;
	}

	/**
	 * funcion que devuelve el doble de un numero pasado como parametro 
	 * @param num
	 * @return
	 */
	public int doble() {
		return dato+dato;
	}

	/**
	 * funcion que devuelve el triple de un numero pasado como parametro 
	 * @param num
	 * @return
	 */
	public  int triple() {
		return doble()+dato;
	}
	/**
	 * funcion que devuelve el cuadruple de un numero pasado como parametro 
	 * @param num
	 * @return
	 */
	public  int cuadruple() {
		return doble()+doble();
	}
}
