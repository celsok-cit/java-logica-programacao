package br.com.ciandt.mshen.operadores;

import java.util.Scanner;

public class Decremento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor para decremento no console:");
		double valor = sc.nextDouble();

		System.out.println(--valor);
	}

}
