package ejemplos.estudiante;

public class Estudiante {
	private String nombre;
	private int nota1;
	private int nota2;
	private int nota3;
	
	/**
	 * @param nombre nombre del estudiante
	 * @param nota1 su primera nota
	 * @param nota2 su segunda nota
	 * @param nota3 su tercera nota
	 */
	public Estudiante(String nombre, int nota1, int nota2, int nota3) {
		super();
		this.nombre = nombre;
		this.nota1 = validarNota(nota1);
		this.nota2 = validarNota(nota2);
		this.nota3 = validarNota(nota3);
		
	}
	/**
	 * valida la nota para que se encuentre dentro del rango
	 * @param nota 
	 * @return
	 */
	private int validarNota(int nota) {
		if(nota<0)
			return 0;
		if(nota>10)
			return 10;
		return nota;
	}
	/** devuelve el nombre del estudiante
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**establece el nombre del estudiante
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**devuelve la nota del estudiante
	 * @return the nota1
	 */
	public int getNota1() {
		return nota1;
	}
	/**establece la  nota del estudiante
	 * @param nota1 the nota1 to set
	 */
	public void setNota1(int nota1) {
			this.nota1 = validarNota(nota1);
	}
	/**devuelve la nota del estudiante
	 * @return the nota2
	 */
	public int getNota2() {
		return nota2;
	}
	/**establece la  nota del estudiante
	 * @param nota2 the nota2 to set
	 */
	public void setNota2(int nota2) {
		this.nota2 = validarNota(nota2);
	}
	/**devuelve la nota del estudiante
	 * @return the nota3
	 */
	public int getNota3() {
		return nota3;
	}
	/**establece la  nota del estudiante
	 * @param nota3 the nota3 to set
	 */
	public void setNota3(int nota3) {
		this.nota3 = validarNota(nota3);
	}
	/**
	 * funcion que calcula el promedio
	 * @return nos devyuelve el promedio
	 */
	public double promedio() {
		double suma=nota1+nota2+nota3;
		return suma/3;
	}
	public void mostrar() {
		System.out.println(nombre);
		System.out.println(" 1ª nota:"+nota1);
		System.out.println(" 2ª nota:"+nota2);
		System.out.println(" 3ª nota:"+nota3);
		System.out.println(" Promedio:"+promedio());
	}
	/**
	 * determina si un estudiante aprueba el curso
	 * @return true si la nota promedio es igual o superior a 5,false en otro caso
	 */
	public boolean aprueba() {
		return promedio()>=5;
		
	}
}
