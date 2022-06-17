package exercicios.fundamentos.operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		 
		Double a = (6.0 * (3 + 2)); 
		Double b = Math.pow(a, 2);
		b = b/(3 * 2);
		
		
		Double c = ((1.0 - 5) * (2 - 7))/2;
		Double d = (Math.pow(c, 2));
		
		Double e = Math.pow((b - d), 3); 
		Double f = Math.pow(10, 3);
		
		Double resultado = (e / f);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		System.out.println(resultado);
		
		/*
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3);
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println();
		*/
		
	}
}