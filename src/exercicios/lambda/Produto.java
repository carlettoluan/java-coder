package exercicios.lambda;

public class Produto extends Object { // esse extends � sempre
									  // impl�cito, pra todas as classes	
	
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return nome + " tem pre�o de R$" + precoFinal;
	}
}
