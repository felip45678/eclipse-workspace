package ejemplos.biblioteca;

public class Libro {
	//atributos
	private String titulo;
	private String autor;
	private int pagina;
	/**
	 * @param titulo nombre del titulo del libro
	 * @param autor autor del libro
	 * @param pagina numero de pagina del libro
	 */
	public Libro(String titulo, String autor, int pagina) {
		this.titulo = titulo;
		this.autor = autor;
		this.pagina = pagina;
	}
	/**devuelve el titulo
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**establece el titulo
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**devuelve el autor
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**establece el autor
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**devuelve la pagina 
	 * @return the pagina
	 */
	public int getPagina() {
		return pagina;
	}
	/**establece la pagina 
	 * @param pagina the pagina to set
	 */
	public void setPagina(int pagina) {
		this.pagina = pagina;
	}
	public void mostrar() {
		System.out.println("'"+titulo+"'"+" ("+autor+") "+" numPaginas "+pagina);
		
	}
	
	
}
