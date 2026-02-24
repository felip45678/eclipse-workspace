package wrappers;

public class MathTest {

	public static void main(String[] args) {
		int a=5,b=8;
		//menor y mayor
		System.out.println("mayor("+a+","+b+"): "+Math.max(a, b));
		System.out.println("menor("+a+","+b+"): "+Math.min(a, b));
		//potencias
		System.out.println("\ncuadrao de "+a+": "+Math.pow(a, 2));
		System.out.println("cubo de "+a+": "+Math.pow(a, 3));
		//numeros aleatorios
		System.out.println("\nnumero aleatorio entre 1 y 100: ");
		System.out.println((int)(Math.random()*100+1));
		System.out.println("numero aleatorio entre 0 y "+a+": ");
		System.out.println(Math.round(Math.random()*a));
		//area de un circulo
		int radio=3;
		double area=Math.PI*Math.pow(radio, 2);
		System.out.println("\narea circulo de radio "+radio+": "+area);
	}

}
