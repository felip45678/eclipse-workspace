package ejemplos.biblioteca;

public class Mes {
	private int dia;
	private int mes;
	private int año;
	/**
	 * constructor
	 */
	public Mes() {
		dia=0;
		mes=0;
		año=0;
	}
	
	/**constructor
	 * @param dia
	 * @param mes
	 * @param año
	 */
	public Mes(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	/**devuelve el dia 
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}
	/**devuelve el mes 
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}
	/**devuelve el año
	 * @return the año
	 */
	public int getAño() {
		return año;
	}
	/**establece el dia
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	/**establece el mes
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/**establece el año
	 * @param año the año to set
	 */
	public void setAño(int año) {
		this.año = año;
	}
	
	@Override
	public String toString() {
		String res="";
		if(dia<10) {
			res+="0";
		}
		res+=dia+"/";
		if(mes<10) {
			res+="0";
		}
		res+=mes+"/";
		res+=año;
		if(año<0) {
			res+="a.c";
		}
		return res;
	}
	/**
	 * funcion que comprueba los dias y los mese si son correctos
	 * @return
	 */
	public boolean isValid() {
		if(dia<1 || dia>31)
			return false;
		if(mes<1 || mes>12)
			return false;
		if(mes==1 || mes==3 || mes==5 || mes==7 || mes ==8 || mes==10 || mes==12) {
			if(dia<1 || dia>31) {
				return false;
			}
		}
		if(mes==4 || mes==6 || mes==9 || mes==11) {
			if(dia<1 || dia>30) {
				return false;
			}
		}
		if(mes==2) {
			if(dia<1 || dia>28) {
				return false;
			}
		}
		return true;
	}
	
}
