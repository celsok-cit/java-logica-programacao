package br.com.ciandt.mshen.operadores;

import java.util.Scanner;

public class Relacionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota 1");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a nota 2");
		double nota2 = sc.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media < 4) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Recuperação");
		}
	}

}
