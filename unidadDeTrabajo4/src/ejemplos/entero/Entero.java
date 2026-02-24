package ejemplos.entero;

public class Entero {
	//atributo
	private int numero;
	
	//metodos
	/**
	 * constructor
	 */
	Entero(){
		numero=0;
	}
	/**
	 * constructor
	 * @param valor (numeor entero)
	 */
	Entero(int valor){
		numero=valor;
	}
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * funcion que indica si el numero es positivo
	 * @return nos devuelve true si es positivo
	 */
	public boolean positivo() {
		return numero>0;
	}
	/**
	 * funcion que indica si el numero es cero
	 * @returnnos devuelve true si es cero
	 */
	public boolean cero(){
		return numero==0;
	}
	/**
	 * funcion que indica si el numero es mayor que el numero pasado como parametro
	 * @param valor
	 * @return
	 */
	public boolean mayor(int valor) {
		return numero>valor;
	}
	/**
	 * funcion que multiplica el numero por dos
	 * @return nos devolvera el doble del numero
	 */
	public int doble() {
		return numero*2;
	}
	/**
	 * funcion que multiplica el numero por dtre 
	 * @return nos devolvera el triple del numero
	 */
	public int triple() {
		return numero*3;
	}
	/**funcion que divide el numero
	 * @return nos devolvera el numero dividido entre dos
	 */
	public double mitad() {
		return numero/2.0;
	}
	/**
	 * funcion que calcula la potencia de numero 
	 * @param expnente el numero de veces que vamos a multiplicar el numero
	 * @return nos devyuleve el numero
	 */
	public int potencia(int expnente) {
		return (int) Math.pow(numero, expnente);
	}
	/**
	 * funcion que nos indica si un numero es par o no
	 * @return nos devuelve true si es par
	 */
	public boolean par() {
		return numero%2==0;
	}
	/**
	 * funcion que decide si un numero es primo o no 
	 * @return nos devuelve true si es primo
	 */
	public boolean esPrimo() {
		if (numero<=1)
			return false;
		else
		for(int i=2;i<=numero/2;i++) {
			if (numero%2==0)
				return false;
		}
		return true;
	}
	/**
	 * convierte un entero en un double
	 * @return nos devuelve el numero convertido en double 
	 */
	public double todouble() {
		return (double)numero;
	}
}
