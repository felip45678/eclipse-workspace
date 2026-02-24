package arraysOrdenacion;

public class Ej01 {

	final static int TOTAL=50;
	final static int NUMERIO=100;
	public static void boobleshort(int array[]) {
		int aux;
		for(int i=array.length;i>0;i--) {
			for(int j=0;j<i-1;j++) {
				if(array[j]>array[j+1]) {
					aux=array[j+1];
					array[j+1]=array[j];
					array[j]=aux;
				}
			}
		}
	}
	public static void main(String[] args) {
		// Realiza un programa que cree un array de 50 posiciones cargado con valores aleatorios. Los valores
		//aleatorios deberán estar entre el 1 y el 100. Una vez cargado el vector, deberá ordenarlo mediante el
		//método de la burbuja y mostrarlo ordenado por pantalla.

		int tabla[]=new int[TOTAL];
		for(int i=0;i<tabla.length;i++) {
			tabla[i]=(int)(Math.random()*NUMERIO+1);
		}
		boobleshort(tabla);
		for(int i=0;i<tabla.length;i++) {
			System.out.print(tabla[i]+" ");
		}
	}

}
