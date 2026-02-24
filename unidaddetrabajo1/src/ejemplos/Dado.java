package ejemplos;

public class Dado {

	public static void main(String[] args) {
		// Declaracion e inicializacion de la variable
		int numero;
		
		//Obtenemos un numero aleatorio
		numero=(int)(Math.random()*6+1);
		
		//Mostramos el numero obtenido 
		System.out.println(numero);
	}

}
