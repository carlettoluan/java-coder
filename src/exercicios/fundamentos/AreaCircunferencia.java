package exercicios.fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		double raio = 3.4;
		final double PI = 3.14159;
		double area = raio * raio * PI;
		
		System.out.printf("%.5f",area);
		System.out.println();
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m²");
	}
}