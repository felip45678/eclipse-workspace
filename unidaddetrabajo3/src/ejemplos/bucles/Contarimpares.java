package ejemplos.bucles;

public class Contarimpares {

	public static void main(String[] args) {
		//primera forma
		int conta;
		
		conta=1;
		while (conta<=50) {
			if (conta%2!=0)
				System.out.print(conta+" ");
			conta++;
		}
		System.out.println();
		//segunda forma
		conta=1;
		while(conta<=50) {
			System.out.print(conta+" ");
			conta+=2;
		}
		System.out.println();
		//tercera forma
		conta=1;
		do {
			System.out.print(conta+" ");
			conta+=2;
		}while (conta<=50);
		
		System.out.println();
		//cuarta forma
		for(conta=1;conta<=50;conta+=2)
			System.out.print(conta+" ");

	}

}
