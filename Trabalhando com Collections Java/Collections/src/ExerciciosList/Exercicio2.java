package ExerciciosList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa 
 * sobre um crime. As perguntas são:
 * 1 - "Telefonou para a vítima?"
 * 2 - "Esteve no local do crime?"
 * 3 - "Mora perto da vítima?"
 * 4 - "Devia para a vítima?"
 * 5 - "Já trabalhou com a vítima"?
 * 
 * Se a pessa responder positivamente a 2 questões ela deve ser considerada
 * "Suspeita", entre 3 ou 4 "Cumplice", e 5 como "Assassina", caso contrario ela será classificada como "Inocente";
 * 
 */

public class Exercicio2 {

	public static void main(String[] args) {
		ArrayList<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Perguntas: ");
        System.out.print("\nTelefonou para vítima? ");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Esteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Mora perto da vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Devia para vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")) {
                count ++;
            }
        }

        switch(count) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }
    }
}


