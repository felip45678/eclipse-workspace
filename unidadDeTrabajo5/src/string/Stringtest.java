package string;

public class Stringtest {

	public static void main(String[] args) {
		// trim();
		String nombre;
		nombre="   Harry Potter   ";
		System.out.println(nombre.trim());
		System.out.println(nombre);
		nombre=nombre.trim();

		//replace();
		System.out.println(nombre.replace('e', 'X'));
		System.out.println(nombre.replace('t', 'T'));
		System.out.println(nombre.replace('r', 'R'));
		
		//subString
		System.out.println(nombre.substring(0, 5));
		System.out.println(nombre.substring(6));
		
		//indexOf()
		System.out.println("Posicion  de la H: "+nombre.indexOf('H'));
		System.out.println("Posicion  de la H: "+nombre.indexOf('P'));
		System.out.println("Posicion  de la t: "+nombre.indexOf('t'));
		
		System.out.println(nombre.substring(nombre.indexOf('P')));
		
		//startsWith()
		System.out.println(nombre.startsWith("Harry"));
		System.out.println(nombre.startsWith("Hary"));
		if(nombre.startsWith("Harry"))
			System.out.println("el nombre empieza por Harry");
		else 
			System.out.println("El nombre no empieza por Harry");


	}

}
