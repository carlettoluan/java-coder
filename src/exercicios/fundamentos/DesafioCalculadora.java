package exercicios.fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor");
		String valor2 = JOptionPane.showInputDialog("Digite o primeiro valor");
		String operacao = JOptionPane.showInputDialog("A operação desejada");
		
		Double num1 = Double.parseDouble(valor1);
		Double num2 = Double.parseDouble(valor2);
		
		Double resultado = "+".equals(operacao) ? num1 + num2: 0;		
		resultado = "-".equals(operacao) ? num1 - num2: resultado;		
		resultado = "*".equals(operacao) ? num1 * num2: resultado;		
		resultado = "/".equals(operacao) ? num1 / num2: resultado;		
		resultado = "%".equals(operacao) ? num1 % num2: resultado;		
		
		System.out.printf("%.2f %s %.2f = %.2f",
				num1, operacao, num2, resultado);	
	}
}
