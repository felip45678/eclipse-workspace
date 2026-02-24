package ejemplos.condicionales;

public class Par {
	/**
	 * funcion que indica si un numero entero es par o impar
	 * @param numero valor entero del que queremos determinar si es par o impar
	 * @return true si numero par,false en otro caso
	 */
	public static boolean esPar(int numero) {
		if(numero%2==0)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		//generamos el valor aleatorio entre 1 y 50
		int num1=Menor1.aleatorio(50);
		int num2=Menor1.aleatorio(50);
		int num3=Menor1.aleatorio(50);
		//indicamos si el numero es par o impar
		if (esPar(num1)==true)
			System.out.println(num1+" es PAR");
		else 
			System.out.println(num1+" es IMPAR");
		if (esPar(num2)==true)
			System.out.println(num2+" es PAR");
		else 
			System.out.println(num2+" es IMPAR");
		if (esPar(num3)==true)
			System.out.println(num3+" es PAR");
		else 
			System.out.println(num3+" es IMPAR");
		
	}

}
