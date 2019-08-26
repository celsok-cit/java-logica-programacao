package br.com.ciandt.enovais.decisao;

import java.util.Scanner;

public class If {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro:");
		int inteiro = sc.nextInt();
		if(inteiro > 25 ) {
			System.out.println("Desconto");
		}
		System.out.println("Obrigado pela compra");
	}

}
