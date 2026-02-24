package ejemplos;

public class Boletinejrcici2 {
	/**
	 * funcion que calcula los segundos totales de la hora indicada
	 * @param hora
	 * @param minutos
	 * @param segundos
	 * @return nos devolvera la operacion total de segundos 
	 */
	public static int horas(int hora,int minutos,int segundos) {
		return hora*3600+60*minutos+segundos;
	}
	public static void main(String[] args) {
		// declaracion de variables y operaciones
		int h,s,m;
		h=10;
		m=15;
		s=50;
		System.out.println("Hora: "+h+":"+m+":"+s);
		System.out.println("Total segundos: "+horas(h,m,s));
	}

}
