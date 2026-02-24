package ejemplos.equipos;

public class Equipo {
	// Atributos
	public int codigo; // codigo del equipo
	private String nombre; // nombre del equipo
	private String ciudad; // ciudad en la que juega el equipo
	private String pabellon; // nombre del pabellon donde juega el equipo

	// constructor
	/**
	 * cosntructor del equipo
	 * 
	 * @param cod codigo del equipo(int)
	 * @param nom nombre del equipo(String)
	 * @param ciu ciudad del equipo (String)
	 * @param pab pabellon donde juega el equipo(String)
	 */
	public Equipo(int cod, String nom, String ciu, String pab) {
		codigo = cod;
		nombre = nom;
		ciudad = ciu;
		pabellon = pab;
	}
	//GETTERS
	/**
	 * devuelve el codigo del equipo
	 * @return
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * devuelve el nombre del equipo
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * devuelve laa ciudqad del equipo
	 * @return
	 */
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * devuelve el pabellon del equipo
	 * @return
	 */
	public String getPabellon() {
		return pabellon;
	}
	// SETTERS
	/**
	 * Establece el codigo del equipo
	 * 
	 * @param valor nuevo codigo del equipo
	 */
	public void setCodigo(int valor) {
		codigo = valor;
	}

	/**
	 * Establece el nombre del equipo
	 * 
	 * @param valor nuevo nombre del equipo
	 */
	public void setNombre(String valor) {
		nombre = valor;
	}

	/**
	 * Establece la ciudad el equipo
	 * 
	 * @param valor nueva ciudad del equipo
	 */
	public void setCiudad(String valor) {
		ciudad = valor;
	}

	/**
	 * Establece el pabellon del equipo
	 * 
	 * @param valor nuevo pabellon del equipo
	 */
	public void setPabellon(String valor) {
		pabellon = valor;
	}

	/**
	 * procedimiento que muestre por pantalla toda la informacion referente a un
	 * equipo
	 */
	public void mostrarEquipo() {
		System.out.println("Equipo: " + codigo);
		System.out.println("Nombre: " + nombre);
		System.out.println("Ciudad: " + ciudad);
		System.out.println("pabellon: " + pabellon+"\n");
	}

}
