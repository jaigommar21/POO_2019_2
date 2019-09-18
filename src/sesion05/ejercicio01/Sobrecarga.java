package sesion05.ejercicio01;

/**
 * 
 * @author mactecsup
 *
 */
public class Sobrecarga {

	/**
	 * 
	 */
	void metodo() {
		System.out.println("Sin Parametros");
	}

	/**
	 * 
	 * @param a
	 */
	void metodo(int a) {
		System.out.println("a = " + a);
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 */
	void metodo(int a, int b) {
		System.out.println("a =" + a + ", b = " + b);
	}	
	
	/**
	 * 
	 * @param a
	 * @return
	 */
	double metodo(double a) {
		System.out.println("a double " + a);
		return a*a;
	}
	
}
