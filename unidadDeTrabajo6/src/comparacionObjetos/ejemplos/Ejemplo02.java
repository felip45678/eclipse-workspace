package comparacionObjetos.ejemplos;

public class Ejemplo02 {

	public static void main(String[] args) {
		String cad1="PROGRAMACION";
		String cad2=new String("PROGRAMACION");
		if(cad1==cad2)
			System.out.println("[==] Son iguales");
		else 
			System.out.println("[==] son distintos ");
		if(cad1.equals(cad2))
			System.out.println("[equals] Son iguales");
		else 
			System.out.println("[equals] son distintos ");
		

	}

}
