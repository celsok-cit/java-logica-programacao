package br.com.ciandt.mshen.decisao;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o ano de nascimento");
		int anoDeNascimento = sc.nextInt();

		int idade = 2020 - anoDeNascimento;

		String resultado = (idade >= 18) ? "Adulto" : "Menor de idade";
		System.out.println(resultado);
	}

}
