package br.com.ciandt.thiagodf.operadores;

import java.util.Scanner;

/**
 * Class de Igualdade valida se o valor digitado é igual a 10.
 * 
 * @author thiagodf
 *
 */
public class Igualdade {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite qual é o valor:");
		double valor = sc.nextDouble();
		
		
		if (valor == 10) {
			
			System.out.println("Acertou!!!");
			
		} else {
			
			System.out.println("ERRROOOOUUU!!!");
		}
		
	}
	
}