package repaso;

import java.util.Scanner;

public class Palabra {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String palabra = "";
		System.out.print("dime una frase: ");
		palabra=sc.nextLine();
		for(int i=0;i<palabra.split(" ").length;i++) {
			if(palabra.split(" ")[i]!="")
				System.out.println("palabra: "+palabra.split(" ")[i]);
		}
		sc.close();

	}

}
