package tarea;

import javax.swing.JOptionPane;
import java.util.Map;
import java.util.HashMap;

public class MenuIterativo {

	public static void main(String[] args) {
		
		int opcionIndice = 0;
        
		do {

            // los Map (o mapas) los veremos mas adelante en el curso en profundidad
            // pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
            // también se les conoce como diccionarios para almacenar datos en base a un nombre.
            Map<String, Integer> opciones = new HashMap<>();
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Operación", "Mantenedor de Usuario", JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) 
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            
            else {
                opcionIndice = opciones.get(opcion.toString());

                String mensaje = null;

                switch (opcionIndice) {
                    case 1 -> {
                        mensaje = "Usuario actualizado correctamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                    }
                    case 2 -> {
                        mensaje = "Usuario eliminado correctamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                    }
                    case 3 -> {
                        mensaje = "Usuario agregado correctamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                    }
                    case 4 -> {
                        mensaje = "Listando a los usuarios";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                    }
                }
            }

        } while (opcionIndice != 5);

        JOptionPane.showMessageDialog(null, "Haz salido con exito!");
		
	}

}
