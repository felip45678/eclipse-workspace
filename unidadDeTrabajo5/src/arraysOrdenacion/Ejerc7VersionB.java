package arraysOrdenacion;

public class Ejerc7VersionB {

	/**
	 * variable global
	 */
	static int[] lista;
	
	
	/**
	 * funcion que devuelve los numerosw del array ordenados
	 */
	public static void boobleshort() {
		int aux;
		boolean cambio;
		for(int i=lista.length;i>0;i--) {
			cambio=false;
			for(int j=0;j<i-1;j++) {
				if(lista[j]>lista[j+1]) {
					aux=lista[j+1];
					lista[j+1]=lista[j];
					lista[j]=aux;
					cambio=true;
				}
			}
			if(!cambio)
				return; 
		}
	}
	/**
	 * funcion que muestra los numeros 
	 */
	public static void mostrar() {
		for(int i=0;i<lista.length;i++) {
			System.out.print(lista[i]+" ");
		}
	}
	/**
	 * funcion que nos dice si el numero N esta dentro de los valores del array
	 * @param N
	 * @return
	 */
	public static boolean encuentra(int N) {
		for(int i=0;i<lista.length;i++) {
			if(N==lista[i])
				return true;
			if(N<lista[i])
				return false;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lista=new int[100];
		for(int i=0;i<lista.length;i++) {
			lista[i]=(int)(Math.random()*100+1);
		}
		System.out.println("lista desordenada: ");
		mostrar();
		System.out.println("\nlista ordenada: ");
		boobleshort();
		mostrar();
		System.out.println();
		
		for(int num=1;num<=100;num++) {
			if(!encuentra(num))
				System.out.print(num+" ");
		}
		}
	}