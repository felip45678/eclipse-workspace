package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mayordeedad {
	/**
	 * determina si la persona es mayor de edad o no
	 * @param a
	 * @param m
	 * @param d
	 * @returntrue si la persona es mayor de edad
	 */
	public static boolean mayorEdad(int a,int m,int d) {
		//creamos la fecha actual
		Date hoy=new Date();
		SimpleDateFormat formato;
		formato=new SimpleDateFormat("yyyy");
		int AÑO=Integer.parseInt(formato.format(hoy));
		int MES=Integer.parseInt(new SimpleDateFormat("MM").format(hoy));
		int DIA=Integer.parseInt(new SimpleDateFormat("dd").format(hoy));
		int edad=AÑO-a;
		if(MES<m) {
			edad--;
		}else if(MES==m) {
			if(DIA<d) {
				edad--;
			}
		}
		if(edad<18)
			return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Introduce tu fecha de nacimiento: ");
			System.out.print("Dia: ");
			int Day=sc.nextInt();
			System.out.print("mes: ");
			int month=sc.nextInt();
			System.out.print("año: ");
			int year=sc.nextInt();
			if(mayorEdad(year,month,Day)==true)
				System.out.println("si eres mayor de 18 años");
			else
				System.out.println("no eres mayor de 18 años");
		}catch(InputMismatchException ime) {
			System.out.println("error");
		}finally {
			sc.close();
		}
		

	}

}
