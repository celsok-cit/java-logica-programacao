package br.com.ciandt.mshen.operadores;

import java.util.Scanner;

public class Logicos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor");
		int valor2 = sc.nextInt();

		if (valor1 > 100 && valor2 > 100) {
			System.out.println("Os dois números são maiores que 100");
		} else if (valor1 > 100 || valor2 > 100) {
			System.out.println("Somente um número é maior que 100");
		} else {
			System.out.println("Os dois números são menores ou iguais a 100");
		}
	}

}
