package exercicios.classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida("Arroz", 0.1823);
		Comida c2 = new Comida("Feijao", 0.3223);
		
		Pessoa p = new Pessoa("Jo�o", 99.8);

		System.out.println(p.apresentar());
		p.comer(c1);
		
		System.out.println(p.apresentar());
		p.comer(c2);
		
		System.out.println(p.apresentar());
	}
}
