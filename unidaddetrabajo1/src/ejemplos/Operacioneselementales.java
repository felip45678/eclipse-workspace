package ejemplos;

public class Operacioneselementales {

	public static void main(String[] args) {
		//declaracion e inicializacion 
	
		int c=3, d=5;
		
		c+=d;					//c=c+d
		System.out.println(c);  // 8
		
		c-=d*2;					//c=c-(d*2);
		System.out.println(c);  //-2
		
		c*=d+1;					//c=c*(d+1)
		System.out.println(c);  // -12
		
		c/=d*(-1);				//c=c/(-d)
		System.out.println(c);  //2
		
		c%=d-1;					//c=c%(d-1)
		System.out.println(c);	// 2
	}

}
