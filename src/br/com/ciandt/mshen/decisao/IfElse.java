package br.com.ciandt.mshen.decisao;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o ano de nascimento");
		int anoDeNascimento = sc.nextInt();

		int idade = 2020 - anoDeNascimento;

		if (idade >= 18) {
			System.out.println("Adulto");
		} else {
			System.out.println("Menor de idade");
		}
	}
}
