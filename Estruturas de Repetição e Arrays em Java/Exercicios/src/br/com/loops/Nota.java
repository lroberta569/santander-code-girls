package br.com.loops;

import java.util.Scanner;

/*
 *  Faça um programa que peça uma nota, entre zero e dez.
 *  Mostre uma mensagem caso o outro valor seja inválido e continue pedindo
 *  até que o usuário informe um valor válido.
 */

public class Nota {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Digite uma nota: ");
		nota = leia.nextInt();
		
		while(nota < 0 ||  nota > 10) {
			System.out.println("Nota inválida, digite novamente");
			nota = leia.nextInt();
			
		}

	}

}
