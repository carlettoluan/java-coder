package exercicios.controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota: (ou -1 para sair)");
			nota = scan.nextDouble();
			
			if (nota != -1) {
				total += nota;
			quantidadeDeNotas++;
			} else if (nota!= -1) {
				System.out.println("Nota inválida!!!");
			}
		}
		// calcular a média
		
		double media = total/quantidadeDeNotas;
		System.out.println("Media = " + media);
		
		scan.close();
	}
}