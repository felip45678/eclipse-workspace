package ejemplos.estudiante;

public class EstudianteTest2 {

	public static void main(String[] args) {
		//creamos un estudiante
		Estudiante e1=new Estudiante("harry potter",11,-6,5);
		//modificamos las notas utilizando los setters
		e1.setNota3(11);
		e1.mostrar();
		
	}

}
