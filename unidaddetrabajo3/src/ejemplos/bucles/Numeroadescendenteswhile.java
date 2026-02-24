package ejemplos.bucles;

public class Numeroadescendenteswhile {
	public static int aleatorio(int n) {
		return (int)(Math.random()*n+1);
	}
	public static void main(String[] args) {
		int a=aleatorio(50);
		int b=aleatorio(50);
		System.out.println("contamos desde "+a+" hasta "+b);
		if (a<b) {
		for(int conta=a;conta<=b;conta++) {
			System.out.print(conta+" ");
		}} else {
			for(int conta=a;conta>=b;conta--) {
				System.out.print(conta+" ");
		}
	}

	}}