package exercicios.controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {

		// if(...) senten�a; ou {}
		// while(...) senten�a; ou {}
		// for(...; ...; ...;) senten�a ou {}
		//inicializa��o/express�o/modifica��o 
		
		//do {} while (...);
		// ou 
		// do senten�a; ou {} while(...);
		String texto = "";
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Voc� precisa falar as palavras m�gicas...");
			System.out.println("Quer sair? ");
			texto = scan.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		scan.close();
		
	}
}