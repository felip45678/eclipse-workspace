package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
	Date hoy=new Date();	//crea un objeto Date con la fecha de hoy
	System.out.println("fecha sin formato "+hoy);	//muestra la fecha de hoy
	
	//convertimos la fecha a una cadena legible con la clase simple
	SimpleDateFormat formato=new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
	System.out.println("fecha (con formato) "+formato.format(hoy));
	
	//obtenemos parte de la fecha 
	formato=new SimpleDateFormat("yyyy");
	String a=formato.format(hoy);
	System.out.println("año: "+a);
	formato=new SimpleDateFormat("MM");
	String m=formato.format(hoy);
	System.out.println("mes: "+m);
	formato=new SimpleDateFormat("dd");
	System.out.println("dia: "+formato.format(hoy));
	
	formato =new SimpleDateFormat("HH");
	String h=formato.format(hoy);
	System.out.println("horas: "+h);
	formato =new SimpleDateFormat("mm");
	String mm=formato.format(hoy);
	System.out.println("minutos: "+mm);
	formato =new SimpleDateFormat("ss");
	String s=formato.format(hoy);
	System.out.println("segundos: "+s);

	}

}
