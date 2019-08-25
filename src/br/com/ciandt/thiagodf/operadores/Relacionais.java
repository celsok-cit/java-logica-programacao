package br.com.ciandt.thiagodf.operadores;

import java.util.Scanner;

public class Relacionais {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int notaUm = 0;
		int notaDois = 0;
		
		Scanner sc = new Scanner(System.in);
		
		if (notaUm == 0 && notaDois == 0) {
			
			System.out.println("Digite sua primeira nota:");
			notaUm = sc.nextInt();
			
			System.out.println("Digite sua segunda nota:");
			notaDois = sc.nextInt();
			
			int media = (notaUm + notaDois) / 2;
			
			
			if (media >= 7) {
				
				System.out.println("Média: " + media + " Aprovado!!!");
				
			} 
			
			if (media < 4) {
				
				System.out.println("Média: " + media + " Reprovado!!!");
				
			}
		} 
	}
}