package repaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Nav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> navegacion = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String url = "";
		int conta = 1;
		System.out.print("introduce las URLS: ");
		boolean termino = false;
		boolean atras=false;
		while (!termino) {
			atras=false;
			System.out.print(conta + "url: ");
			url = sc.nextLine();
			if (url.contains("ATRAS")) {
				navegacion.remove(navegacion.size()-1);
				atras=true;
			} else if (url.contains("SALIR")) {
				termino = true;
				break;
			} else if(atras==true){
				System.out.println(navegacion.get(navegacion.size()-1));
			}else {
				navegacion.addLast(url);
				
			}

		}
		sc.close();

	}

}
