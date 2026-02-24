package ejemplos.bucles;

public class Aleatorio50while {

	public static void main(String[] args) {
		int num=(int)(Math.random()*25+1);
		//contamos desde 1 a num con un bucle while
		System.out.println("contamos del 1 al "+num+" con while: ");
		int conta=1;
		while(conta<=num) {
			System.out.print(conta+" ");
			conta++;
		}System.out.println();
		//contamos desde 1 a num con un bucle do while
		System.out.println("contamos del 1 al "+num+" con do while: ");
		conta=1;
		do {
			System.out.print(conta+" ");
			conta++;
		}while (conta<=num);
		//contamos desde 1 a num con un bucle for
	System.out.println();
		System.out.println("contamos del 1 al "+num+" con for: ");
		for( conta=10;conta<=num;conta++) {
			System.out.print(conta+" ");
		}
	}

}
