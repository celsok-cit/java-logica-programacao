package br.com.ciandt.jwillian.decisao;

import java.util.Calendar;
import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		
		System.out.println("Ano Atual: " + anoAtual);
		
		System.out.println("Digite o ano de nacimento: ");
		int anoNascimento = sc.nextInt();
		int idade = anoAtual - anoNascimento;
		
		String resultado = (idade >= 18) ? "adulto!" : "menor de idade!";
		System.out.println("você tem " + idade + " anos, você é " + resultado);
			
		sc.close();
	}

}
