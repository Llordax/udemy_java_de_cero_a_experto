package udemy.allorden.genericosclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T> {
	
	private List<T> objetos = new ArrayList<>();
	private int max;
	
	public Camion(int max) {
		this.max = max;
	}
	
	public void add(T objeto) {
		if(objetos.size() <= max)
			objetos.add(objeto);
		
		else
			throw new RuntimeException("no hay más espacio.");
		
	}

	@Override
	public Iterator<T> iterator() {
		return objetos.iterator();
	}

}
