package claseString;

public class ejemploStringTestRendimientoConcat {
	
	public static void main(String[] args) {
		
		String a = "a";
		String b = "b";
		String c = a;
		
		StringBuilder sb = new StringBuilder(a);
		
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++) {
			//c = c.concat(a).concat(b).concat("\n"); 100000 => 5071ms
			 c += a + b + "\n"; // 100000 => 1976ms
			 sb.append(a).append(b).append("\n"); // 100000 => 8ms es el más rápido
		}
		
		long fin = System.currentTimeMillis();
		
		System.out.println(fin - inicio);
		System.out.println(c);
		System.out.println(sb.toString());
	}

}
