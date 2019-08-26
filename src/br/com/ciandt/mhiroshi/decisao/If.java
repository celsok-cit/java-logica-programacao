package br.com.ciandt.mhiroshi.decisao;

import java.util.Scanner;

public class If {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as notas para avaliar a média no console:");
		int valor = sc.nextInt();
	
		if (valor > 25)
		System.out.println("Desconto");
		System.out.println("Obrigado pela compra");
		
	}

}
