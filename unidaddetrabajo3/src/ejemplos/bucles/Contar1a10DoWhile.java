package ejemplos.bucles;

public class Contar1a10DoWhile {

	public static void main(String[] args) {
		// declaramos la variable contadora
		int conta;
		
		//mostramos la cuenta del 1 hasta el 10
		System.out.println("cuenta del 1 al 10: ");
		conta=1;
		do {
			System.out.println(conta);
			conta++;
		} while (conta<=10);
		
		//mostramos la cuenta del 10 hasta el 1
		System.out.println("\ncuenta del 1 al 10: ");
		conta=10;
				do {
					System.out.println(conta);
					conta--;
				}while (conta>=1);
	}

}
