package udemy.allorden.webapp.tarea1.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/resultado.html")
public class IndexServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		String nombre = req.getParameter("nombre");
		String apellido = req.getParameter("apellido");
		
		LocalDate fechaActual = LocalDate.now();
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd 'de' MMMM, yyyy", Locale.of("es", "ES"));
		String fechaFormateada = fechaActual.format(formatoFecha);
		
		out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("    <meta charset=\"UTF-8\">");
        out.println("    <title>Tarea 1: Servlet y envío de parámetros</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("    <h1>Tarea 1: Servlet y envío de parámetros</h1>");
        
        if (nombre != null && !nombre.isBlank() && apellido != null && !apellido.isBlank()) 
        	out.println("	<h2>Hola mi nombre es: " + nombre + " " + apellido + "</h2>");
        else
        	out.println("    <h2>Error: no se han enviado los parámetros 'nombre' y 'apellido'</h2>");
	
        out.println("    <h2>La fecha actual es : " + fechaFormateada + "</h2>");
        out.println("</body>");
        out.println("</html>");
        out.close();
	}
}
