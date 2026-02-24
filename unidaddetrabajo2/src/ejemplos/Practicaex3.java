package ejemplos;

public class Practicaex3 {

	public static void main(String[] args) {
		// Declaracion de variables 
		int total,cambio,billete5,billete10,billete20,moneda2,moneda1,pago;
		//Realizamos las operaciones
		pago=50;
		total=7;
		cambio=(pago-total);
		billete20=cambio/20;
		billete10=(cambio%20)/10;
		billete5=(cambio%10)/5;
		moneda2=(cambio%5)/2;
		moneda1=(cambio%2)/1;
		//Mostramos por pantalla
		System.out.println("billetes de 20 :"+billete20);
		System.out.println("billetes de 10 :"+billete10);
		System.out.println("billetes de 5 :"+billete5);
		System.out.println("monedas de  2 :"+ moneda2);
		System.out.println("moneda de 1 : "+ moneda1);
	}

}
