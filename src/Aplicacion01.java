
public class Aplicacion01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Postulante p =  
				new Postulante("Mauricio", 
						"12345678", "Jr. Ucayali",
						14, 14);
		
		System.out.println("Estado = " 
				+ p.resultadoEvaluacion());

		//System.out.println(p.direccion);
		
	}

}
