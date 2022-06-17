package exercicios.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		// a diferen�a � o comportamento quando a fila est� cheia!
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Elemente -> obter o pr�ximo elemento 
		// da fila sem remover
		
		// A diferen�a de comportamento ocorre 
		// quando a fila est� vazia
		System.out.println(fila.peek()); // retorna uma exce��o
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element()); // lan�a uma exce��o
	
		// Poll e Remove -> obter o pr�ximo elemento
		// da fila e remove!
		
		// A diferen�a de comportamento ocorre 
		// quando a fila est� vazia
		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.poll()); // lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//		fila.contains(...);
	}
}
