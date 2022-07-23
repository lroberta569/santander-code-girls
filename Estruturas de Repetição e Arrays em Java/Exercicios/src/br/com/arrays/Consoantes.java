package br.com.arrays;

import java.util.Scanner;

/*
 * Faça um programa que leia um vetor com 6 consoantes
 * e diga quantas consoantes foram lidas.
 * Imrpima as consoantes
 */

public class Consoantes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String[] consonates = new String[6];
		int qtdConsoantes = 0;
		
		int count = 0;
		
		do {
			System.out.println("Digite as letras: ");
			String letra = leia.next();
			
			if(!(letra.equalsIgnoreCase("a") || 
					letra.equalsIgnoreCase("e") ||
					letra.equalsIgnoreCase("i") || 
					letra.equalsIgnoreCase("o") ||
					letra.equalsIgnoreCase("u"))) {
				consonates[count] = letra;
				qtdConsoantes++;
			}
			
			count++;
		}while(count < consonates.length);

		System.out.print("Consoantes: ");
		for (String consoante : consonates) {
			if(consoante != null) {
			System.out.print(consoante + " ");
			
			}
		}
		System.out.println("\nQuandidade de consoantes: " + qtdConsoantes);
		leia.close();
	}

}
