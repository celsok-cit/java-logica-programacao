package br.com.ciandt.jwillian.decisao;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva uma palavra: ");
		String palavra = sc.next();
		
		switch (palavra) {
		case "Java":
			System.out.println("Dev Java");
			break;
		case "DotNet":
			System.out.println("Dev DotNet");
			break;
		case "Javascript":
			System.out.println("Dev Javascript");
			break;
		default:
			System.out.println("Errooou");
			break;
		}
		
		sc.close();
	}

}
