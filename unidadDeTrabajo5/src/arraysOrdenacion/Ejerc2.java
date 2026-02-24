package arraysOrdenacion;

public class Ejerc2 {

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
	public static void main(String[] args) {
		//Mejora el método de la burbuja explicado anteriormente y utiliza una variable a modo de centinela o
		//flag, de tal manera que ésta se active cuando hay algún intercambio. En el momento que no haya
		//ningún intercambio, el algoritmo debería parar puesto que el vector ya está ordenado.
		int tabla[]=new int[50];
		for(int i=0;i<tabla.length;i++) {
			tabla[i]=(int)(Math.random()*50+1);
		}
		boobleshort(tabla);
		for(int i=0;i<tabla.length;i++) {
			System.out.print(tabla[i]+" ");
		}
	}

}
