package exercicios.fundamentos;

import java.util.Scanner;

public class DesafioConversao {
		
	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro sal�ro: ");
		String valor1 = scan.next().replace(",", ".");
		
		System.out.print("\nInforme o segundo sal�ro: ");
		String valor2 = scan.next().replace(",", ".");
		
		System.out.print("\nInforme o terceiro sal�ro: ");
		String valor3 = scan.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3)/3;
		System.out.println("A m�dia dos sal�rios � " + media);
		
		scan.close();		
	}
}