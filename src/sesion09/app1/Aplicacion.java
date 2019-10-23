package sesion09.app1;

import java.math.BigDecimal;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura fig = new Triangulo(1.5f,1.5f);
		
		System.out.println(fig.area());
		

		
		
	}
	
	/*
	   public static void main(String[] args) {
	        double total = 0.2;
	        for (int i = 0; i < 100; i++)
	            total += 0.2;
	        System.out.println("total = " + total);
	        
	        
	        
			BigDecimal bd = new BigDecimal(Double.toString(0.2));
			for(int i=0 ; i< 100;   i++) 
				bd = bd.add(new BigDecimal(Double.toString(0.2)));			
	        System.out.println("total = " + bd);

	   }
	*/
}
