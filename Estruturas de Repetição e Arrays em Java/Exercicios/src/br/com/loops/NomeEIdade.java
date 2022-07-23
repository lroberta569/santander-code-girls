package br.com.loops;

import java.util.Scanner;

/*
 *  Faça um programa que leia conjuntos de dois valores, o primeiro
 * representando o nome do aluno e o segundo representando sua idade.
 * (Pare o programa inserindo o valor 0 no campo nome)
 */

public class NomeEIdade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		
		
		while(true) {
		
		System.out.println("Nome: ");
		nome = leia.next();
		if(nome.equals("0")) break;
		
		System.out.println("Idade: ");
		idade = leia.nextInt();

		}
		
		System.out.println("Fim");
		
		leia.close();
	}

}
