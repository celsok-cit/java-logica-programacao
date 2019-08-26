package br.com.ciandt.enovais.decisao;

import java.util.Scanner;

public class IfElse {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu ano de nascimento:");
		int anoNascimento = sc.nextInt();
		if((2019 - anoNascimento) >= 18) {
			System.out.println("Adulto");
		} else {
			System.out.println("Menor de idade");
		}
	}
}
