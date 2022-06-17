package exercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos alunos?");
		int qtdeAlunos = scan.nextInt();

		System.out.println("Quantas notas por aluno?");
		int qtdeNotas = scan.nextInt();
		
		double [][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
		
		double total = 0;
		for (int a = 0; a< notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma.length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: \n",
						(n +  1), (a +  1));

				notasDaTurma[a][n] = scan.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		double media = total /(qtdeAlunos * qtdeNotas);
			System.out.println("Média da turma é " + media);
		
		for(double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		scan.close();
	}
}
