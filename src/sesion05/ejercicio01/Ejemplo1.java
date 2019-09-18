package sesion05.ejercicio01;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Sobrecarga obj = new Sobrecarga();
		
		double res;
		
		obj.metodo();
		obj.metodo(10);
		obj.metodo(10,20);
		
		res = obj.metodo(123.25);
		
		System.out.println("Resultado : " + res);
	}

}
