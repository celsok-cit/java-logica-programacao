package br.com.ciandt.thiagodf.decisao;

import java.util.Scanner;

public class Switch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma linguagem de programação:");
		String linguagem = sc.next();
		
		switch (linguagem) {
		
		case "Java":
			System.out.println("Dev. Java");
			break;
			
		case "DotNet":
			System.out.println("Dev. DotNet");
			break;
			
		case "Javascript":
			System.out.println("Dev. Javascript");
			break;
			
		default:
			System.out.println("Errooou!");
			break;
		
		}
	}
}
