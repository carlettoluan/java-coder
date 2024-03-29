package exercicios.colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(u1.nome);
		System.out.println("-------------------------");
		
		System.out.println(lista.get(3).nome); // acessar pelo �ndice
		
		
		System.out.println(">>>>>" + lista.remove(1));
		
		
			System.out.println(u1.nome);
			
			System.out.println("-------------------------");
			
			System.out.println("Tem?" + lista.contains(new Usuario("Lia")));
			System.out.println(lista.contains(u1));

			System.out.println("-------------------------");
			
			for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}