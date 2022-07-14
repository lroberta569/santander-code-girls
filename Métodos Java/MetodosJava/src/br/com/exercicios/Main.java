package br.com.exercicios;

public class Main {

	public static void main(String[] args) {
		
		// Calculadora
		System.out.println("Exercicio Calculadora");
		Calculadora.soma(3, 6);
		Calculadora.subtracao(9, 1.8);
		Calculadora.multiplicacao(7, 8);
		Calculadora.divisao(5, 2.5);
		
		//Mensagem
		System.out.println("Exercicio Mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);
		
		//Empréstimo
		System.out.println("Exercicio Empréstimo");
		Emprestimo.Calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.Calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.Calcular(1000, 5);
		
		//Quadrilatero
		System.out.println("Exercicio Quadrilátero");
		Quadrilatero.area(3);
		Quadrilatero.area(5d,5d);
		Quadrilatero.area(7, 8, 9);
		Quadrilatero.area(5f,5f);
		
		//Quadrilatero2 - Retornos
		System.out.println("Exercicio Retorno");
		double areaQuadrado = Quadrilatero2.area(3);
		System.out.println("Área do quadrado: " + areaQuadrado);
		
		double areaRetangulo = Quadrilatero2.area(5, 5);
		System.out.println("Área do retângulo: " + areaRetangulo);
		
		double areaTrapezio = Quadrilatero2.area(7, 8, 9);
		System.out.println("Área do trapézio: " + areaTrapezio);
		
		
	}

}
