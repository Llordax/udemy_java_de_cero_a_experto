package tarea;

import java.util.Date;

public class OrdenCompra {
	
	private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private static int siguienteId;
    private int indiceProductos;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        id = ++siguienteId;
        productos = new Producto[4];
    }

    public int getIdentificador() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void addProducto(Producto producto) {
        if (indiceProductos < this.productos.length) {
            this.productos[indiceProductos++] = producto;
        }
    }
    
    public int getGranTotal(){
        int totalImporte = 0;
        for(Producto p: productos){
        	totalImporte += p.getPrecio();
        }
        return totalImporte;
    }
	
}
