package ejemplos;

public class Circulos {

	public static void main(String[] args) {
		// Definimos e inicilizamos los datos que nececitamos 
		int radio=3;
		final double PI=3.141592;
		
		//Calculamos la longitud de una circunferencia 
		double longitud;
		longitud=2*PI*radio;
		
		//Calculamos el area de un circulo
		double area;
		area=PI*radio*radio;
		
		//Mostramos los resultados 
		System.out.println("la longitud de una circunferencia de radio "+radio+" es : "+longitud);
		System.out.println("El area de un circulo de radio "+radio+" es :"+area);
		

	}

}
