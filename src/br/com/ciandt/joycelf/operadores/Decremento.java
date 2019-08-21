package br.com.ciandt.joycelf.operadores;

import java.util.Scanner;

public class Decremento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor para decrementar no console:");
		double valor = sc.nextDouble();

		System.out.println(--valor);
	}

}
