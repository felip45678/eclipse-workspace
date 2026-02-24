package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EdadV2 {
	private static int edad(int a, int m, int d) {
		Date hoy = new Date();
		SimpleDateFormat formato;
		formato = new SimpleDateFormat("yyyy");
		int aHoy = Integer.parseInt(formato.format(hoy));
		formato = new SimpleDateFormat("MM");
		int mHoy = Integer.parseInt(formato.format(hoy));
		formato = new SimpleDateFormat("dd");
		int dHoy = Integer.parseInt(formato.format(hoy));
		// calculamos la edad
		int edad = aHoy - a;
		if (mHoy < m) {
			edad--;
		} else if (mHoy == m) {
			if (dHoy < d)
				edad--;

		}
		return edad;
	}

	public static void main(String[] args) {

		// convertimos cada estirng a un int
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("dia:");
			int d = sc.nextInt();
			System.out.print("mes:");
			int m = sc.nextInt();
			System.out.print("año:");
			int a = sc.nextInt();

			System.out.println("tu edad es:" + edad(a, m, d));
		} catch (InputMismatchException ime) {
			System.out.println("error");
		} finally {
			sc.close();
		}

	}

}
