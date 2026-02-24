package wjercicios;

import java.util.Scanner;

public class Ejercicio6 {
	public static void  billetes(int billete) {
		int b200,b100,b50,b20,b10,b5,resto;
	b200=billete/200;
	resto=billete%200;
	b100=billete/100;
	resto=billete%=100;
	b50=billete/50;
	resto=billete%=50;
	b20=billete/20;
	resto=billete%=20;
	b10=billete/10;
	resto=billete%=10;
	b5=billete/5;
	resto=billete%=5;
	if(b200>0)
		System.out.println("billetes de 200: "+b200);
	if(b100>0)
		System.out.println("billetes de 100: "+b100);
	if(b50>0)
		System.out.println("billetes de 50: "+b50);
	if(b20>0)
		System.out.println("billetes de 20: "+b20);
	if(b10>0)
		System.out.println("billetes de 10: "+b10);
	if(b5>0)
		System.out.println("billetes de 200: "+b5);
	
	System.out.println("Sobran: "+resto+" €");
	}
	
	public static void main(String[] args) {
		// Procedimiento que, dado un importe en euros, nos indique el mínimo número de billetes y la cantidad sobrante
		//que se pueden utilizar para obtener dicha cantidad. Ejemplo: 362 euros  1 billete de 200, 1 billete de 100, 1
		//billete 50, un billete de 10, sobran 2 euros.
		
		 Scanner sc=new Scanner(System.in);
		 try {
		 int pago;
		 System.out.println("dime la cantidad: ");
		 pago=sc.nextInt();
		 billetes(pago);
		 }catch (Exception e) {
			 System.out.println("ERROR");
		 }
		 sc.close();
		 }

}
