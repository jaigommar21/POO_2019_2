package sesion10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConditionalConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.13.250:1521:XE";
			String usuario = "hr"; //
			String clave = "hr"; //
			PreparedStatement ptmt ;
			ResultSet rs;

			
			Connection con =  DriverManager.getConnection(url, usuario, clave);
			
			String query = " SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME FROM EMPLOYEES WHERE EMPLOYEE_ID=?";
			ptmt = con.prepareStatement(query);
			ptmt.setString(1,"100");
			rs = ptmt.executeQuery();
			// Aquí va el código que interactúa con el ResultSet

			int i = 1;			
			while(rs.next()) {
				String id = rs.getString("EMPLOYEE_ID");
				String name = rs.getString("FIRST_NAME");
				String firstname = rs.getString("LAST_NAME");
				System.out.println(id);
				System.out.println(name);
				System.out.println(firstname);
			}

			rs.close();
			
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
