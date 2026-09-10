package udemy.tarea;

import udemy.tarea.interfaces.*;
import udemy.tarea.clasesabstractas.*;
import udemy.tarea.domain.Comics;
import udemy.tarea.domain.IPhone;
import udemy.tarea.domain.Libro;
import udemy.tarea.domain.TvLcd;

public class ProyectoCatalogo {

	public static void main(String[] args) {
		
		IProducto[] productos = new Producto[4];
		
		productos[0] = new Comics("Stan Lee", "Spiderman", "Marvel", 20, "Miles Morales");
		productos[1] = new IPhone(20, "Negro", "13", "Apple");
		productos[2] = new Libro("Miguel de Cervantes", "El Quijote", "Salamandra", 30);
		productos[3] = new TvLcd(500, "Lenovo", 27);
		
		for(IProducto p : productos) {
			 System.out.print("Tipo de: " + p.getClass().getName());
	         System.out.print(" - ");
	         System.out.print("Precio: " + p.getPrecio());
	         System.out.print(" - ");
	         System.out.print("Precio final: " + p.getPrecioVenta());
	         
	         if(p instanceof IElectronico) {
	        	 System.out.print(" - ");
	             System.out.print("Fabricante: " + ((IElectronico) p).getFabricante());
	             
	             if(p instanceof TvLcd) {
		        	 System.out.print(" - ");
	                 System.out.print("Pulgadas: " + ((TvLcd) p).getPulgada());
		         }
	             
	             if(p instanceof IPhone) {
	            	 System.out.print(" - ");
	                 System.out.print("Modelo: " + ((IPhone) p).getModelo());
	                 System.out.print(" - ");
	                 System.out.print("Color: " + ((IPhone) p).getColor());
	             }
	         }
	         
	         if(p instanceof ILibro) {
	        	 System.out.print(" - ");
	             System.out.print("Titulo: " + ((ILibro) p).getTitulo());
	             System.out.print(" - ");
	             System.out.print("Autor: " + ((ILibro) p).getAutor());
	             
	             if(p instanceof Comics) {
	            	 System.out.print(" - ");
	                    System.out.print("Personaje: " + ((Comics) p).getPersonaje());
	             }
	         }
	         
	         System.out.println();
	         
		}
			
	}

}
