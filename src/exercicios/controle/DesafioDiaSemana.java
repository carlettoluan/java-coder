package exercicios.controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o nome do dia: ");
		String dia = scan.next();
		
		// "domingo".contentEquals(dia);
		// a mesma aplicação, mas invertida
		
		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		} else if (dia.equalsIgnoreCase("segunda-feira")
					|| dia.equalsIgnoreCase("segunda")) { 
				System.out.println("2");
		} else if (dia.equalsIgnoreCase("terça-feira")
				|| dia.equalsIgnoreCase("terça")) { 
				System.out.println("3");
		} else if (dia.equalsIgnoreCase("quarta-feira")
				|| dia.equalsIgnoreCase("quarta")) { 
				System.out.println("4");
		} else if (dia.equalsIgnoreCase("quinta-feira") 
				|| dia.equalsIgnoreCase("quinta")) {
				System.out.println("5");
		}  else if (dia.equalsIgnoreCase("sexta-feira") 
				|| dia.equalsIgnoreCase("sexta")) {
				System.out.println("6");
		} else if (dia.equalsIgnoreCase("sábado")) {
				System.out.println("7");
		} else { System.out.println("Entrada inválida");
			}
		scan.close();
		}
	}