package sesion03;

public class Aplicacion01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profesor prof01 = new Profesor(001, "Jaime", 12, 45);
		Profesor prof02 = new Profesor(002, "Eduardo", 10, 45);
		Profesor prof03 = new Profesor(003, "Jose", 12, 45);
		
		listado(prof01);
		
		System.out.println(Profesor.getContadorObj());
		System.out.println(Profesor.getSumaSueldos());
		
		
	}

	/**
	 * 
	 */
	private static void listado(Profesor p) {		
		System.out.println(p.toString());
	}

}
