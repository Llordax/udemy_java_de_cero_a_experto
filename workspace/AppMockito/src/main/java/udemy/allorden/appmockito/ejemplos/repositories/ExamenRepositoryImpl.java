package udemy.allorden.appmockito.ejemplos.repositories;

import java.util.Arrays;
import java.util.List;

import udemy.allorden.appmockito.ejemplos.models.Examen;

public class ExamenRepositoryImpl implements ExamenRepository {

	@Override
	public List<Examen> findAll() {
		return Arrays.asList(new Examen(5L, "Matemáticas"),
				new Examen(6L, "Lenguaje"),
				new Examen(7L, "Historia"));
	}

}
