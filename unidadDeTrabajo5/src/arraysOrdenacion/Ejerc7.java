package arraysOrdenacion;

public class Ejerc7 {

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
	public static boolean encuentra(int N,int tabla[]) {
		for(int i=0;i<tabla.length;i++) {
			if(N==tabla[i])
				return true;
			if(N<tabla[i])
				return false;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabla[]=new int[100];
		for(int i=0;i<tabla.length;i++) {
			tabla[i]=(int)(Math.random()*100+1);
		}
		System.out.println("lista desordenada: ");
		mostrar(tabla);
		System.out.println("\nlista ordenada: ");
		boobleshort(tabla);
		mostrar(tabla);
		System.out.println();
		
		for(int num=1;num<=100;num++) {
			if(!encuentra(num,tabla))
				System.out.print(num+" ");
		}
		}
	}