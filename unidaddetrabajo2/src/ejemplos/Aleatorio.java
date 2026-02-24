package ejemplos;

public class Aleatorio {

	public static void main(String[] args) {
		// Generamos un numero aleatorio entre 1 10
		int numero;
		numero=(int)(Math.random()*10+1);
		System.out.println("Numero aleatorio entre 1 y 10: "+numero);
		//Generamos un numero aleatorio entre 1 y 50
		numero=(int)(Math.random()*50+1);
		System.out.println("Numero aleatorio entre 1 y 50: "+numero);
		//Generamos un numero aleatorio entre 1 y 100
		numero=(int)(Math.random()*100+1);
		System.out.println("Numero aleatorio entre 1 y 100: "+numero);
		//Generamos un numero aleatorio entre 1 y 1000
		numero=(int)(Math.random()*1000+1);
		System.out.println("Numero aleatorio entre 1 y 1000: "+numero);
		//simulamos el lanzamiento de un dado
		numero=(int)(Math.random()*6+1);
		System.out.println("Numero aleatorio entre 1 y 6: "+numero);
			
	}

}
