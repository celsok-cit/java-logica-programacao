package br.com.ciandt.thiagodf.operadores;

import java.util.Scanner;

/**
 * Class de Decrementar o valor digitado no console.
 * 
 * @author thiagodf
 *
 */
public class Decremento {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor para decrementar no console:");
		double valor = sc.nextDouble();
		
		System.out.println(--valor);
	}
}
