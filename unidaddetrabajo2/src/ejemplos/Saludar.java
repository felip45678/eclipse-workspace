package ejemplos;

public class Saludar {
	//declaracion del procedimiento
	/**
	 * Muestra una serie de mensajes por pantalla para saludar
	 * @param nombre - nombre de la persona a la que queremos saludar
	 */
	public static void saluda(String nombre) {
	System.out.println("hola "+nombre);
	System.out.println("bienvenido al ces vega media");
	System.out.println("espero que te guste");
	}
	
	//programa principal
	public static void main(String[] args) {
		saluda("fran");
		saluda("cristobal");
		saluda("rafa");
		saluda("mario");
		saluda("juanjo");
		saluda("diego");
		saluda("javier");
	}

}
