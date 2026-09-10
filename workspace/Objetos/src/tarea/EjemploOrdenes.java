package tarea;

import java.util.Date;

public class EjemploOrdenes {

	public static void main(String[] args) {
		
		OrdenCompra orden1 = new OrdenCompra("Alimentación");
        orden1.setCliente(new Cliente("Felipe", "Contreras"));
        orden1.setFecha(new Date());

        orden1.addProducto(new Producto("Joselito", "Jamón", 60));
        orden1.addProducto(new Producto("Milka", "Chocolate", 1));
        orden1.addProducto(new Producto("Plátano de canarias", "Plátano", 1));
        orden1.addProducto(new Producto("Oscar Mayer", "Bacon", 2));

        OrdenCompra orden2 = new OrdenCompra("PC Componentes");
        orden2.setCliente(new Cliente("Aaron", "Martínez"));
        orden2.setFecha(new Date());
        orden2.addProducto(new Producto("Nvidia", "G´rafica RTX-4090", 900));
        orden2.addProducto(new Producto("Samsung", "Monitor 2k", 350));
        orden2.addProducto(new Producto("Logitech", "Teclado óptico", 80));
        orden2.addProducto(new Producto("Corsair", "RAM DDR5 32GB", 90));

        OrdenCompra orden3 = new OrdenCompra("Ropa");
        orden3.setCliente(new Cliente("Axel", "Pérez"));
        orden3.setFecha(new Date());
        orden3.addProducto(new Producto("Nike", "Zapatillas Jordan 1", 180));
        orden3.addProducto(new Producto("Adidas", "Chándal", 40));
        orden3.addProducto(new Producto("Puma", "Riñonera", 20));
        orden3.addProducto(new Producto("Converse", "Zapatillas All Star", 50));
        
        OrdenCompra[] ordenes = {orden1, orden2, orden3};

        for (OrdenCompra orden : ordenes) {
            System.out.println("Orden: " + orden.getIdentificador());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripcion: " + orden.getDescripcion());
            System.out.println("Fecha: " + orden.getFecha());
            System.out.println("Total: " + orden.getGranTotal());

            for(Producto p : orden.getProductos())
            	System.out.println(p.toString());
            
            System.out.println();
        }
		

	}

}
