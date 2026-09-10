package claseSystem;
import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("src/config.properties");
			
			Properties p = new Properties(System.getProperties());
			p.load(fis);
			p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");
			
			System.setProperties(p);
			
			Properties ps = System.getProperties();
			System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
			System.out.println(System.getProperty("config.puerto.servidor"));
			System.out.println(System.getProperty("config.autor.nombre"));
			System.out.println(System.getProperty("config.autor.email"));
			
			ps.list(System.out);
			
		} catch (Exception ex) {
			System.err.println("No existe el archivo = " + ex);
			System.exit(1);//TERMINA EL PROGRAMA
			
		}

	}

}
