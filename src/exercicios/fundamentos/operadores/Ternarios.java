package exercicios.fundamentos.operadores;

public class Ternarios {
	
	public static void main(String[] args) {
		
		double media = 5.6;
		// String resultado = media >= 7 ? "Aprovado" : "Recupera��o";
		
		String resultadoFinal = media >= 5.0 ?
				"aprovado" : "em recupera��o";
		System.out.println("O aluno est� " + resultadoFinal);
		
		
	}
}