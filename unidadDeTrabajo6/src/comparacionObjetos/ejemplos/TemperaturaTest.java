package comparacionObjetos.ejemplos;

public class TemperaturaTest {

	public static void main(String[] args) {
		Temperatura f=new Temperatura();
		System.out.println("0 Grados Celsius son: "+f.celsiusToFarenheit(0)+" farenheit");
		System.out.println("15 Grados Celsius son: "+f.celsiusToFarenheit(15)+" farenheit");
		System.out.println("20 Grados Celsius son: "+f.celsiusToFarenheit(20)+" farenheit");
		System.out.println("0 Grados Farenheit son: "+f.farenheitToCelsius(0)+" celsius");
		System.out.println("15 Grados Farenheit son: "+f.farenheitToCelsius(15)+" celsius");
		System.out.println("20 Grados Farenheit son: "+f.farenheitToCelsius(20)+" celsius");

	}

}
