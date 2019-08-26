package br.com.ciandt.enovais.operadores;

import java.util.Scanner;

public class Relacionais {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner nota = new Scanner(System.in);
		double nota1;
		double nota2;
		double media = 0;
		int contador;

		System.out.println("coloque a primeira nota: ");
		nota1 = nota.nextDouble();
		System.out.println("coloque a segunda nota: ");
		nota2 = nota.nextDouble();
		media = (nota1 + nota2) / 2;
		
		contador = (int) media;
		switch (contador) {
		case 1:
		case 2:
		case 3:
			System.out.println("Reprovado!");
			System.out.println("A média é: " + media);
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Em recuperação");
			System.out.println("A média é: " + media);
			break;
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("Aprovado");
			System.out.println("A média é: " + media);
			break;
		default:
			System.out.println("média inváldia!");
			break;
		}
	}
}