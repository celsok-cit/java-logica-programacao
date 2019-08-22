package br.com.ciandt.jwillian.operadores;

import java.util.Scanner;

public class Relacionais {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite N1: ");
		double primeiraNota = sc.nextDouble();
		
		System.out.println("Digite N2: ");
		double segundaNota = sc.nextDouble();
		
		double media = (primeiraNota + segundaNota) / 2;
		
		if (media >= 7) {
			System.out.println("Média: " + media + " Aluno Aprovado");
		
		} else if (media < 7 && media >= 4) {
			System.out.println("Média: " + media + " Aluno em Recuperação");
		
		} else if (media < 4) {
			System.out.println("Média: " + media + " Aluno Reprovado");
		}
		sc.close();
	}

}
