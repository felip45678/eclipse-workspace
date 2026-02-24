package string;

public class StringBuffetTest {

	public static void main(String[] args) {
		//ejemplo con String
		String nombre1="Harry potter";
		nombre1.toUpperCase();
		System.out.println(nombre1);
		System.out.println(nombre1.toUpperCase());
		nombre1=nombre1.toUpperCase();
		System.out.println(nombre1);
		//Ejemplo con stringbuffer
		StringBuffer nombre2=new StringBuffer("Hermione Granger");
		System.out.println(nombre2);
		nombre2.reverse();
		System.out.println(nombre2);
		
		String nombre3=nombre2.reverse().toString();
		System.out.println(nombre3);
		
		StringBuffer nombre4=new StringBuffer(nombre3.substring(0, 8).toUpperCase());
		nombre4.reverse();
		System.out.println(nombre4);
	}

}
