package colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator01 {

	public static void main(String[] args) {
		//creamos una lista de nombres
		ArrayList<String> lista=new ArrayList<String>();
		//agregamos nombres a las listas
		lista.add("Ana");
		lista.add("Juan");
		lista.add("Alba");
		lista.add("Pedro");
		lista.add("Susana");
		lista.add("Ernesto");
		//iteramos va bucle for
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		//iteramos via bucle while
		System.out.println("\nListado 2 (While): ");
		int i=0;
		while(i<lista.size()) {
			System.out.println(lista.get(i));
			i++;
		}
		//iteramos via "iterator"
		System.out.println("\n\nListado 3(Iterator): ");
		Iterator<String>listaite=lista.iterator();
		while(listaite.hasNext()) {
			System.out.println(listaite.next());
		}
	}

}
