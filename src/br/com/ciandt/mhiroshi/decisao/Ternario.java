package br.com.ciandt.mhiroshi.decisao;

import java.util.Scanner;

public class Ternario {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano do seu nascimento no console:");
		int ano = sc.nextInt();
		
		int anoAtual = 2019;
		int idade= (ano - anoAtual);
		int maturidade = (idade > -18) ? idade : -18;
		System.out.println(maturidade);
		
	}
}