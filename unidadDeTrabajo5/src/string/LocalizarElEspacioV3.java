package string;

public class LocalizarElEspacioV3 {

	/**
	 * funcion que devuelve la posicion del primer espacio en blanco que contiene un String pasao como parametro
	 * @param bb
	 * @return
	 */
	public static int espacioEnBlanco(String bb) {
		
		return bb.indexOf(' ');
	}
	public static void main(String[] args) {
		String nombre="Harry potter";
		int pos=espacioEnBlanco(nombre);
		if(pos>=0) {
			System.out.println("Nombre: "+nombre.substring(0,pos));
			System.out.println("apellido: "+nombre.substring(pos+1));
		}else 
			System.out.println("Nombre: "+nombre );
	}

}
