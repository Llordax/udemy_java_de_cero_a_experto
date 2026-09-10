package udemy.allorden.interfaces.modelo;

import java.util.Objects;

public class BaseEntity {

	protected Integer id;
	private static int siguienteId;
	
	public BaseEntity() {
		id = ++siguienteId;
	}
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseEntity base = (BaseEntity) obj;
		return Objects.equals(id, base.id);
	}
}
