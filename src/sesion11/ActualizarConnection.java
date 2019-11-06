package sesion11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ActualizarConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.13.250:1521:XE";
			String usuario = "hr"; //"system"; //"hr";
			String clave = "hr"; //"oracle"; //"hr";
			PreparedStatement ptmt ;
			ResultSet rs;

			
			Connection con =  DriverManager.getConnection(url, usuario, clave);
			
			String query = " UPDATE EMPLOYEES SET FIRST_NAME=? "
					+ " WHERE EMPLOYEE_ID=?  ";
			ptmt = con.prepareStatement(query);
			ptmt.setString(1,"Jaime"); // Steven
			ptmt.setString(2,"100"); 
			int status = ptmt.executeUpdate();
			// Aquí va el código que interactúa con el ResultSet

			System.out.println("status : " + status);
			ptmt.close();
			
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
