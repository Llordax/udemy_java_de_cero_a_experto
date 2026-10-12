package udemy.allorden.appmockito.ejemplos.repositories;

import java.util.List;

import udemy.allorden.appmockito.ejemplos.models.Examen;

public interface ExamenRepository {
	Examen guardar(Examen examen);
	List<Examen> findAll();
}
