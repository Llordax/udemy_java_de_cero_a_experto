package udemy.allorden.appmockito.ejemplos.repositories;

import java.util.List;

import udemy.allorden.appmockito.ejemplos.models.Examen;

public interface ExamenRepository {
	
	List<Examen> findAll();
}
