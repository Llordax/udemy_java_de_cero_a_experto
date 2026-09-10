package udemy.allorden.tarea;

import udemy.allorden.tarea.domain.*;

public class EjemploSupermercado {

	public static void main(String[] args) {
	
		BolsaSupermercado<Lacteo> bolsaParaLacteos = new BolsaSupermercado<>();
		BolsaSupermercado<Fruta> bolsaParaFrutas = new BolsaSupermercado<>();
		BolsaSupermercado<Limpieza> bolsaParaLimpieza = new BolsaSupermercado<>();
		BolsaSupermercado<NoPerecederos> bolsaParaNoPerecederos = new BolsaSupermercado<>();
		
		//AÑADIMOS LÁCTEOS
		bolsaParaLacteos.addProducto(new Lacteo("Queso de cabra", 5.5, 3, 30));
		bolsaParaLacteos.addProducto(new Lacteo("Leche", 1.95, 2, 25));
		bolsaParaLacteos.addProducto(new Lacteo("Yogurt", 0.55, 3, 35));
		bolsaParaLacteos.addProducto(new Lacteo("Parmesano", 0.3, 5, 22));
		bolsaParaLacteos.addProducto(new Lacteo("Cuajada", 0.4, 5, 35));
		
		
		//AÑADIMOS FRUTA
		bolsaParaFrutas.addProducto(new Fruta("Plátano de Canarias", 2.95, 150, "Amarillo"));
		bolsaParaFrutas.addProducto(new Fruta("Manzana Golden", 1.95, 100, "Amarilla"));
		bolsaParaFrutas.addProducto(new Fruta("Fresas de temporada", 3, 20, "Roja"));
		bolsaParaFrutas.addProducto(new Fruta("Sandía", 4.95, 850, "Roja"));
		bolsaParaFrutas.addProducto(new Fruta("Naranja valenciana", 2.85, 45, "Naranja"));
		
		
		//AÑADIMOS PRODUCTOS DE LIMPIEZA
		bolsaParaLimpieza.addProducto(new Limpieza("Fairy", 3.25, "Jabón", 1.5));
		bolsaParaLimpieza.addProducto(new Limpieza("Lejía", 2.75, "Hipoclorito de sodio", 3));
		bolsaParaLimpieza.addProducto(new Limpieza("Detergente", 3.5, "Benceno sulfonato de sodio", 2));
		bolsaParaLimpieza.addProducto(new Limpieza("Limpia cristales", 1.45, "Jabón", 1.5));
		bolsaParaLimpieza.addProducto(new Limpieza("KH-7", 3, "Ácido cítrico", 1));
		
		
		//AÑADIMOS PRODUCTOS NO PERECEDEROS
		bolsaParaNoPerecederos.addProducto(new NoPerecederos("Lata de sardinas", 0.95, 10, 150));
		bolsaParaNoPerecederos.addProducto(new NoPerecederos("Lata de fabada", 0.85, 70, 400));
		bolsaParaNoPerecederos.addProducto(new NoPerecederos("Lata de lentejas", 0.65, 210, 400));
		bolsaParaNoPerecederos.addProducto(new NoPerecederos("Lata de espárragos", 0.45, 20, 120));
		bolsaParaNoPerecederos.addProducto(new NoPerecederos("Lata de pepinillos", 0.45, 15, 130));
		
		//MOSTRAMOS LOS LÁCTEOS
		System.out.println("**************************************** Lácteos ****************************************");
		for(Lacteo l : bolsaParaLacteos.getProductos())
			System.out.println(l.toString());
		System.out.println();
		
		//MOSTRAMOS LA FRUTA
		System.out.println("**************************************** Fruta ****************************************");
		for(Fruta f : bolsaParaFrutas.getProductos())
			System.out.println(f.toString());
		System.out.println();
				
		//MOSTRAMOS LOS PRODUCTOS DE LIMPIEZA
		System.out.println("**************************************** Limpieza ****************************************");
		for(Limpieza lim : bolsaParaLimpieza.getProductos())
			System.out.println(lim.toString());
		System.out.println();
				
		//MOSTRAMOS LOS PRODUCTOS NO PERECEDEROS
		System.out.println("**************************************** No perecedero ****************************************");
		for(NoPerecederos nP : bolsaParaNoPerecederos.getProductos())
			System.out.println(nP.toString());
				
	}

}
