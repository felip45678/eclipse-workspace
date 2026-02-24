package ejemplos.condicionales;

public class Mayorde3vers3 {
	public static int mayor(int x,int y) {
		if(x>y)
			return x;
		return y;
	}
	public static int mayor(int x,int y,int z) {
		return mayor(mayor(x,y),z);
	}
	public static void main(String[] args) {
			int a=Menor1.aleatorio(10);
			int b=Menor1.aleatorio(10);
			int c=Menor1.aleatorio(10);
			int d=Menor1.aleatorio(10);
			
			System.out.println("valores: "+a+" "+b+" "+c+" "+d);
			System.out.println("Mayor entre: "+a+" y "+b+": "+mayor(a,b));
			System.out.println("mayor entre:: "+a+" y  "+c+": "+mayor(a,c));
			System.out.println("Mayor entre: "+b+" y "+c+": "+mayor(b,c));
			System.out.println("Mayor entre: "+a+"  "+b+" "+c+": "+mayor(a,b,c));
			System.out.println("Mayor entre: "+a+"  "+b+" "+c+" "+d+": "+mayor(mayor(a,b),mayor(c,d)));

	}

}
