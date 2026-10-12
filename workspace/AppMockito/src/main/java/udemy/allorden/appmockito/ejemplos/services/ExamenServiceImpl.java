package udemy.allorden.appmockito.ejemplos.services;

import java.util.Optional;

import udemy.allorden.appmockito.ejemplos.models.Examen;
import udemy.allorden.appmockito.ejemplos.repositories.ExamenRepository;

public class ExamenServiceImpl implements ExamenService {
	private ExamenRepository examenRepository;
	
	public ExamenServiceImpl(ExamenRepository examenRepository) {
		super();
		this.examenRepository = examenRepository;
	}

	@Override
	public Examen findExamenPorNombre(String nombre) {
		Optional<Examen> examenOptional = examenRepository.findAll()
				.stream()
				.filter(e -> e.getNombre().contains(nombre))
				.findFirst();
		
		Examen examen = null;
		
		if (examenOptional.isPresent())
			examen = examenOptional.orElseThrow();
		
		return examen;
	}

}
