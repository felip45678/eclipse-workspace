package ejemplos.ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Plantilla {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			
		}catch(InputMismatchException ime) {
			System.out.println("ERROR");
		}finally {
			sc.close();
		}

	}

}
