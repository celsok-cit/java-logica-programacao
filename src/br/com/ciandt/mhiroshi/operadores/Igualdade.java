package br.com.ciandt.mhiroshi.operadores;

import java.util.Scanner;

public class Igualdade {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor para incrementar no console:");
		double valor = sc.nextDouble();
		
		if (valor == 10)
		System.out.println("Acertou");
		
		if (valor != 10)
		System.out.println("ERRROOOOUUU");
	}
	
}
