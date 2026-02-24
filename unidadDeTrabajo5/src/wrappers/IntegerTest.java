package wrappers;

public class IntegerTest {

	public static void main(String[] args) {
		// envolver un int a integer (autoboxing)
		int num=5;
		Integer numwrapper=num;
		System.out.println("valor integer: "+numwrapper);
		//convertir un integer a int(unboxing)
		int numDesenvuelto=numwrapper;
		System.out.println("valor (int): "+numDesenvuelto);
		//conversion de String a integer con parseint
		String textoNum="123";
		Integer numconvertido=Integer.parseInt(textoNum);
		System.out.println("conversion de String a Integer: "+numconvertido);
		//crear un integer a partir de un String con valueof
		Integer numvalueof=Integer.valueOf("2025");
		System.out.println("creado con valueof desde un string: "+numvalueof);
		//conversion de integer a string
		String textonum2=numwrapper.toString();
		System.out.println("conversion de integer a string: "+textonum2);
		
		//convertir un int a binario,octal y hexadecimal
		int numerobase=42;
		String binario=Integer.toBinaryString(numerobase);
		String octal=Integer.toOctalString(numerobase);
		String hexadecimal=Integer.toHexString(numerobase);
		System.out.println("Representacion de "+numerobase+" en binario: "+binario);
		System.out.println("Representacion de "+numerobase+" en octal: "+octal);
		System.out.println("Representacion de "+numerobase+" en hexadecimal: "+hexadecimal);

	
	}

}
