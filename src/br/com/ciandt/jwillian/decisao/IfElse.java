package br.com.ciandt.jwillian.decisao;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano atual: ");
		int anoAtual = sc.nextInt();
		
		System.out.println("Digite o ano de nascimento: ");
		int anoNascimento = sc.nextInt();
		int idade = anoAtual - anoNascimento;
		
		if (idade >= 18) {
			System.out.println("você tem " + idade + " anos, você é adulto!");
		} else {
			System.out.println("você tem " + idade + " anos, você é menor de idade!");
		}		
		sc.close();
	}
}
