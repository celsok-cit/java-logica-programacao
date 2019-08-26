package br.com.ciandt.mhiroshi.operadores;

import java.util.Scanner;

public class Relacionais {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as notas para avaliar a média no console:");
		double firstNote = sc.nextDouble();
		double secondNote = sc.nextDouble();
		
		if ((firstNote + secondNote) / 2 >= 7)
		System.out.println("Aprovado");
				
		if ((firstNote + secondNote) / 2 < 4)
			System.out.println("Reprovado");
		
	}

}

