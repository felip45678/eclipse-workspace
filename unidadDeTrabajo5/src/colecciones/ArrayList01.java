package colecciones;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		// creamos una lista de nombres 
		ArrayList<String>listaNombres=new ArrayList<String>();
		//insertamos 6 nombres en la lista 
		listaNombres.add("Ana");
		listaNombres.add("Juan");
		listaNombres.add("Alba");
		listaNombres.add("pedro");
		listaNombres.add("susana");
		listaNombres.add("Ernesto");
		//numero de nombre de la lista 
		System.out.println("Cantidad de nombres: "+listaNombres.size());
		//eliminamos un nombre de la lista 
		String nombre="Juan";
		if(listaNombres.remove(nombre))
			System.out.println("El nombre "+nombre +" ha sido correctamente eliminado ");
		else
			System.out.println("No existe el nombre "+nombre +" en la lista ");

		//comprobamos si existe un nombre en la lista 
		nombre="Sergio";
		if(listaNombres.contains(nombre))
			System.out.println("Si existe el nombre "+nombre +" en la lista ");
		else
			System.out.println("No existe el nombre "+nombre +" en la lista ");
	}

}
