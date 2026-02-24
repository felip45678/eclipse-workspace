package ejemplos.condicionales;

public class MAyord3 {
	/**
	 * funcion que devuelve el mayor de tres valores pasados como parametro
	 * @param x primer valor de tipo entero
	 * @param y segundo valor
	 * @param z tercer valor 
	 * @return el mayor valor entre x,y,z
	 */
	public static int mayor(int x,int y,int z) {
		if(x>y) {
			if (x>z)
				return x;
		    else
				return z;
		} else if (y>z)
			return y;
		else
				return z;
		}
	//main program
	public static void main(String[] args) {
		int a=Menor1.aleatorio(10);
		int b=Menor1.aleatorio(10);
		int c=Menor1.aleatorio(10);
		System.out.println("valores: "+a+" "+b+" "+c);
		System.out.println("Mayor: "+mayor(a,b,c));
	}
	
	

}
