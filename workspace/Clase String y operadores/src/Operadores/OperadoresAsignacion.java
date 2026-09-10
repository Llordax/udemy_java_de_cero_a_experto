package Operadores;

public class OperadoresAsignacion {

	public static void main(String[] args) {
		
		int i = 5, j = i + 4;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		i += 2; //Es lo mismo que i = i + 2;
		System.out.println("i = " + i);
		
		i += 5; //Es lo mismo que i = i + 5;
		System.out.println("i = " + i);
		
		j -= 4; //Es lo mismo que j = j - 4;
		System.out.println("j = " + j);
		
		j *= 3; //Es lo mismo que j = j * 3;
		System.out.println("j = " + j);
		
		String sqlString = "select * from clientes as c";
		sqlString += " where c.nombre = 'Andres' ";
		sqlString += " and c.activo = 1";
		System.out.println("sqlString = " + sqlString);

	}

}
