package ejemplos.equipos;

public class EquipoTest {

	public static void main(String[] args) {
		// creamos un objeto equipo
		Equipo e1=new Equipo(1,"UCAM Murcia","Murcia","Palacio de los deportes");
		Equipo e2=new Equipo(2,"Real Madrid","Madrid","Movistar Arena");
		Equipo e3=new Equipo(3,"Valencia Basket","Valencia","Roig Arena");
		Equipo e4=new Equipo(4,"FC Barcelona","Barcelona","Palau Blaugrana");
		//mostramos la informacion de cada equipo
		e1.mostrarEquipo();
		e2.mostrarEquipo();
		e3.mostrarEquipo();
		e4.mostrarEquipo();
		
		//Cambiamos el valor de algunos atributos
		e1.setCiudad("Alguazas");
		System.out.println("Equipo "+e1.getCodigo()+"- Ciudad: "+e1.getCiudad());
		e4.setPabellon("pabellon de Alguazas");
		System.out.println("Equipo "+e4.getCodigo()+"- Ciudad: "+e4.getCiudad());
		e2.setNombre("Real Alguazas");
		System.out.println("Equipo "+e2.getCodigo()+"- Ciudad: "+e2.getCiudad());
	}

}
