package arraysOrdenacion;

public class Ejerc6 {
	public static void boobleshort(int array[]) {
		int aux;
		boolean cambio;
		for(int i=array.length;i>0;i--) {
			cambio=false;
			for(int j=0;j<i-1;j++) {
				if(array[j]>array[j+1]) {
					aux=array[j+1];
					array[j+1]=array[j];
					array[j]=aux;
					cambio=true;
				}
			}
			if(!cambio)
				return; 
		}
	}
	public static void mostrar(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		// Realiza un programa que cree 100 números aleatorios entre 1 y 1000 y que muestre los 10 mayores.

		int tabla[]=new int[100];
		for(int i=0;i<tabla.length;i++) {
			tabla[i]=(int)(Math.random()*1000+1);
		}
		
		boobleshort(tabla);
		for(int i=0;i<tabla.length;i++) {
			System.out.print(tabla[i]+" ");
		}
		System.out.println("los 10 mayores son: ");
		for(int i=tabla.length-1;i>=tabla.length-10;i--) {
			System.out.print(tabla[i]+" ");
		}
	}

}
