package br.com.ciandt.enovais.decisao;

import java.util.Scanner;

public class Ternario {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu ano de nascimento:");
		int anoNascimento = sc.nextInt();
		System.out.println((2019 - anoNascimento) >= 18 ? "Adulto" : "Menor de idade");
	}

}
