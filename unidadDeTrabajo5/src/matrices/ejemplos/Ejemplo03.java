package matrices.ejemplos;

public class Ejemplo03 {

	final static int TAM=3;
	/**
	 * procedimiento que myuestra por pantalla los valores almacenados en una matriz
	 * @param M
	 */
	public static void mostrarMatriz(int M[][]) {
		for(int i=0;i<M.length;i++) {
			for(int j=0;j<M[i].length;j++)
				System.out.print(M[i][j]+"\t");
			System.out.println();
		}

	}
	public static void main(String[] args) {
		int[][] matriz=new int[TAM][TAM];    //matriz cuadrada
		System.out.println("Matriz inicial:");
		mostrarMatriz(matriz);
		
		//Vamos a incrementar en una unidad cada valor almacenado en la matriz
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j]++;
			}
		}
		//mostramos por pantalla los valores actuales en la matriz
		System.out.println("matriz actual: ");
		mostrarMatriz(matriz);
		
		//incrementamos en una unidad los valores de la diagonal principal
		for(int i=0;i<matriz.length;i++) {
			matriz[i][i]++;
			
		}
		//mostramos la diagonal principal
		System.out.println("\nMatriz diagonal principal: ");
		for(int i=0;i<matriz.length;i++)
			System.out.print(matriz[i][i]+" ");
	}

}
