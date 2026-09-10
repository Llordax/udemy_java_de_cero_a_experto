package udemy.allorden.appfacturas.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

	//Propiedades de la clase
	private int idFactura;
	private String descripcion;
	private Date fecha;
	
	//Propiedades de la relación
	private Cliente cliente;
	private ItemFactura[] items;
	private int indiceItems;
	
	private static int siguienteIdFactura;
	public static final int MAX_ITEMS = 12;
	
	public Factura(String descripcion, Cliente cliente) {
		super();
		this.descripcion = descripcion;
		this.cliente = cliente;
		items = new ItemFactura[MAX_ITEMS];
		idFactura = ++siguienteIdFactura;
		fecha = new Date();
	}

	public int getIdFactura() {
		return idFactura;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public ItemFactura[] getItems() {
		return items;
	}
	
	public void addItemFactura(ItemFactura item) {
		if(indiceItems < MAX_ITEMS)
			items[indiceItems++] = item;
	}
	
	public float calcularTotal() {
		float total = 0.0f;
		for(int i = 0; i < indiceItems; i++)
			total += items[i].calcularImporte();
		
		return total;
			
	}
	
	public String generarDetalle() {
		StringBuilder sb = new StringBuilder("Factura Nº: ");
		sb.append(idFactura).append("\nCliente: ")
			.append(cliente.getNombre())
			.append("\tNif: ").append(cliente.getNif())
			.append("\nDescripción: ").append(descripcion)
			.append("\n")
			.append("\n");
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		sb.append("Fecha de emisión: ")
			.append(df.format(fecha))
			.append("\n")
			.append("\n#\tNombre\t$\tCant.\tTotal\n");
		
		for(int i = 0; i < indiceItems; i++) {
			sb.append(items[i])
				.append("\n");
		}
		sb.append("\nGran total: ")
			.append(calcularTotal());
		
		return sb.toString();
		
	}

	@Override
	public String toString() {
		return generarDetalle();
	}
	
}
