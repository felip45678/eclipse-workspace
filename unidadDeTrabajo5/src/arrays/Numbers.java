package arrays;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int n1,n2,n3,n4,n5;
			System.out.println("introduce 5 numeros: ");
			System.out.print("dime un numero");
			n1=sc.nextInt();
			System.out.print("dime un numero");
			n2=sc.nextInt();
			System.out.print("dime un numero");
			n3=sc.nextInt();
			System.out.print("dime un numero");
			n4=sc.nextInt();
			System.out.print("dime un numero");
			n5=sc.nextInt();
			//mostramos los numero es orden
			System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5);
			System.out.println(n5+" "+n4+" "+n3+" "+n2+" "+n1);
			System.out.println("primer numero: "+n1);
			System.out.println("ultimo numero: "+n5);
		}catch(Exception e) {
			System.out.println("error");
		}finally {
			sc.close();
		}

	}

}
