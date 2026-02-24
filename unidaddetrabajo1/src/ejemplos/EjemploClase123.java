package ejemplos;

public class EjemploClase123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int importe, cambio, valor;
		int billete5, billete10, billete20, billete50;
		importe = 50;
		valor = 25;
		cambio = (importe - valor);

		billete50 = cambio / 50;
		billete20 = cambio % 20;
		billete10 = cambio % 10;
		billete5 = (cambio % 5);

		cambio = (importe - valor);

		System.out.println(billete50);
		System.out.println(billete20);
		System.out.println(billete10);
		System.out.println(billete5);

	}
}