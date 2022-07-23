package br.com.loops;

import java.util.Scanner;

/**
 * Faça um programa que peça N numeros inteiros,
 * calcule e mostre a quantidade de numeros pares e a
 * quantidade de numeros primos
 */
public class ParEImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int qntNumeros;
		int numero;
		int qntPares = 0;
		int qntImpares = 0;
		
		System.out.println("Digite a quantidade de números: ");
		qntNumeros = leia.nextInt();
		
		int count = 0;
		do {
			System.out.println("Digite o número: ");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				qntPares++;
			}else {
				qntImpares++;
			}
			count++;
			
		} while(count < qntNumeros);
		
		System.out.println("Quantidade de pares: " + qntPares);
		System.out.println("Quantidade de ímpares: " + qntImpares);
		
		

	}

}
