package exercicios.fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // conversão implícita
		System.out.println(a);
		
		
//		casting 
		float b = (float)1.0; // conversão explícita (CAST)
//		float b = 1.0F;
		System.out.println(b);
		
		int c = 340;	
		byte d = (byte) c; // conversão explícita (CAST)
		System.out.println(d);
		
		double e = 1.999; // conversão explícita (CAST)
		int f = (int) e;
		System.out.println(f);
		
	}
}
