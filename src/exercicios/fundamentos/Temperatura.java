package exercicios.fundamentos;

import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
		// F�rumula para calcular a convers�o de farenheit
		// (�F - 32) * 5/9 = �C		
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		double farenheit = 86;
		double celsius = (farenheit - AJUSTE) * FATOR;
		System.out.println("O resultado � " + celsius + "�C");
		
		farenheit = 0;
		celsius = (farenheit - AJUSTE) * FATOR;
		System.out.println("O resultado � " + celsius + "�C");
		
		farenheit = 100;
		celsius = (farenheit - AJUSTE) * FATOR;
		System.out.println("O resultado � " + celsius + "�C");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor em farenheit que voc� deseja converter: ");
		farenheit = scan.nextDouble();
		celsius = (farenheit - AJUSTE) * FATOR;
		System.out.printf("A temperatura � %.2f �C", celsius);
		
		scan.close();
	}
}