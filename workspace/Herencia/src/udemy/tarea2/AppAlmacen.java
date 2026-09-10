package udemy.tarea2;

import java.util.Scanner;

import udemy.tarea2.domain.*;

public class AppAlmacen {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca dos productos de cada tipo (fruta, lácteo, limpieza y no perecedero");
		
		Producto[] productos = new Producto[8];
		
		productos[0] = new Fruta("Plátano", 2, 200, "Amarillo");
		productos[1] = new Fruta("Manzana", 1, 220, "Rojo");
		productos[2] = new Lacteo("Queso", 7, 750, 30);
		productos[3] = new Lacteo("Leche", 1.5, 2000, 40);
		productos[4] = new Limpieza("Lejía", 3.45, "hipoclorito de sodio", 1);
		productos[5] = new Limpieza("Detergente", 2.75, "Ácido nítrico", 2);
		productos[6] = new NoPerecedero("Atún en conserva", 0.7, 10, 150);
		productos[7] = new NoPerecedero("Lata de judías", 1.2, 100, 400);
			
		for(Producto producto : productos) {
			System.out.println("Producto: " + producto.getNombre()
					+ "\nPrecio: " + producto.getPrecio());
			
			if(producto instanceof Fruta) {
				System.out.println("Peso en gramos: " + ((Fruta)producto).getPeso());
				System.out.println("Color: " + ((Fruta)producto).getColor());
				System.out.println();
				
			}else if(producto instanceof Lacteo) {
				System.out.println("Cantidad en gramos: " + ((Lacteo)producto).getCantidad());
				System.out.println("Proteínas en gramos: " + ((Lacteo)producto).getProteinas());
				System.out.println();
				
			}else if(producto instanceof Limpieza) {
				System.out.println("Componenetes: " + ((Limpieza)producto).getComponentes());
				System.out.println("Capacidad en litros: " + ((Limpieza)producto).getLitros());
				System.out.println();
				
			}else if(producto instanceof NoPerecedero) {
				System.out.println("Calorías: " + ((NoPerecedero)producto).getCalorias());
				System.out.println("Contenido en gramos: " + ((NoPerecedero)producto).getContenido());
				System.out.println();
				
			}
			
		}
		
	}

}
