package comparacionObjetos.ejemplos;

public class Temperatura {

	/**
	 * funcion que convierte los grados celsios a  farenheit
	 * @param temp
	 * @return
	 */
	public double celsiusToFarenheit(double temp) {
		return (1.8)*temp+32;
	}
	/**
	 * funcion que convierte los grados farenheit a celsios 
	 * @param temp
	 * @return
	 */
	public double farenheitToCelsius(double temp) {
		return (temp-32)/1.8;
	}
}
