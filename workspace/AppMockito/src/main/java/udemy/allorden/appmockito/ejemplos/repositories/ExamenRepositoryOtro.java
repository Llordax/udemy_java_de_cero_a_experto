package udemy.allorden.appmockito.ejemplos.repositories;

import java.util.List;
import java.util.concurrent.TimeUnit;

import udemy.allorden.appmockito.ejemplos.models.Examen;

public class ExamenRepositoryOtro implements ExamenRepository {

	@Override
	public List<Examen> findAll() {
		try {
			System.out.println("ExamenRepositoryOtro");
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Examen guardar(Examen examen) {
		return null;
	}

}
