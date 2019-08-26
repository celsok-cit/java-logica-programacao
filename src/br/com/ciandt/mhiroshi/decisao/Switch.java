package br.com.ciandt.mhiroshi.decisao;

import java.util.Scanner;

public class Switch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma linguagem de programação:");
		String ano = sc.next();
		
		switch (ano) {
		case "java":
			System.out.println("Dev Java");
			break;
		case "dotnet":
			System.out.println("Dev DotNet");
			break;
		case "javascript":
			System.out.println("Dev JavaScript");
			break;
		default:
			System.out.println("Errooou!");
			break;
		}
	}
}
