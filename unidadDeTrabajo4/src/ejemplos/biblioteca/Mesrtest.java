package ejemplos.biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mesrtest {

	public static void main(String[] args) {
		Mes dd = new Mes();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("comprobacion del dia...");
			System.out.print("dime el dia: ");
			dd.setDia(sc.nextInt());
			System.out.print("dime el mes: ");
			dd.setMes(sc.nextInt());
			System.out.print("dime el año: ");
			dd.setAño(sc.nextInt());
			System.out.println();
			

			if (dd.isValid()) {
				Mes dd2 = new Mes(dd.getDia(), dd.getMes(), dd.getAño());
				System.out.println("la fecha es correcta...:)");
				System.out.println(dd.toString());
				System.out.println("la fecha un dia despues seria");
				dd.setDia((dd.getDia() + 1));
				if (!dd.isValid()) {
					dd.setMes(dd.getMes() + 1);
					dd.setDia(1);
					if (dd.getMes() > 12) {
						dd.setMes(1);
						dd.setAño(dd.getAño() + 1);
						if(dd.getAño()==0) {
							dd.setAño(1);
						}
						
					
					}
				}
				
				
				System.out.println(dd.toString());
				
				switch(dd2.getMes()) {
				case 1:System.out.println("es el dia: "+dd.getDia()+" del año");break;
				case 2:System.out.println("es el dia: "+(dd.getDia()+31));break;
				case 3:System.out.println("es el dia: "+(dd.getDia()+31+28));break;
				case 4:System.out.println("es el dia: "+(dd.getDia()+31*2+28));break;
				case 5:System.out.println("es el dia: "+(dd.getDia()+31*2+28+30));break;
				case 6:System.out.println("es el dia: "+(dd.getDia()+31*3+28+30));break;
				case 7:System.out.println("es el dia: "+(dd.getDia()+31*3+28+30*3));break;
				case 8:System.out.println("es el dia: "+(dd.getDia()+31*4+28+30*3));break;
				case 9:System.out.println("es el dia: "+(dd.getDia()+31*5+28+30*3));break;
				case 10:System.out.println("es el dia: "+(dd.getDia()+31*5+28+30*4));break;
				case 11:System.out.println("es el dia: "+(dd.getDia()+31*6+28+30*4));break;
				case 12:System.out.println("es el dia: "+(dd.getDia()+31*6+28+30*5));break;
				}
			} else {
				System.out.println("la fecha introducida no es correcta..");
			}
		} catch (InputMismatchException ime) {
			System.out.println("error");
		} finally {
			sc.close();
		}

	}

}
