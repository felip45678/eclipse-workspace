package ejemplos.bucles;

public class Aleatorio50while2 {

	public static void main(String[] args) {
		int num=(int)(Math.random()*25+1);
		//contamos desde 1 a num con un bucle while
		System.out.println("contamos del  "+num+" al 1 con while: ");
		int conta=num;
		while(conta>=1) {
			System.out.print(conta+" ");
			conta--;
		}System.out.println();
		//contamos desde 1 a num con un bucle do while
		System.out.println("contamos del  "+num+" al 1 con do while: ");
		conta=num;
		do {
			System.out.print(conta+" ");
			conta--;
		}while (conta>=1);
		//contamos desde 1 a num con un bucle for
	System.out.println();
		System.out.println("contamos del  "+num+" al 1 con for: ");
		for( conta=num;conta>=1;conta--) {
			System.out.print(conta+" ");
		}
	}

}
