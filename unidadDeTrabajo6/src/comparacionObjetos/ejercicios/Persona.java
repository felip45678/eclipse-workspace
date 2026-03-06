package comparacionObjetos.ejercicios;

public class Persona {

	private String nombre;
	private char sexo;
	private int edad,peso,altura;
	/**
	 * @param nombre
	 * @param sexo
	 */
	public Persona() {
		
		this.nombre ="";
		this.sexo = 'H';
		this.edad = 0;
		this.peso = 0;
		this.altura = 0;
	}
	/**
	 * @param nombre
	 * @param sexo
	 * @param edad
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, char sexo, int edad, int peso, int altura) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	/**
	 * @param nombre
	 * @param sexo
	 * @param edad
	 */
	public Persona(String nombre,char sexo, int edad) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso=this.altura=0;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}
	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}
	/**
	 * funcion que permite calcular el indice de masa corporal
	 * @return
	 */
	public int calcularIMC() {
		double pesoActual=peso/(Math.pow(altura, 2));
		if(pesoActual>=20 && pesoActual<=25)
			return 0;
		else {
			if(pesoActual<20)
				return -1;
			return 1;
		}
	}
	/**
	 * funcion que indica si una persona es mayor de edad
	 * @return
	 */
	public boolean mayorEdad() {
		if(this.edad>18)
			return true;
		return false;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", altura="
				+ altura + "]";
	}
	
	
	
	
}
