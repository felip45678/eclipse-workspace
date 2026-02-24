package ejemplos.estudiante;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstudianteTest {

	public static void main(String[] args) {
		//creamos un estudiante
		
		Scanner sc=new Scanner(System.in);
		try {
			//pedimos por teclado la informacion del estudiante
			System.out.print("dime el nombre del estudiante: ");
			String name=sc.nextLine();
			System.out.print("dime la nota de la primera evaluacion: ");
			int n1=sc.nextInt();
			System.out.print("dime la nota de la segunda evaluacion: ");
			int n2=sc.nextInt();
			System.out.print("dime la nota de la tercera evaluacion: ");
			int n3=sc.nextInt();

			//creamos el estudiante con los datos introducidos
			Estudiante e=new Estudiante(name,n1,n2,n3);
			//mostramos la informacion sobre el estudiante 
			System.out.println();
			e.mostrar();
			System.out.print("estado: ");
			if(e.aprueba())
				System.out.println("Aprueba el modulo");
			else
				System.out.println("Suspende el modulo debe presentarse a la recuperacion");
		}catch(InputMismatchException ime){
			System.out.println("error");
		}finally{
			sc.close();
		}
		
	}

}
