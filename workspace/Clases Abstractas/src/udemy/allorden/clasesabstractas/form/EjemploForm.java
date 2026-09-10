package udemy.allorden.clasesabstractas.form;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import udemy.allorden.clasesabstractas.form.validador.*;
import udemy.allorden.clasesabstractas.formelementos.*;
import udemy.allorden.clasesabstractas.formelementos.select.Opcion;

public class EjemploForm {

	public static void main(String[] args) {
		
		InputForm username = new InputForm("username");
		username.addValidador(new RequeridoValidador());
		
		InputForm password = new InputForm("clave", "password");
		password.addValidador(new RequeridoValidador());
		password.addValidador(new LargoValidador());
		
		InputForm email = new InputForm("email", "email");
		email.addValidador(new RequeridoValidador())
			.addValidador(new LargoValidador());
		
		InputForm edad = new InputForm("edad", "number");
		edad.addValidador(new NumeroValidador());
		
		TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);
		
		SelectForm lenguaje = new SelectForm("lenguaje");
		lenguaje.addValidador(new NoNulo());
		
		lenguaje.addOpcion(new Opcion("1", "Java"))
		.addOpcion(new Opcion("2", "Phyton").setSelected())
		.addOpcion(new Opcion("3", "JavaScript"))
		.addOpcion(new Opcion("4", "TypeScript"))
		.addOpcion(new Opcion("5", "PHP"));
		
		ElementoForm saludar = new ElementoForm("saludo") {

			@Override
			public String dibujarHtml() {
				return "<input disabled name='" + this.nombre + "' value=\"" + this.valor + "\">";
			}
		};
		
		saludar.setValor("Hola qué tal este campo está deshabilitado");
		
		username.setValor("john.doe");
		password.setValor("a1b2c3");
		email.setValor("alopez20@correo.com");
		edad.setValor("28");
		experiencia.setValor("... más de 18 años de experiencia");
		//java.setSelected(true);
		
		//PRIMERA MANERA
		
		/*
		List<ElementoForm> elementos = new ArrayList<>();
		elementos.add(username);
		elementos.add(password);
		elementos.add(email);
		elementos.add(edad);
		elementos.add(experiencia);
		elementos.add(lenguaje);
		*/
		
		//SEGUNDA MANERA
		
		/*
		 * Método asList de la clase Arrays para añadir los elemenetos 
		 * en una lista.
		 */
		
		List<ElementoForm> elementos = Arrays.asList(username, password, 
				email, edad, experiencia, lenguaje, saludar);
		
		//PRIMERA FORMA DE ITERAR
		/*
		for(ElementoForm e : elementos) {
			System.out.println(e.dibujarHtml());
			System.out.println("<br>");
		}
		*/
		
		//SEGUNDA FORMA DE ITERAR
		/*
		 * Con una función de flecha o expresión lambda
		 * en el cual mencionamos la variable List elementos
		 * para invocar al metodo foreach() y dentro la expresion
		 * lambda para que itere por cada elemento añadido previamente
		 * a la lista al cual le llamamos e por ejemplo.
		 * 
		 * Esto es lo que se conoce como un Stream, que está dentro
		 * de las librerías de colección de java, concretamente en
		 * la interfaz List.
		 */
		
		elementos.forEach(e -> {
			System.out.println(e.dibujarHtml());
			System.out.println("<br>");
		});
		
		elementos.forEach(e -> {
			if(!e.esValido()) 
				e.getErrores().forEach(System.out::println);	
		});
		
	}

}
