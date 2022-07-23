package Exercicios;

import java.util.LinkedList;

/**
 * Exercicios com metodos LinkedList
 */

public class ExerciciosMetodosLinkedList {

	public static void main(String[] args) {
		
		System.out.print("Crie uma lista chamada notas ");
		LinkedList<Double> notas = new LinkedList<Double>();
		
		System.out.println("e coloque todos os elementos da Arraylist nessa nova lista");
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		
		System.out.println("Mostre a primeira nota da lista sem remove-lo " + notas.get(0));
		
		System.out.println("Mostre a primeira nota lista e remova-o " + notas.remove(0));
		System.out.println(notas);

	}

}
