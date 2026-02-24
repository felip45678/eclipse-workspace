package arraysOrdenacion;

public class Ejerc5 {

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
		//Realiza un programa que cree un vector de 50 posiciones con número aleatorios entre 1 y 50. Una vez
		//creado el vector, el programa deberá mostrar el mayor, el menor y la media de los valores almacenados
		//en el array.
		int tabla[]=new int[50];
		int media=0;
		for(int i=0;i<tabla.length;i++) {
			tabla[i]=(int)(Math.random()*50+1);
			media+=tabla[i];
		}
		int menor=tabla[0];
		int mayor=tabla[0];
		for(int i=0;i<tabla.length;i++) {
			System.out.print(tabla[i]+" ");
		}
		System.out.println();
		boobleshort(tabla);
		for(int i=0;i<tabla.length;i++) {
			System.out.print(tabla[i]+" ");
		}
		
		
		for(int i=0;i<tabla.length;i++) {
			if(tabla[i]<menor)
				menor=tabla[i];
			if(tabla[i]>mayor)
				mayor=tabla[i];
		}
		System.out.println();
		System.out.println("el numero mayor es: "+mayor);
		System.out.println("el numero menor es: "+menor);
		System.out.println(" la media es: "+media/50.0);
	}

}
