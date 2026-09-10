package udemy.allorden.patrones.decorator;

import udemy.allorden.patrones.decorator.decorador.MayusculaDecorador;
import udemy.allorden.patrones.decorator.decorador.ReemplazarEspaciosDecorador;
import udemy.allorden.patrones.decorator.decorador.ReversaDecorador;
import udemy.allorden.patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {

	public static void main(String[] args) {
		
		Formateable texto = new Texto("Hola que tal Andrés!");
		
		MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
		ReversaDecorador reversa = new ReversaDecorador(mayuscula);
		SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
		ReemplazarEspaciosDecorador reemplazar = new ReemplazarEspaciosDecorador(subrayar);
		
		System.out.println(reemplazar.darFormato());
	}
}
