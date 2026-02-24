package ejemplos.equipos;

public class JugadorTest {

	public static void main(String[] args) {
		//crear objetos jugador
		Jugador jug1=new Jugador(1,"Pau Gasol",2.16,300000);
		Jugador jug2=new Jugador(2,"Marc Gasol",2.12,250000);
		Jugador jug3=new Jugador(3,"jaycee carroll",1.88,120000);
		Jugador jug4=new Jugador(4,"lebron james",2.06,500000);
		
		//mostramos
		jug1.mostrarJugador();
		jug2.mostrarJugador();
		jug3.mostrarJugador();
		jug4.mostrarJugador();
		
		//subimos 10000 euros el salario de paugasol
		int sueldoPauGasol=jug1.getSueldo();
		jug1.setSueldo(sueldoPauGasol+10000);
		jug1.mostrarJugador();
		
		//bajar 15000 euros el salario del jugador 4
		jug4.setSueldo(jug4.getSueldo()-15000);
		jug4.mostrarJugador();
		
		//ponemos la misma altura para el jugador 1 y el jugador 2 (la mas alta)
		double alturaJ1=jug1.getAltura();
		double alturaJ2=jug2.getAltura();
		
		if(alturaJ1 >alturaJ2) {
			jug2.setAltura(alturaJ1);
		}else {
			jug1.setAltura(alturaJ2);
		}
		jug1.mostrarJugador();
		jug2.mostrarJugador();
		
		//el jugador 3 cobrara el doble que el jugador 2
		jug3.setSueldo(jug2.getSueldo()*2);
		jug3.mostrarJugador();
	}

}
