package sesion03;

public class Asistente {

	private int codigo;
	private String nombre;
	private int dni;
	private double sueldo;
	
	static private int contadorObj;
	static private double sueldos;
	
	public Asistente(int codigo, String nombre, int dni, double sueldo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.dni = dni;
		this.sueldo = sueldo;
	}
	
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public int getDni() {
		return dni;
	}
	public double getSueldo() {
		return sueldo;
	}
	public static int getContadorObj() {
		return contadorObj;
	}
	public static void setContadorObj(int contadorObj) {
		Asistente.contadorObj = contadorObj;
	}
	public static double getSueldos() {
		return sueldos;
	}
	public static void setSueldos(double sueldos) {
		Asistente.sueldos = sueldos;
	}
			
}
