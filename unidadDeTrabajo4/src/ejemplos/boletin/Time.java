package ejemplos.boletin;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	/**
	 * constructor
	 */
	Time() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	/**
	 * costructor
	 * 
	 * @param hours
	 * @param minutes
	 * @param seconds
	 */
	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	/**
	 * nos devuelve la hora que es
	 * 
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * nos devuelve los minutos
	 * 
	 * @return the minutes
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * nos devuelve los segundos que son
	 * 
	 * @return the seconds
	 */
	public int getSeconds() {
		return seconds;
	}

	/**
	 * establecemos la hora
	 * 
	 * @param hours the hours to set
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * establecemos los minutos
	 * 
	 * @param minutes the minutes to set
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	/**
	 * establecemos los segundos
	 * 
	 * @param seconds the seconds to set
	 */
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	/* metodos */
	/**
	 * funcion que nos pondra un cero en la horas,minutos y segundos menores que 10
	 */
	@Override
	public String toString() {
		String res = "";

		if (hours < 10 ||minutes<10 || seconds<10) 
			res = "0";

		
		return res;
	}
/**
 * funcion que nos dice si es valido o no el formato
 * @return
 */
	public boolean isValid() {
		if (hours < 1 || hours > 23 ||minutes < 1 || minutes > 59||seconds < 1 || seconds > 59) {
			return false;
		} else {
			return true;

		}
		
	}
	/**
	 * funcion que cuenta el total de segundos 
	 * @return nos devolvera el total de segundos
	 */
	public int contar() {
		int suma,suma1;
		suma=hours*3600;
		suma1=minutes*60;
		return suma+suma1+seconds;
	}
}
