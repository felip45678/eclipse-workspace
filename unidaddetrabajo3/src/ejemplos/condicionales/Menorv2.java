package ejemplos.condicionales;

public class Menorv2 {

	public static void main(String[] args) {
		int primero,segundo;
		primero=Menor1.aleatorio(25);
		segundo=Menor1.aleatorio(25);
		
		int menor=Menor1.menor(primero, segundo);
		System.out.println("valores: "+primero+" "+segundo);
		System.out.println("Menor: "+menor);
	}

}
