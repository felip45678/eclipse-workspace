package ejemplos;

public class TiempoV {

	public static void main(String[] args) {
		// Declaramos y damos un valor al total de segundos 
		int total=7265;

		//Declaramos las variables
		int horas=total/3600;
		int resto=total%3600;
		int min=resto/60;
		int seg=resto%60;
		
		
		//imprimimos los resultados 
		System.out.println("Horas: "+horas);
		System.out.println("minutos: "+min);
		System.out.println("segundos: "+seg);
	}

}
