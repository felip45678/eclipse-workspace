package comparacionObjetos.ejercicios;

public class Libro {

	//Atributos 
	String isbn,titulo,autor;
	int numeroPg=0;
	/**
	 * @param isbn
	 * @param titulo
	 * @param autor
	 * @param numeroPg
	 */
	public Libro(String isbn, String titulo, String autor, int numeroPg) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPg = numeroPg;
	}
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @return the numeroPg
	 */
	public int getNumeroPg() {
		return numeroPg;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @param numeroPg the numeroPg to set
	 */
	public void setNumeroPg(int numeroPg) {
		this.numeroPg = numeroPg;
	}
	/**
	 * funcion que permite calcular cuantas paginas de diferencia tiene un libro con otro
	 * @param paginas
	 * @return
	 */
	public int paginas(int paginas) {
		return this.numeroPg-paginas;
	}
	@Override
	public String toString() {
		return "El libro "+this.titulo+" con ISBN "+this.isbn+" creado por "+this.autor+" y tiene "+this.numeroPg+" páginas";
	}
	
	
}
