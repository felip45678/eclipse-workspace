package ejemplos.aserciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HoraokWithAsserts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int hora, minuto, segundos;
			// leemos las horas
			System.out.print("dime la hora: ");
			hora = sc.nextInt();
			assert hora>=0 && hora<=23:"Horas fuera de rango";
			//leemos los minutos
			System.out.print("dime los minutos: ");
			minuto = sc.nextInt();
			assert minuto>=0 && minuto<=59:"minutos fuera de rango";
			// leemos los segundos
			System.out.print("dime los segundos: ");
			segundos = sc.nextInt();
			assert segundos>=0 && segundos<=59:"segundos fuera de rango";
			
		} catch (InputMismatchException ime) {
			System.out.println("ERROR");
		}catch(AssertionError ae) { 
			System.out.println(ae.getMessage());
		}finally {
		
			sc.close();
		}
	}

}
