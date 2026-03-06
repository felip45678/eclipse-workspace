package comparacionObjetos.ejercicios;

public class CuentaTest {

	public static void main(String[] args) {
		Cuenta c=new Cuenta("roberto",12000);
		c.ingresar(400);
		System.out.println(c);
		c.retirar(10000);
		System.out.println(c);

	}

}
