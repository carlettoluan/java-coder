package exercicios.arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantas notas: ");
		int qtdeNotas = scan.nextInt();
		
		Double[] notas = new Double[qtdeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + ": ");
			notas[i] = scan.nextDouble();
		}
		
		double total = 0;
		for(double nota:notas) {
			total += nota;
			
		}
		double media = total / notas.length;
		System.out.println("A média é " + media + "!");
		scan.close();
	}
}
