package ejemplos.aserciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class imparesAssert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("introduce un valor positivo: ");
			int num = sc.nextInt();
			// asercion para verificar que el numero introducido sea positivo
			assert num > 0 : "no has introducido un valor positivo";
			// si el numero introducido es positivo,mostramos la lista de numeros impares

			for (int i = 3; i <= num; i += 2)
				System.out.print(i + " ");

		} catch (InputMismatchException ime) {
			System.out.println("ERROR");
		} catch (AssertionError a) {
			System.out.println(a.getMessage());
		} finally {
			sc.close();
		}

	}
}
