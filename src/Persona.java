

/**
 * 
 * @author mactecsup
 *
 */
public class Persona {

	private String nombre;
	private String dni;
	private String direccion;


	public Persona() {
		
	}

	/**
	 * 
	 * @param nombre
	 * @param dni
	 * @param direccion
	 */
	public Persona(String nombre, String dni, 
			String direccion) {
		//super();
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
}
