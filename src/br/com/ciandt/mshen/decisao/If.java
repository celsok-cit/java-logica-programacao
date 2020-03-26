package br.com.ciandt.mshen.decisao;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da compra");
		int valor = sc.nextInt();

		if (valor > 25) {
			System.out.println("Desconto");
		}
		System.out.println("Obrigado pela compra");

	}

}
