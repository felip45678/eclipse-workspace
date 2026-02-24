package arraysOrdenacion;

public class Ejercicio10 {

	final static int TAM=5;
	final static int LIM=10;
	final static void orden(int[] a) {
		int aux;
		for(int i=0;i<TAM;i++) {
			for(int j=0;j<i-1;j++) {
				if(a[j]>a[j+1]) {
					aux=a[j+1];
					a[j+1]=a[j];
					a[j]=aux;
				}
			}
		}
	}
	public static void mostrar(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	public static int contar(int []a,int []b) {
		int contar=0;
		for(int i=0;i<TAM;i++) {
			if(a[i]==b[i])
				contar++;
		}
		return contar;
	}
	public static void main(String[] args) {
		// programa que lea dos conjuntos de valores enteros y los almacene cada uno en
		// un arrya,el prograa,haciendo uso de funciones,debe indicar si los arrays
		// tienen valores repetidos y cuantos son
		int[] a=new int[TAM];
		int[] b=new int[TAM];
		for(int i=0;i<TAM;i++) {
			a[i]=(int)(Math.random()*LIM+1);
		}
		for(int i=0;i<TAM;i++) {
			b[i]=(int)(Math.random()*LIM+1);
		}
		orden(a);
		orden(b);
		mostrar(a);
		System.out.println();
		mostrar(b);
		System.out.println();
		System.out.println("hay "+contar(a,b)+" valores comunes");
	}

}
