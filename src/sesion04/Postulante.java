package sesion04;

/**
 * 
 * @author mactecsup
 *
 */
public class Postulante extends Persona {

	private double nota1;

	private double nota2;

	
	public Postulante(String nombre, String dni, String direccion, double nota1, double nota2) {
		super(nombre, dni, direccion);
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	
	/**
	 * Calcula el codigo del alumno
	 * 
	 * @return
	 */
	public String codigo() {
		
		String c = this.getNombre().substring(0, 1) + this.getDni();
		
		return c;
		
	}
	
	/**
	 *  Calcula el promedio del postulante
	 * @return
	 */
	public double obtenerPromedio() {
		
		double p =  (this.nota1 + 2*this.nota2)/3 ;
				
		return p;		
	}
	
	/**
	 *  Evalua situacion final del Postulante
	 * @return
	 */
	public String resultadoEvaluacion() {
	
		String ret = null;
		
		if( this.obtenerPromedio() > 14)		
			ret = "ACEPTADO";
		else
			ret = "RECHAZADO";

		return ret;
	}
	
	
}