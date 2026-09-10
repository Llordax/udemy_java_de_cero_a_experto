package udemy.allorden.repositorio;

import java.util.Optional;

import udemy.allorden.optional.ejemplo.models.Computador;

public interface Repositorio <T> {

	Optional<Computador> filtrar(String nombre);
}
