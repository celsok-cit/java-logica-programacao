package br.com.ciandt.mhiroshi.decisao;

import java.util.Scanner;

public class IfElse {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano do seu nascimento no console:");
		int ano = sc.nextInt();
		
		if (ano - 2019 > -18)
		System.out.println("menor de idade");
		
		else
		System.out.println("maior de idade");
	}
}
