package br.com.ciandt.joycelf.operadores;

import java.util.Scanner;

public class Relacionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da prova A:");
		double notaA = sc.nextDouble();
		
		System.out.println("Digite o valor da prova B:");
		double notaB = sc.nextDouble();
		
		if (aprovado(notaA, notaB))
			System.out.println("Aprovado");	
		else 
			System.out.println("Reprovado");	
	}

	static boolean aprovado(double notaA, double notaB) {
		return ((notaA + notaB) / 2) >= 7;
	}
}
