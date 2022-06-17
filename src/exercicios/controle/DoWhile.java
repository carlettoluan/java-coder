package exercicios.controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {

		// if(...) sentença; ou {}
		// while(...) sentença; ou {}
		// for(...; ...; ...;) sentença ou {}
		//inicialização/expressão/modificação 
		
		//do {} while (...);
		// ou 
		// do sentença; ou {} while(...);
		String texto = "";
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.println("Quer sair? ");
			texto = scan.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		scan.close();
		
	}
}