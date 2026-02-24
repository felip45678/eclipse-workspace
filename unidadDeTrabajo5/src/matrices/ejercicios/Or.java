package matrices.ejercicios;

public class Or {

	
	public static void mostrar(int[][]vector) {
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<vector[i].length;j++) {
				System.out.print(vector[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][]vector=new int[3][3];
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<vector[i].length;j++) {
				vector[i][j]=(int)(Math.random()*20+1);
			}
		}
		mostrar(vector);
		System.out.println();
		int aux;
		boolean cambio;
		for(int i=0;i<vector.length;i++) {
			for(int k=vector.length-1;k>0;k--) {
				cambio=false;
				for(int j=0;j<k;j++) {
					if(vector[i][j]<vector[i][j+1]) {
						aux=vector[i][j+1];
						vector[i][j+1]=vector[i][j];
						vector[i][j]=aux;
						cambio=true;
					}
				}
				if(!cambio)
					break;
			}
		}
		mostrar(vector);
		

	}

}
