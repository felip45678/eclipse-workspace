package ejemplos.biblioteca;

public class LibroTest {

	public static void main(String[] args) {
		Libro libro1=new Libro("don quijote de la mancha"," miguel de cervantes",830);
		Libro libro2=new Libro("1984"," George orwell",545);
		Libro libro3=new Libro("El retrato de orian Gray"," Oscar wilde",450);
		//aumentamos el numero de pàginas de cada libro 100 mas
		libro1.setPagina(libro1.getPagina()+100);
		libro1.mostrar();
		libro2.setPagina(libro2.getPagina()+100);
		libro2.mostrar();
		libro3.setPagina(libro3.getPagina()+100);
		libro3.mostrar();
		//
	}

}
