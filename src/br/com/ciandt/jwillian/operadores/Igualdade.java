package br.com.ciandt.jwillian.operadores;

import java.util.Scanner;

public class Igualdade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		double valor = sc.nextDouble();
		
		if (valor == 10) {
			System.out.println("Acertou");
		} else {
			System.out.println("ERROOOOUUU");
		}
		sc.close();
	}

}
