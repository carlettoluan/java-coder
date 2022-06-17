package exercicios.fundamentos.operadores;

public class Ternarios {
	
	public static void main(String[] args) {
		
		double media = 5.6;
		// String resultado = media >= 7 ? "Aprovado" : "Recuperação";
		
		String resultadoFinal = media >= 5.0 ?
				"aprovado" : "em recuperação";
		System.out.println("O aluno está " + resultadoFinal);
		
		
	}
}