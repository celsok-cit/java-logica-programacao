package br.com.ciandt.enovais.operadores;

import java.util.Scanner;

public class Igualdade {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor para verificação:");
		Double valor = sc.nextDouble();
		System.out.println(valor == 10 ? "Acertou miseravi!" : "Errroouuuuu!!");
	}

}
