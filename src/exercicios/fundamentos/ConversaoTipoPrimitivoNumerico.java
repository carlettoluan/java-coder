package exercicios.fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // convers�o impl�cita
		System.out.println(a);
		
		
//		casting 
		float b = (float)1.0; // convers�o expl�cita (CAST)
//		float b = 1.0F;
		System.out.println(b);
		
		int c = 340;	
		byte d = (byte) c; // convers�o expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.999; // convers�o expl�cita (CAST)
		int f = (int) e;
		System.out.println(f);
		
	}
}
