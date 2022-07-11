package com.primeiroProjeto.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = ler.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = ler.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		int divisao = divisao(a,b);
		
		System.out.println("soma: " + soma);
		System.out.println("subtração: " + subtracao);
		System.out.println("multiplicação: " + multiplicacao);
		System.out.println("divisao: " + divisao);

	}
	
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int divisao(int a, int b) {
		return a / b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}

}
