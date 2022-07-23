package br.com.loops;

import java.util.Scanner;

/**
 * Faça um programa que leia 5 números
 * e informe o maior  numero e
 * a média desses numeros
 */

public class MaiorEMedia {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma = 0;
		
		int count = 0;
		
		
		do {
			
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			soma = soma + numero;
			if(numero > maior) {
				maior = numero;
			}
			count++;
			
		} while(count < 5);
		
		
			
		System.out.println("Maior: " + maior);
		System.out.println("Média: " + soma / 5);
		

	}

}
