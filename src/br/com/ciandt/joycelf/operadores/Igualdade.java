package br.com.ciandt.joycelf.operadores;

import java.util.Scanner;

public class Igualdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor:");
		double valor = sc.nextDouble();
		
		if (valor == 10)
			System.out.println("Acertou!!");	
		else 
			System.out.println("Errou!!");	
	}

}
