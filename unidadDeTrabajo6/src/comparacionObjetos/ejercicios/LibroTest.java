package comparacionObjetos.ejercicios;

public class LibroTest {

	public static void main(String[] args) {
		Libro a=new Libro("ES453563456","Harry Potter","Shakespeare",430);
		Libro b=new Libro("ES563972840","El principito","Garcia Marquez",620);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
	
		if(a.getNumeroPg()>b.getNumeroPg()) {
			System.out.println(a.getTitulo()+" tiene mas paginas");
		}else
			System.out.println(b.getTitulo()+" tiene mas paginas");
	}

}
