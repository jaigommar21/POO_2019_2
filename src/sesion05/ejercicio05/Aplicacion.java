package sesion05.ejercicio05;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String val=JOptionPane.showInputDialog("Ingrese codigo");
//		
//        int cod=Integer.parseInt(val);

        
		Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un valor: ");
		int cod  = s.nextInt();

        System.out.println(cod);	

        
	}

}
