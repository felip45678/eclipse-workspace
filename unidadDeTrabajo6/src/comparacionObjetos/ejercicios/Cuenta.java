package comparacionObjetos.ejercicios;

public class Cuenta {

	// Atributos
	String titular;
	double cantidad = 0;

	/**
	 * @param titular
	 * @param cantidad
	 */
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	/**
	 * @param titular
	 */
	public Cuenta(String titular) {
		this.titular = titular;
	}

	/**
	 * devueleve el valor de el titular
	 * 
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * devuelve el valor de la cantidad
	 * 
	 * @return the cantidad
	 */
	public double getCantidad() {
		return cantidad;
	}

	/**
	 * establece el valor de titular
	 * 
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * establece el valor de cantidad
	 * 
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * metodo que permite ingresar una cantidad a la cuenta
	 * @param cantidad
	 * @return
	 */
	public  void ingresar(int cantidad) {
		if(cantidad>0) {
			 this.cantidad+=cantidad;
		}
	}
	/**
	 * funcion que permite calcular cunto dinero queda en una cuenta al hacer un retiro
	 * @param cantidad
	 * @param resto
	 */
	public void retirar(int cantidad) {
		this.cantidad-=cantidad;
		if((this.cantidad-cantidad)>0) 
			this.cantidad=0;
	}

	@Override
	public String toString() {
		return "Titular\t"+titular+"\tcantidad "+cantidad;
	}
	
}
