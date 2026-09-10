package claseSystem;
import java.util.Properties;

public class EjemploPropiedadesDelSistema {

	public static void main(String[] args) {
		
		String username = System.getProperty("user.name");
		System.out.println("username = " + username);
		
		String home = System.getProperty("user.home");
		System.out.println("user.home = " + home);
		
		String workspace = System.getProperty("user.dir");
		System.out.println("user.dir = " + workspace);
		
		String java = System.getProperty("java.version");
		System.out.println("java = " + java);
		
		String lineSeparator = System.getProperty("line.separator");
		String lineSeparator2 = System.lineSeparator();
		
		System.out.println("lineSeparator = " + lineSeparator + "una línea nueva");
		
		System.out.println();
		
		System.out.println("lineSeparator = " + lineSeparator2 + "una línea nueva");
	
		System.out.println();
		
		Properties p = System.getProperties();
		p.list(System.out);
		
	}

}
