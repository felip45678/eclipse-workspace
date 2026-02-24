package string;

public class LocalizarElEspacioV2 {

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
		String nombre="Harry potter";
		int pos=espacioEnBlanco(nombre);
		if(pos>=0) {
			System.out.println("Nombre: "+nombre.substring(0,pos));
			System.out.println("apellido: "+nombre.substring(pos,nombre.length()));
		}else 
			System.out.println("Nombre: "+nombre );
	}

}
