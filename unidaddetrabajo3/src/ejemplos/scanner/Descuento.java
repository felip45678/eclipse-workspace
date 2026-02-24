package ejemplos.scanner;

import java.util.Scanner;

public class Descuento {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("dime el precio de tu articulo");
			float precio=sc.nextFloat();
			System.out.println("dime el descuento de tu articulo");
			 int descuento=sc.nextInt();
			
			 //aplicamos el descuento
			 double preciofinal=precio*(100-descuento)/100;
			 System.out.println("precio final "+preciofinal+"");
			 
		
		
		
		}catch (Exception e) {
			System.out.println("erroe no has introducido");
		}
			
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	

}
}