package br.com.ciandt.enovais.operadores;

import java.util.Scanner;

public class Igualdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor para verifica��o:");
		Double valor = sc.nextDouble();

		System.out.println(valor == 10 ? "Acertou miseravi!" : "Errroouuuuu!!");
	}

}
