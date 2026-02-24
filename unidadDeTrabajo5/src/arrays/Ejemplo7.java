package arrays;

public class Ejemplo7 {

	/**
	 * funcion que nos muestra el array
	 * @param array
	 */
	public static void mostrar(int array[]) {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
	/**
	 * funcion que muestra los numeros invertidos
	 * @param array
	 */
	public static void inverso(int array[]) {
		for(int i=array.length-1;i>0;i--)
			System.out.print(array[i]+" ");
	}
	/**
	 * funcion que muestra el mayor valor
	 * @param array
	 */
	public static void mayor(int array[]) {
		int mayor=array[0];
		for(int i=1;i<array.length;i++) {
			if(mayor<array[i])
				mayor=array[i];
		}
		System.out.println("\nEl mayor valor es: "+mayor);	
	}
	/**
	 * funcion que muestra el  numero menor del array
	 * @param array
	 */
	public static void menor(int array[]){
		int menor=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]<menor)
				menor=array[i];
		}
		System.out.println("El menor valor es: "+menor);
	}
	public static void media(int array[]) {
		int num=0;
		double media=0;
		for(int i=0;i<array.length;i++) {
			num+=array[i];
			media=(double)num/array.length;
		}
		System.out.println("la media es: "+media);
	}
	public static void main(String[] args) {
		// creamos un array de numeros enteros
		int tabla[]= {11,23,32,4,51,21,8,-10,17};
		//mostramos el array por pantalla 
		System.out.print("Los valores de la tabla son: ");
		mostrar(tabla);
		//mostramos el array por pantalla en orden inverso
		System.out.print("\nLos valores de la tabla inversos son: ");
		inverso(tabla);
		//mostramos el mayor valor almacenado en el array
		mayor(tabla);
		//mostramos el menor valor almacenado en el array
		menor(tabla);
		//mostramos la media de los valores almacenado sen el array
		media(tabla);
	}

}
