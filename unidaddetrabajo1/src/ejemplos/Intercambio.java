package ejemplos;

public class Intercambio {

	public static void main(String[] args) {
		// Declaramos e inicializamos las variables
		int a=5;
		int b=10;
		
		//Realizamos el intercambio de valores
		int aux=a;
		a=b;
		b=aux;
		
		//mostramos las variables por pantalla
		System.out.println("a: "+a);
		System.out.println("b: "+b);

	}

}
