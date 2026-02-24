package ejemplos.fraccion;

public class Fracciones {
	private int numerador;
	private int denominador;
	
	/**
	 * constructor
	 */
	public Fracciones() {
		numerador=0;
		denominador=1;
	}
	
	/**
	 * constructor
	 * @param numerador
	 */
	public Fracciones(int numerador) {
		this.numerador=numerador;
		this.denominador=1;

	}
	/**constructor
	 * @param numerador
	 * @param denominador
	 */
	public Fracciones(int numerador, int denominador) {
		this.numerador = numerador;
		if(denominador==0)
			this.denominador = 1;
		else
			this.denominador =denominador;
	}

	/**
	 * @return the numerador
	 */
	public int getNumerador() {
		return numerador;
	}

	/**
	 * @return the denominador
	 */
	public int getDenominador() {
		return denominador;
	}

	/**
	 * @param numerador the numerador to set
	 */
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	/**
	 * @param denominador the denominador to set
	 */
	public void setDenominador(int denominador) {
		if(denominador==0)
			this.denominador = 1;
		else
			this.denominador = denominador;
	}
	/**
	 * sumar dos fracciones 
	 * @param f fraccion 
	 * @return resultado de la suma 
	 */
	public Fracciones sumar(Fracciones f) {
		Fracciones aux=new Fracciones();
		aux.numerador=this.numerador*f.denominador+this.denominador*f.numerador;
		aux.denominador=this.denominador*f.denominador;
		return aux;
	}
	/**
	 * restar dos fracciones 
	 * @param f fraccion 
	 * @return resultado de la resta
	 */
	public Fracciones restar(Fracciones f) {
		Fracciones aux=new Fracciones();
		aux.numerador=this.numerador*f.denominador-this.denominador*f.numerador;
		aux.denominador=this.denominador*f.denominador;
		return aux;
	}
	/**
	 * multiplicar dos fracciones
	 * @param f
	 * @return
	 */
	public Fracciones multiplicar(Fracciones f) {
		return (new Fracciones(this.numerador*f.numerador,this.denominador*f.denominador));
	}
	/**
	 * divi8dir dos fracciones
	 * @param f
	 * @return
	 */
	public Fracciones dividir(Fracciones f) {
		return (new Fracciones(this.numerador*f.denominador,this.denominador*f.numerador));
	}
	/**
	 * obtiene el maximo divisor del numerador y del denominador 
	 * para ello utilizaremos el algoritmo de euclices 
	 * @return maximo comun divisor(numero entero)
	 */
	private int  mcd() {
		int u=Math.abs(numerador);
		int v=Math.abs(denominador);
		if(v==0)
			return u;
		int r;
		while(v!=0) {
			r=u%v;
			u=v;
			v=r;
		}
		return u;
	}
	/**
	 * simplifica la fraccion haciendo uso delk maximo comun divisor 
	 */
	public void simplificar() {
		int n=mcd();//calccuylamos el maximo comun divisor de la fraccion 
		numerador=numerador/n;
		denominador=denominador/n;
	}
	/**
	 * devuelve la cadena de caractyeres que representa la fraccion
	 */
	@Override
	public String toString() {
		if(denominador==1)
			return numerador+"";
		return numerador+"/"+denominador;
	}
	public boolean equivalente(Fracciones f) {
		if(this.numerador*f.denominador==f.numerador*this.denominador)
			return true;
			return false;
	}
	
	
}
