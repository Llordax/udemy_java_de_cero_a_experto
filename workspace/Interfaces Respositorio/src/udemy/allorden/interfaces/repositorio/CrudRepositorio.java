package udemy.allorden.interfaces.repositorio;

import java.util.List;

import udemy.allorden.interfaces.repositorio.excepciones.AccesoDatoException;

public interface CrudRepositorio<T> {

	List<T> listar();
	
	T porId(Integer id) throws AccesoDatoException;
	
	void crear(T t) throws AccesoDatoException;
	
	void editar(T t) throws AccesoDatoException;
	
	void eliminar(Integer id) throws AccesoDatoException;
	
}
