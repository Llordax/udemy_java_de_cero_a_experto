package udemy.allorden.appmockito.tests;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

import udemy.allorden.appmockito.ejemplos.models.Examen;
import udemy.allorden.appmockito.ejemplos.repositories.ExamenRepository;
import udemy.allorden.appmockito.ejemplos.repositories.PreguntaRepository;
import udemy.allorden.appmockito.ejemplos.services.ExamenServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ExamenServiceImplTest {
	@Mock
	private ExamenRepository repository;
	@Mock
	private PreguntaRepository preguntaRepository;
	@InjectMocks
	private ExamenServiceImpl service;
	
	/**
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		
		repository = Mockito.mock(ExamenRepositoryOtro.class);
		preguntaRepository = Mockito.mock(PreguntaRepository.class);
		service = new ExamenServiceImpl(repository, preguntaRepository);
		
	}
	*/
	
	@Test
	void findExamenPorNombre() {
		Mockito.when(repository.findAll()).thenReturn(Datos.EXAMENES);
		Optional<Examen> examen = service.findExamenPorNombre("Matemáticas");
		
		Assertions.assertTrue(examen.isPresent());
		Assertions.assertEquals(5L, examen.orElseThrow().getId());
		Assertions.assertEquals("Matemáticas", examen.get().getNombre());
	}
	
	@Test
	void findExamenPorNombreListaVacia() {
		List<Examen> datos = Collections.emptyList();
		
		Mockito.when(repository.findAll()).thenReturn(datos);
		Optional<Examen> examen = service.findExamenPorNombre("Matemáticas");
		
		Assertions.assertFalse(examen.isPresent());
	}
	
	@Test
	void testPreguntaExamen() {
		Mockito.when(repository.findAll()).thenReturn(Datos.EXAMENES);
		Mockito.when(preguntaRepository.findPreguntasPorExamenId(Mockito.anyLong())).thenReturn(Datos.PREGUNTAS);
		
		Examen examen = service.findExamenPorNombreConPreguntas("Historia");
		
		Assertions.assertEquals(5, examen.getPreguntas().size());
		Assertions.assertTrue(examen.getPreguntas().contains("aritmética"));
	}
	
	@Test
	void testPreguntaExamenVerify() {
		Mockito.when(repository.findAll()).thenReturn(Datos.EXAMENES);
		Mockito.when(preguntaRepository.findPreguntasPorExamenId(Mockito.anyLong())).thenReturn(Datos.PREGUNTAS);
		
		Examen examen = service.findExamenPorNombreConPreguntas("Matemáticas");
		
		Assertions.assertEquals(5, examen.getPreguntas().size());
		Assertions.assertTrue(examen.getPreguntas().contains("aritmética"));
		
		Mockito.verify(repository).findAll();
		Mockito.verify(preguntaRepository).findPreguntasPorExamenId(5L);
	}
	
	@Test
	void testNoExisteExamenVerify() {
		// GIVEN
		Mockito.when(repository.findAll()).thenReturn(Collections.emptyList());
		Mockito.when(preguntaRepository.findPreguntasPorExamenId(Mockito.anyLong())).thenReturn(Datos.PREGUNTAS);
		
		// WHEN
		Examen examen = service.findExamenPorNombreConPreguntas("Matemáticas");
		
		// THEN
		Assertions.assertNull(examen);
		
		Mockito.verify(repository).findAll();
		Mockito.verify(preguntaRepository).findPreguntasPorExamenId(5L);
	}
	
	@Test
	void testGuardarExamen() {
		// GIVEN
		Examen newExamen = Datos.EXAMEN;
		newExamen.setPreguntas(Datos.PREGUNTAS);
		
		Mockito.when(repository.guardar(Mockito.any(Examen.class))).then(new Answer<Examen>() {
			Long secuencia = 8L;
			
			@Override
			public Examen answer(InvocationOnMock invocation) throws Throwable {
				Examen examen = invocation.getArgument(0);
				examen.setId(secuencia++);
				return examen;
			}
		});
		
		// WHEN
		Examen examen = service.guardar(newExamen);
		
		// THEN
		Assertions.assertNotNull(examen.getId());
		Assertions.assertEquals(8L, examen.getId());
		Assertions.assertEquals("Física", examen.getNombre());
		
		Mockito.verify(repository).guardar(Mockito.any(Examen.class));
		Mockito.verify(preguntaRepository).guardarVarias(Mockito.anyList());
	}
}
