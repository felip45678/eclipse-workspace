package string;

public class LocalizarLosEspacios {

	/**
	 * funcion que devuelve la posicion del primer espacio en blanco que contiene un String pasao como parametro
	 * @param bb
	 * @return
	 */
	public static int espacioEnBlanco(String bb) {
		for(int i=0;i<bb.length();i++) {
			if(bb.charAt(i)==' ') {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String nombre="Harrypotter";
		int pos=espacioEnBlanco(nombre);
		if(pos>=0)
			System.out.println("El nombre SI tiene espacios en blanco ");
		else 
			System.out.println("El nombre NO tiene espacios en blanco ");
	}

}
