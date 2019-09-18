
/**
 * 
 * @author mactecsup
 *
 */
public class Postulante extends Persona {

	private double nota1;
	
	private double nota2;

	public Postulante(String nombre, String dni, 
			String direccion, double nota1, 
			double nota2) {
		//super(nombre, dni, direccion);
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
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
	 *  Metodo que calcula el codigo 
	 *  de un Postulante
	 * 
	 * @return
	 */
	public String codigo() {
		
		// Inicializar datos
		String cod = "-1";
		
		// Procesar datos
		cod =  this.getNombre().substring(0,1) 
				+ this.getDni();
				
		// Visualizar datos
		return cod;
		
	}
	
	/**
	 * 
	 * @return
	 */
	public double obtenerPromedio() {
		
		return -1;
	}
	
	/**
	 *  Devuelve el resultado de evaluacion
	 *  del Postulante
	 * @return
	 */
	public String resultadoEvaluacion() {
		
		// Inicializar datos
		String ret = "-1";
		
		// Procesar datos
		if(this.obtenerPromedio() >= 14)
			ret = "ACEPTADO";
		else
			ret = "RECHAZADO";
		
		// Visualizar datos
		return ret;
	}
	
	
	
	
	
	
	
}
