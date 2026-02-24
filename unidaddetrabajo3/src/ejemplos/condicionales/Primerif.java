package ejemplos.condicionales;

public class Primerif {

	public static void main(String[] args) {
		//declaracion e inicializacion de la variable
		int a=5;
		//ejemplo de condicional simple
		if (a==5) {
			System.out.println("la variable es igual a 5");
			
		}
		//ejemplo de condicional compuesto
		if (a>6) {
			System.out.println("la variable es mayor que 6");
		}else {
			System.out.print("la variable es menor que 7 ");
			System.out.println("y periko de los palotes by juanjo");
			//ejemplo de condicional anidado
			if(a>6) {
				System.out.println("la variable es mayor que 6");
			} else if (a==6) {
				System.out.println("la variable es igual a 6");
			}else {
				System.out.println("la variable es menor que 6");
			}
		}
	}


}
