package sesion03;

public class Profesor {

	private int codigo;
	private String nombre;
	private int horasTrabajadas;
	private double tarifaPorHora;
	static private int contadorObj;
	static private int sumaSueldos;

	static {
		contadorObj = 0;
		sumaSueldos = 0;
	}

	/**
	 * 
	 * @param codigo
	 * @param nombre
	 * @param horasTrabajadas
	 * @param tarifaPorHora
	 */
	public Profesor(int codigo, String nombre, int horasTrabajadas, double tarifaPorHora) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaPorHora = tarifaPorHora;

		contadorObj++;

		sumaSueldos += obtenerSueldo();

	}

	/**
	 * Obtener Sueldo
	 * 
	 * @return
	 */
	public double obtenerSueldo() {

		return this.horasTrabajadas * this.horasTrabajadas;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public double getTarifaPorHora() {
		return tarifaPorHora;
	}

	public static int getContadorObj() {
		return contadorObj;
	}

	public static void setContadorObj(int contadorObj) {
		Profesor.contadorObj = contadorObj;
	}

	public static int getSumaSueldos() {
		return sumaSueldos;
	}

	public static void setSumaSueldos(int sumaSueldos) {
		Profesor.sumaSueldos = sumaSueldos;
	}

	@Override
	public String toString() {
		return "Profesor [codigo=" + codigo + ", nombre=" + nombre + ", horasTrabajadas=" + horasTrabajadas
				+ ", tarifaPorHora=" + tarifaPorHora + "]";
	}

}
