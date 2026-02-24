package ejemplos;

public class Boletinejerc3 {
	public static double preciofinal(double precio,int descuento) {
		return precio-(precio*descuento/100);
	}
	public static void main(String[] args) {
		double p;
		p=85;
		int d=30;
		System.out.println("Precio (€): "+p);
		System.out.println("Descuento (%): "+d);
		System.out.println("Precio rebajado (€): "+preciofinal(p, d));
	}

}
