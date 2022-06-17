package exercicios.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		// a diferença é o comportamento quando a fila está cheia!
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Elemente -> obter o próximo elemento 
		// da fila sem remover
		
		// A diferença de comportamento ocorre 
		// quando a fila está vazia
		System.out.println(fila.peek()); // retorna uma exceção
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element()); // lança uma exceção
	
		// Poll e Remove -> obter o próximo elemento
		// da fila e remove!
		
		// A diferença de comportamento ocorre 
		// quando a fila está vazia
		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.poll()); // lança uma exceção
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
