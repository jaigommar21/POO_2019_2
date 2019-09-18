package sesion05.ejercicio03;


/**
 * 
 * @author mactecsup
 *
 */
public class Ejemplo3C {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(Constante3.A + Constante3.B);

		System.out.println(Constante4.C + Constante4.D);

	}

}


/**
 * 
 * @author mactecsup
 *
 */
interface Constante3 {

	int A=5;
	int B=6;
	
}

/**
 * 
 * @author mactecsup
 *
 */
interface Constante4 {

	int C=7;
	int D=8;
	
}
