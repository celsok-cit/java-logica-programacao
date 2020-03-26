package br.com.ciandt.mshen.operadores;

import java.util.Scanner;

public class Igualdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor no console");
		double valor = sc.nextDouble();

		if (valor == 10) {
			System.out.println("Acertou");
		} else {
			System.out.println("ERRROOOOUUU");
		}

	}

}
