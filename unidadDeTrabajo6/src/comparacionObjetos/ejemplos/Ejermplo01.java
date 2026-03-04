package comparacionObjetos.ejemplos;

public class Ejermplo01 {

	static int incrementa(int valor) {
		valor++;
		return valor;
	}
	public static void main(String[] args) {
		int a=5,b;
		b=incrementa(a);
		if(a==b)
			System.out.println(a+" y "+b+" son iguales");
		else
			System.out.println(a+" y "+b+" son distintos");
	}

}
