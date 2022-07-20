package exercicios.oo.abstrato;

public class testeAbstrato {
	
	public static void main(String[] args) {
		Mamifero rex = new Cachorro();
		System.out.println(rex.mamar());
		System.out.println(rex.mover());
		System.out.println(rex.respirar());
	}

}
