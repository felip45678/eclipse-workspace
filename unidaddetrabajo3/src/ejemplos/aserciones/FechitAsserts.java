package ejemplos.aserciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FechitAsserts {
	/**
	 * funcion que devuelve el numero de dias que tiene un mes enero (mes 1)
	 * marzo(3) ,mayo(5),julio (7),agosto (8),octubre (10),diciembre(12) tienen 31
	 * dias abril(4),junio(6),septiembre(9),noviembre(11) tienen 30 dias febrero
	 * mes(2) tiene 28 dias no vamos a considerar años bisiestos.
	 * 
	 * @param mes-numero correspondiente al mes
	 * @return numero de dias que tiene el mes
	 */
	private static int diasMes(int mes) {
		int numdias = 31;
		if (mes == 2)
			numdias = 28;
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			numdias = 30;
		return numdias;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int año, mes, dia;
			// leemos el año
			System.out.print("Año: ");
			año = sc.nextInt();
			assert año!=0:">>> el año 0 no existe";
			// leemos el mes
			System.out.print("mes: ");
			mes = sc.nextInt();
			assert mes>=1 && mes<=12:">>los meses van desde 1 (enero) hasta 12 (diciembre)";
			// leemos el dia
			System.out.print("dia: ");
			dia = sc.nextInt();
			assert dia>=1 && dia<=diasMes(mes):">>los dias son incorrectos";
			System.out.println("la fecha "+dia+"/"+mes+"/"+año);
		} catch (InputMismatchException ime) {
			System.out.println("ERROR");
		}catch (AssertionError ae ) {
			System.out.println(ae.getMessage());
		} finally {
			sc.close();
		}
	}

}
