package br.com.ciandt.enovais.decisao;

import java.util.Scanner;

public class Switch {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a linguagem de programação:");
		String linguagem = sc.next();
		
		switch(linguagem) {
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
			System.out.println("Errooou!");
			break;
		}

	}

}
