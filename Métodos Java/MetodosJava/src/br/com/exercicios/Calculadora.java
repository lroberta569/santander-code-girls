package br.com.exercicios;

public class Calculadora {

	public static void soma (double numero1, double numero2) {
		
		double resultado = numero1 + numero2;
		
		System.out.println("o resultado da soma é: " + resultado);
	}
	
	public static void subtracao (double numero1, double numero2) {
		
		double resultado = numero1 - numero2;
		
		System.out.println("o resultado da subtração é: " + resultado);
	}

	public static void multiplicacao (double numero1, double numero2) {
	
	double resultado = numero1 * numero2;
	
	System.out.println("o resultado da multiplicação é: " + resultado);
	}

	public static void divisao (double numero1, double numero2) {
	
	double resultado = numero1 / numero2;
	
	System.out.println("o resultado da divisão é: " + resultado);
	}

}
