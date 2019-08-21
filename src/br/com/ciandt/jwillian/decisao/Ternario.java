package br.com.ciandt.jwillian.decisao;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano atual: ");
		int anoAtual = sc.nextInt();
		
		System.out.println("Digite o ano de nascimento: ");
		int anoNascimento = sc.nextInt();
		int idade = anoAtual - anoNascimento;
		
		String resultado = (idade >= 18) ? "adulto!" : "menor de idade!";
		System.out.println("você tem " + idade + " anos, você é " + resultado);
			
		sc.close();
	}

}
