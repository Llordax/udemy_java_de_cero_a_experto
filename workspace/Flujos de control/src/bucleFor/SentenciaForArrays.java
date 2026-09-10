package bucleFor;

import javax.swing.JOptionPane;

public class SentenciaForArrays {

	public static void main(String[] args) {
		
		String[] nombres = 
			{"Andres","Maria", 
			"Marta", "Jorge", 
			"Nacho", "Aaron", 
			"Pablo", "Diego"};
		
		for(int i = 0; i < nombres.length; i++) {
			if(nombres[i].equalsIgnoreCase("andres") || nombres[i].equalsIgnoreCase("Aaron"))
				continue;
			
			System.out.println(i + ".- " + nombres[i]);
		}
		
		String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\":");
		System.out.println("buscar = " + buscar);
		
		boolean encontrado = false;
		
		for(int i = 0; i < nombres.length; i++) {
			if(nombres[i].equalsIgnoreCase(buscar)) {
				encontrado = true;
				break;
			}
		}
		
		if(encontrado) 
			JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
		else
			JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema");
	}

}
