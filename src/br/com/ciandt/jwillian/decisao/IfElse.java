package br.com.ciandt.jwillian.decisao;

import java.util.Calendar;
import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		
		System.out.println("Ano Atual: " + anoAtual);
	
		
		System.out.println("Digite o ano de nascimento: ");
		int anoNascimento = sc.nextInt();
		int idade = anoAtual - anoNascimento;
		
		if (idade >= 18) {
			System.out.println("Você tem " + idade + " anos, você é adulto!");
		} else {
			System.out.println("Você tem " + idade + " anos, você é menor de idade!");
		}		
		sc.close();
	}
}
