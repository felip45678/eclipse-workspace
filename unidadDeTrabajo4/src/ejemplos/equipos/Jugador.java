package ejemplos.equipos;

public class Jugador {
	//atributos
	private int codigo;		//codigo del jugador
	private String nombre; //nombre del jugador
	private double altura;  //altura del jugador
	private int sueldo;  //
	//constructor
	/**
	 * cosntructor
	 * @param codigo codigo del jugador
	 * @param nombre nombre del jugador
	 * @param altura altura del jugador
	 * @param sueldo sueldo del jugador
	 */
	public Jugador(int codigo, String nombre, double altura, int sueldo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.altura = altura;
		this.sueldo = sueldo;
	}
	/**devuelve el codigo de jugador
	 * @return the codigo 
	 */
	public int getCodigo() {
		return codigo;
	}
	/**establece el codigo del jugador
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**devuelve el nombre de jugador
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**establece el nombre del jugador
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**devuelve la altura de jugador
	 * @return the altura
	 */ 
	public double getAltura() {
		return altura;
	}
	/**establece la altura del jugador
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	/**devuelve el sueldo de jugador
	 * @return the sueldo
	 */
	public int getSueldo() {
		return sueldo;
	}
	/**establece el sueldo del jugador
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	/**
	 * muestra por pantalla la informacion del jugador
	 */
	public void mostrarJugador() {
		System.out.println("jugador "+codigo+": ");
		System.out.println(nombre+"("+altura+"m.) -->"+sueldo+" €");
		
	}
}
