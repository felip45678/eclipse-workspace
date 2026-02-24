package colecciones;

import java.util.ArrayList;

public class Arraylistnumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>lista=new ArrayList<Integer>();
		//añadimos valores
		lista.add(1);
		lista.add(5);
		lista.add(7);
		lista.add(1);
		lista.add(14);
		lista.add(21);
		lista.add(13);
		//mostramos por pantalla la lista de valores
		System.out.println("lista: "+lista.toString());
		//eliminar el valor que ocupa la posicio 5 en la lista 
		System.out.println("\nEliminamos el valor que ocupa la posicion 5 en la lista");
		lista.remove(5);
		System.out.println("Lista: "+lista.toString());
		//eliminamos el valor 5
		System.out.println("\nEliminamos el valor 5 en la lista ");
		lista.remove(Integer.valueOf(5));
		System.out.println("Lista: "+lista.toString());


	}

}
