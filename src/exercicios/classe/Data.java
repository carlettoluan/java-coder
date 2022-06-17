package exercicios.classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	String formato = "%d/%d/%d"; // poderia ser colocada no final do arquivo, antes do fechamento do ultimo parentesis
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", this.dia, mes, ano);
	}
	
	void imprimirDataFormatada () {
		formato = "...";
		System.out.println(obterDataFormatada());
	}
}
