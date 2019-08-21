package br.com.ciandt.thiagodf.operadores;

import java.util.Scanner;

public class Igualdade {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite qual é o valor:");
		double valor = sc.nextDouble();
		
		
		if (valor == 10) {
			// Se o valor digitado for igual a 10 ele imprime.
			System.out.println("Acertou!!!");
			
		} else {
			// Se o valor digitado for diferente de 10 ele imprime.
			System.out.println("ERRROOOOUUU!!!");
		}

	}

}