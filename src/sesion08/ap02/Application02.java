package sesion08.ap02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * 
 * @author mactecsup
 *
 */
public class Application02 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
	
		
		crearArchivo();
		leerArchivo();
		
		
		
	}

	private static void crearArchivo() throws FileNotFoundException, IOException {
		OutputStream filename = 
				new FileOutputStream("account.properties");
				
		Properties prop = new Properties();
		
		prop.setProperty("username", "jgomez");
		prop.setProperty("password", "123456");
		prop.setProperty("name", "Jaime");
		
		prop.store(filename, "");
	}
	
	
	
	private static void leerArchivo() throws FileNotFoundException, IOException {
		InputStream filename = 
				new FileInputStream("account.properties");
				
		Properties prop = new Properties();
		
        prop.load(filename);

        // get the property value and print it out
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("password"));
        System.out.println(prop.getProperty("name"));

	}
	
}
