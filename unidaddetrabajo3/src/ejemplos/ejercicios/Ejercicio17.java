package ejemplos.ejercicios;

public class Ejercicio17 {
final static int ALTURA=4; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int linea,blanco,asterisco;
		for(linea=1;linea<=ALTURA;linea++) {
			for(blanco=ALTURA;blanco>linea;blanco--) {
				System.out.print(" ");
			}
			for(asterisco=1;asterisco<=linea;asterisco++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}

}
