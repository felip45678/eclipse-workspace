package ejemplos.ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
	final static int TOTAL=5;
	public static void main(String[] args) {
		//Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos
		//mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
		
		Scanner sc=new Scanner(System.in);
		try {
			int edad,altura,sumaalt,sumaed;
			sumaed=0;
			sumaalt=0;
			int mayores=0;
			int media=0;
			for(int i=1;i<=TOTAL;i++) {
				System.out.print(+i+" dime la edad:");
				edad=sc.nextInt();
				sumaed+=edad;
				if(edad>18){
					mayores++;
				}
				System.out.print(+i+" dime la altura en CM:");
				altura=sc.nextInt();
				sumaalt+=altura;
				if(altura<175){
					media++;
				}
			}
			System.out.println(" la edad media es: "+sumaed/TOTAL);
			System.out.println(" la altura media en CM es: "+sumaalt/TOTAL);
			System.out.println(" la cantidad de alumnos mayores de 18 son: "+mayores);
			System.out.println(" la cantidad de alumnos que miden menos de 175cm son: "+media);
		}catch(InputMismatchException ime) {
			System.out.println("error");
		}finally {
		sc.close();
		}
	}

}
