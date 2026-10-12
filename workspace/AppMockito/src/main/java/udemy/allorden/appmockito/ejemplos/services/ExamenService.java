package udemy.allorden.appmockito.ejemplos.services;

import udemy.allorden.appmockito.ejemplos.models.Examen;

public interface ExamenService {
	
	Examen findExamenPorNombre(String nombre);
	
}
