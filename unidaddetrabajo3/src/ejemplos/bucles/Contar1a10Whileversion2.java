package ejemplos.bucles;

public class Contar1a10Whileversion2 {

	public static void main(String[] args) {
		// Declaramos e inicializamos una variable contadora
		int conta=1;
		//mostramos la cuenta desde el 1 hasta el 10
		System.out.print("\nContamos del 1 al 10: ");
		while(conta<=10) {
			System.out.print(" "+conta);
			conta++;
		}
		//mostramos la cuenta desde el 10 hasta el 1
		System.out.print("\n\nContamos del 10 al 1: ");
		conta=10;
		while(conta>=1) {
		System.out.print(" "+conta);
		conta--;
	
		}
		}

}
