package exercicios.lambda;

public class Desafio {
	public static void main(String[] args) {
		
		Produto produto = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> precoFinal = null;
		UnaryOperator<Double> impostoMunicipal = null;
		UnaryOperator<Double> frete = null;
		UnaryOperator<Double> arredondar = null;
		Function<Double, String> formatar = null;
		
		String precoFinal = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(produto);
		System.out.println("O preço final é " + precoFinal);
		
		
	}
}
