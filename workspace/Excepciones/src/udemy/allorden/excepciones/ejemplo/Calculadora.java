package udemy.allorden.excepciones.ejemplo;

public class Calculadora {
	
	public double dividir(int dividendo, int divisor) throws DivisionPorZeroException {
		if(divisor == 0)
			throw new DivisionPorZeroException("No se puede dividir por zero");
		
		return dividendo / (double)divisor;
	}
	
	public double dividir(String dividendo, String divisor) 
			throws DivisionPorZeroException, FormatoNumeroException {
		
		try {
			int divndo = Integer.parseInt(dividendo);
			int divsor = Integer.parseInt(divisor);
			return dividir(divndo, divsor);
		
		}catch(NumberFormatException nfe){
			throw new FormatoNumeroException("Debe ingresar un número en el dividendo "
					+ "y en el divisor");
		}
		
	}

}
