package exercicios.classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1= new Data();
		
		d1.ano = 1992;
		d1.mes = 7;
		d1.dia = 13;
		
		
		var d2 = new Data();
		d2.dia = 31;
		d2.mes= 12;
		d2.ano = 2020;
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
		var d3 = new Data();
		
		d3.imprimirDataFormatada();
		
		Data d4 = new Data(20, 7, 1992);
		
		d4.imprimirDataFormatada();

		
	}
}
