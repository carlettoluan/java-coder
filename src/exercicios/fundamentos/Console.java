package exercicios.fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println(" dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 
				1, 2, 3, 4, 5, 6 );
		System.out.printf("Salário: %.1f%n", 1234.5678);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = input.nextLine();
		System.out.println("Nome = ".concat(nome));
		
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = input.nextLine();
		System.out.println("Sobrenome = ".concat(sobrenome));
		
		System.out.print("Digite a sua idade: ");
		int idade = input.nextInt();
		System.out.println("Idade = " + idade);
		
		System.out.printf("%s %s tem %d anos.%n",
				nome, sobrenome, idade);
		
		input.close();
		/*
		Scanner teclado = new Scanner(system.in);
 
		System.out.println("Qual a sua idade?");
		int idade = teclado.nextInt();
		telcado.nextLine() //lê o "\\n" que o teclado.nextInt() deixa para trás.
		System.out.println("Qual o seu nome?");
		string nome = teclado.nextLine();
		System.out.println("Qual o seu sobrenome?");
		string sobrenome = teclado.nextLine();
 
		teclado.close();
		*/
	}
}
