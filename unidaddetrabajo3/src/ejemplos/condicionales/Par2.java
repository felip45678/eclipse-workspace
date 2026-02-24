package ejemplos.condicionales;

public class Par2 {
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
		int num4=Menor1.aleatorio(50);
		System.out.println("valores: "+num1+" "+num2+" "+num3+" "+num4);
		System.out.print("pares: ");
		if (esPar(num1))
			System.out.print(num1+" ");
		 
		if (esPar(num2)==true)
			System.out.print(num2+" ");
		
		if (esPar(num3)==true)
			System.out.print(num3+" ");
		
		if (esPar(num4)==true)
			System.out.print(num3+" ");
		
		
		
	}

}
