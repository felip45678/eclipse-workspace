package string;

public class Comparacion {

	public static void main(String[] args) {
		String s1="ANTONIA";
		String s2="Antonia";
		
		//1.Metodos compareTo compareToIgnoreCase
		if(s1.compareTo(s2)==0)
			System.out.println(s1+" y "+s2+" son iguales");
		else
			System.out.println(s1+" y "+s2+" son distintos");
		
		if(s1.compareToIgnoreCase(s2)==0)
			System.out.println(s1+" y "+s2+" son iguales");
		else
			System.out.println(s1+" y "+s2+" son distintos");

		//2.Método equals
		if(s1.equals(s2)==true)
			System.out.println(s1+" y "+s2+" son iguales");
		else
			System.out.println(s1+" y "+s2+" son distintos");
		
		//3.
		
	}

}
