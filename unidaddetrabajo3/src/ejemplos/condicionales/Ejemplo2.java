package ejemplos.condicionales;

public class Ejemplo2 {

	public static void main(String[] args) {
		int mates=4,lengua=6;
		if (mates >=5) {
			if (lengua >=5) {
			System.out.println("has aprobado las dos asignaturas");
		}else {
			System.out.println("has aprobado solo matematicas");
		}
	}else if (lengua >=5) {
		System.out.println("has aprobado solo lengua");
	} else {
		System.out.println("no has aprobado ninguna asignatura");
	}
	}
	}
