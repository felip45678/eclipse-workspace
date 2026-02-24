package ejemplos.scanner;

import java.util.Scanner;

public class ElSwitche {

	public static void main(String[] args) {
		//iniciamos el scanner
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("dime en que puesto has quedado:");
			int num=sc.nextInt();
			
			switch(num) {
			case 1:System.out.println(num+"-ORO");break;
			case 2:System.out.println(num+"-plata");break;
			case 3:System.out.println(num+"-bronce");break;
			case 4:;
			case 5:System.out.println(num+"-diploma");break;
			case 6:System.out.println(num+"-diploma");break;}
			if (num>6)
				System.out.println("ese numero nasty");
			
		}catch (Exception e) {
			System.out.print("solo se admiten numeros");
		}
		sc.close();
	}

}
