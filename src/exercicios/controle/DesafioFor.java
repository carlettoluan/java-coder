package exercicios.controle;

public class DesafioFor {
	
	public static void main(String[] args) {
	
		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		// Desafio
		// Não pode usar valor numerico pra controlar laço
		System.out.println();
	
		// int double float 
		// boolean bit byte long
		
		String chave = "&";
		for(char i = 'a'; i != 'f'; i++) {
			System.out.println(chave);
			chave += "&";
		}
		
		/*
		 * Resolução do professor
		 * for (String v = "#"; !v.equals("######"); v += "#") {
		 * System.out.println(v);
		 * */
	
	}
}
