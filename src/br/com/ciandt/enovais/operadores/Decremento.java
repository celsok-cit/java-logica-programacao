package br.com.ciandt.enovais.operadores;

import java.util.Scanner;

public class Decremento {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o valor para decrementar no console:");
			Double valor = sc.nextDouble();

			System.out.println(--valor);
	}

}
