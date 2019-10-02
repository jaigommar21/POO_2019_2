package sesion08.ap01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 
 * @author mactecsup
 *
 */
public class Apllicacion01 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		//

		Map<String, Producto> canastaDeCompras = new HashMap<String, Producto>();

		Producto aceite = new Producto("001", "Aceite", 8.50f);
		Producto arroz = new Producto("002", "Arroz", 3.70f);
		Producto azucar = new Producto("003", "Azucar", 4.19f);

		canastaDeCompras.put(aceite.getCod(), aceite);
		canastaDeCompras.put(arroz.getCod(), arroz);
		canastaDeCompras.put(azucar.getCod(), azucar);

		// System.out.println(canastaDeCompras);

		recorrerMap1(canastaDeCompras);
		recorrerMap2(canastaDeCompras);
		recorrerMap3(canastaDeCompras);
		recorrerMap4(canastaDeCompras);
		recorrerMap5(canastaDeCompras);

	}

	/**
	 * Iterating over Map.entrySet() using For-Each loop
	 * 
	 * @param canasta
	 */
	private static void recorrerMap1(Map<String, Producto> canasta) {
		// TODO Auto-generated method stub

		for (Map.Entry<String, Producto> item : canasta.entrySet()) {
			System.out.println("Key = " + item.getKey());
			System.out.println("Value = " + item.getValue());

		}

	}

	/**
	 * Iterating over keys or values using keySet() and values() methods
	 * 
	 * @param canasta
	 */
	private static void recorrerMap2(Map<String, Producto> canasta) {
		// TODO Auto-generated method stub

		for (String key : canasta.keySet())
			System.out.println("Key = " + key);

		for (Producto value : canasta.values())
			System.out.println("Value = " + value);

	}

	/**
	 * Iterating over keys or values using keySet() and values() methods
	 * 
	 * @param canasta
	 */
	private static void recorrerMap3(Map<String, Producto> canasta) {
		// TODO Auto-generated method stub

		// using iterators
		Iterator<Map.Entry<String, Producto>> ite = canasta.entrySet().iterator();

		while (ite.hasNext()) {
			Map.Entry<String, Producto> item = ite.next();
			System.out.println("Key = " + item.getKey());
			System.out.println("Value = " + item.getValue());

		}

	}

	/**
	 * Using forEach(action) method : jdk >= 8
	 * 
	 * @param canasta
	 */
	private static void recorrerMap4(Map<String, Producto> canasta) {
		// TODO Auto-generated method stub

					
		canasta.forEach((key, value) -> { System.out.println("Key = " + key);
										  System.out.println("Value = " + value);} ) ;
		
		
	}
	
	
	/**
	 * Iterating over keys and searching for values (inefficient)
	 * 
	 * @param canasta
	 */
	private static void recorrerMap5(Map<String, Producto> canasta) {
		// TODO Auto-generated method stub

		for (String key : canasta.keySet()){
		
			System.out.println("Key = " + key);

			System.out.println("Value = " + canasta.get(key));

		}
	}

}
