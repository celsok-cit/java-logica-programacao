package br.com.ciandt.mhiroshi.operadores;

import java.util.Scanner;

public class Atribuicao {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome no console:");
		String nome = sc.next();
		System.out.println("Digite sua idade no console:");
		int idade = sc.nextInt();
		
		System.out.println("nome: " + nome + "\nidade: "+ idade);
		
		
	}

}
