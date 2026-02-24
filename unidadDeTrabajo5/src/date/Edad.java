package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		
		//creamos la fecha actual y la formateamos para obtener el año,mes y dia 
		Date hoy=new Date();
		SimpleDateFormat formato;
		formato=new SimpleDateFormat("yyyy");
		String year=formato.format(hoy);
		formato=new SimpleDateFormat("MM");
		String month=formato.format(hoy);
		formato=new SimpleDateFormat("dd");
		String day=formato.format(hoy);
		System.out.println("fecha actual: "+day+"/"+month+"/"+year);
		//convertimos cada string a un int con parse int
		int aHoy=Integer.parseInt(year);
		int mHoy=Integer.parseInt(month);
		int dHoy=Integer.parseInt(day);
		
		// pedimos al usuario que introduzca su fecha de nacimiento
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("introduce tu fecha de nacimiento: ");
			System.out.print(" Dia: ");
			int d=sc.nextInt();
			System.out.print(" mes: ");
			int m=sc.nextInt();
			System.out.print(" año: ");
			int a=sc.nextInt();
			//calculamos la edad
			int edad=aHoy-a;
			if(mHoy<m) 
				edad--;
			else if(mHoy==m)
				if(dHoy<d)
					edad--;
			
			
			System.out.println("\nedad: "+edad);
			
		}catch(InputMismatchException ime) {
			System.out.println(">>error en la introduccion de datos");
		}finally {
			sc.close();
		}

	}

}
