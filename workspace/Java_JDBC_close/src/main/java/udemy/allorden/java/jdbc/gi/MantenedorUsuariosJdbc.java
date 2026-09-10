package udemy.allorden.java.jdbc.gi;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import udemy.allorden.java.jdbc.modelo.Usuario;
import udemy.allorden.java.jdbc.repositorio.Repositorio;
import udemy.allorden.java.jdbc.repositorio.UsuarioRepositorioImpl;
import udemy.allorden.java.jdbc.util.ConexionBD;

public class MantenedorUsuariosJdbc {
	
	public static void main(String[] args) {
		
		try (Connection connection = ConexionBD.getInstance()) {
			Repositorio<Usuario> repositorio = new UsuarioRepositorioImpl();
			int opcionIndice = 0;
			
			do {
				Map<String, Integer> crud = new HashMap<>();
				crud.put("Actualizar", 1);
				crud.put("Eliminar", 2);
				crud.put("Anadir", 3);
				crud.put("Listar", 4);
				crud.put("Salir", 5);
				
				Object[] opcionArray = crud.keySet().toArray();
				Object opcion = JOptionPane.showInputDialog(null, "Seleccione", "Mantenedor de Usuario"
						, JOptionPane.INFORMATION_MESSAGE, null, opcionArray, opcionArray[0]);
				
				if (opcion == null) 
					JOptionPane.showMessageDialog(null, "Debe de seleccionar una opción");
				
				else {
					opcionIndice = crud.get(opcion.toString());
					Long id;
					String username;
					String password;
					String email;
					
					switch (opcionIndice) {
						case 1 -> {
							id = Long.valueOf(JOptionPane.showInputDialog(null, "Ingresar el id del usuario para Actualizar:"));
							
							Usuario usuario = repositorio.porId(id);
							if (usuario != null) {
								username = JOptionPane.showInputDialog(null, "Ingresar el username:", usuario.getUsername());
                                password = JOptionPane.showInputDialog(null, "Ingresar el password:", usuario.getPassword());
                                email = JOptionPane.showInputDialog(null, "Ingresar el email:", usuario.getEmail());
							
                                usuario.setUsername(username);
                                usuario.setPassword(password);
                                usuario.setEmail(email);
                                
                                repositorio.guardar(usuario);
                                
                                JOptionPane.showMessageDialog(null, "Usuario actualizado");
							
							} else
								JOptionPane.showMessageDialog(null, "id de usario no disponible en la base de datos");
						}
						
						case 2 -> {
							id = Long.valueOf(JOptionPane.showInputDialog(null, "Ingresar el id del usuario para eliminar:"));
							repositorio.eliminar(id);
                            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
						}
						
						case 3 -> {
							username = JOptionPane.showInputDialog(null, "Ingresar el username para un nuevo usuario:");
                            password = JOptionPane.showInputDialog(null, "Ingresar el password:");
                            email = JOptionPane.showInputDialog(null, "Ingresar el email:");

                            Usuario usuario = new Usuario();
                            usuario.setUsername(username);
                            usuario.setPassword(password);
                            usuario.setEmail(email);
                            
                            repositorio.guardar(usuario);
                            JOptionPane.showMessageDialog(null, "Usuario anadido correctamente");
						}
						
						case 4 -> {
                            repositorio.listar().forEach(System.out::println);
                        }
					}
				}
					
			} while (opcionIndice != 5);
			
			JOptionPane.showMessageDialog(null, "Succesful");
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
