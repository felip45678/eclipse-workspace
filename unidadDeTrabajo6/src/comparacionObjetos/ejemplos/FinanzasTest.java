package comparacionObjetos.ejemplos;

public class FinanzasTest {

	public static void main(String[] args) {
		Finanzas c =new Finanzas();
		System.out.println("300 Euros son "+c.eurosToDolares(300)+" Dolares");
		System.out.println("300 Dolares son "+c.dolaresToEuros(300)+" Euros");
	}

}
