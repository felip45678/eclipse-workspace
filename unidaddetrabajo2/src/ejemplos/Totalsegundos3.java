package ejemplos;

public class Totalsegundos3 {
	public static int totalseg(int horas,int minutos,int segundos) {
		return 3600*horas+60*minutos+segundos;
	}
	public static void main(String[] args) {
		// declaracion de variables 
		int h,m,s;
		
		//realizamos los calculos y mostramos el total por consola
		h=0; m=0; s=1;
		System.out.println(h+" horas "+m+" min "+s+" seg --> Total: "+totalseg(h,m,s)+" segundos");
	}

}
