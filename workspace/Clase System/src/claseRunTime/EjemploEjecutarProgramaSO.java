package claseRunTime;

public class EjemploEjecutarProgramaSO {

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		Process proceso;
		
			try {
				if(System.getProperty("os.name").toLowerCase().startsWith("windows")) {
					String[] comandos = {"notepad"};
					proceso = rt.exec(comandos);
				
				}else if(System.getProperty("os.name").toLowerCase().startsWith("mac")) {
					String[] comandos = {"textedit"};
					proceso = rt.exec(comandos);

				}else if(System.getProperty("os.name").toLowerCase().startsWith("nux") ||
						System.getProperty("os.name").toLowerCase().startsWith("nix")) {
					String[] comandos = {"gedit"};
					proceso = rt.exec(comandos);
				
				}else {
					String[] comandos = {"gedit"};
					proceso = rt.exec(comandos);
				}
				proceso.waitFor();
					
			
			} catch (Exception ex) {
				System.err.println("El comando es desconocido: " + ex.getMessage());
				System.exit(1);
			}
			
			System.out.println("Se ha cerrado el editor");
			System.exit(0);
	}

}
