package colecciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Map02 {

	public static void main(String[] args) {
		// creamos el mapa
		Map<Integer,String> ciudades =new HashMap<Integer,String>();
		//Insertamos elemnetos 
		ciudades.put(30500,"Molina de Segura");
		ciudades.put(30560,"Alguazas");
		ciudades.put(30565,"Las Torres de Cotillas");
		ciudades.put(30600,"Archena");
		ciudades.put(30820,"Alcantarilla");
		//Pedimos la introduccion por teclado de un codigo postal
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Introduce un código postal: ");
			int codPostal=Integer.parseInt(sc.nextLine().trim());
			if(ciudades.containsKey(codPostal))
				System.out.println(">La ciudad con codigo postal "+codPostal+" es "+ciudades.get(codPostal));
			else 
				System.out.println(">La ciudad con codigo postal "+codPostal+" no existe en el diccionario");
		}catch(Exception e) {
			System.out.println(">Error en la introduccion de datos");
		}
		//pedimos la introduccion por teclado del nombre de la ciudad
		System.out.print("\nIntroduce el nombre de un pueblo: ");
		String nombre=sc.nextLine();
		sc.close();
		if(ciudades.containsValue(nombre))
			System.out.println(">La ciudad "+nombre+" si se encuentra en nuestro diccionario");
		else
			System.out.println(">La ciudad "+nombre+" no se encuentra en nuestro diccionario");
		
		//mosramos todas las ciudades
		System.out.println("\n> Ciudades: ");
		System.out.println(" CP\tNombre \n-----\t-----------------");

		//a obtenemos el conjunto de entradas del map (clase-valor)
		Set<Map.Entry<Integer,String>> conjunto =ciudades.entrySet();
		
		//creamos el iterator 
		Iterator<Map.Entry<Integer,String>>i=conjunto.iterator();
		//recorremos con el while 
		while(i.hasNext()) {
			Map.Entry<Integer,String> m=i.next();
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		
	}

}
