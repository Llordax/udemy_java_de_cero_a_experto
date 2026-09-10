package tarea;

import javax.swing.JOptionPane;

public class AppNombreMasLargo {

	public static void main(String[] args) {
		
		String persona1 = JOptionPane.showInputDialog("Introduce nombre y apellido 1");
		
		String persona2 = JOptionPane.showInputDialog("Introduce nombre y apellido 2");
		
		String persona3 = JOptionPane.showInputDialog("Introduce nombre y apellido 3");
		
		String maxNombre = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
		maxNombre = (persona3.split(" ")[0].length() < maxNombre.split(" ")[0].length()) ? maxNombre: persona3;
	
		System.out.println("La persona que tiene el nombre más largo es: " + maxNombre);
		
	}

}
