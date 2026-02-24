package ejemplos;

public class InDec {

	public static void main(String[] args) {
		// Declaramos e inicializamos las variables 
		int x=3, y=8;
		
		
		//Realizamos las operaciones y mostramos los resultados por pantalla 
		System.out.println("x="+x+" y="+y);		// x=3 y=8
		x++;								    // x=x+1
		y--;									//y=y-1
		System.out.println("x="+x+" y="+y);		
		++x;									//x=x+1
		--y;									//y=y-1
		System.out.println("x="+x+" y="+y);
		x+=y;									//x=x+y
		System.out.println("x="+x+" y="+y);     
		x-=3;									
		System.out.println("x="+x+" y="+y);
		x-=y+1;
		System.out.println("x="+x+" y="+y);
		x=++y;
		System.out.println("x="+x+" y="+y);
		x=y++;
		System.out.println("x="+x+" y="+y);
	}

}
