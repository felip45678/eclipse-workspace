package ejemplos;

public class Areas {

	public static double radio1(int radio) {
	final double PI=3.1416;
	return PI*radio*radio;
	}
	
	//programa principal
	public static void main(String[] args) {
	System.out.println("Longitud de la circunfereencia de radio "+2+": "+radio1(2));
	System.out.println("Longitud de la circunfereencia de radio "+3+": "+radio1(3));
	System.out.println("Longitud de la circunfereencia de radio "+4+": "+radio1(4));
	System.out.println("Longitud de la circunfereencia de radio "+5+": "+radio1(5));


	}

}
