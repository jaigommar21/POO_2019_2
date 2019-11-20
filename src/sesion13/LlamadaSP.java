package sesion13;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class LlamadaSP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/TECSUP?useSSL=false&serverTimezone=UTC";
			String usuario = "root"; //
			String clave = "123456"; //
	
			Connection con =  DriverManager.getConnection(url, usuario, clave);

			String query ="{CALL CONTAR_ALUMNOS (?,?)} ";
			CallableStatement cstatement = con.prepareCall(query);
			cstatement.setInt("V_EDAD", 20);//Tipo entero
			cstatement.registerOutParameter("V_NRO_ALUMNOS",Types.BINARY);
			cstatement.execute();
			int  nroAlumnos =cstatement.getInt(2);
			
			System.out.println(nroAlumnos);
			
			cstatement.close();   
	
			System.out.println("Conextion establecida");
			con.close();			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
