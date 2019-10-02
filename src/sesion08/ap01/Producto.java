package sesion08.ap01;

public class Producto {
	
	private String cod;
	private String nombre;
	private float precio;

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Producto(String cod, String nombre, float precio) {
		super();
		this.cod = cod;
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [cod=" + cod + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

}
