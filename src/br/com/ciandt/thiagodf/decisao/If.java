package br.com.ciandt.thiagodf.decisao;

import java.util.Scanner;

/**
 * Class if verifica se o valor é maior que 25.
 * 
 * @author thiagodf
 *
 */
public class If {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor:");
		int valor = sc.nextInt();
		
		if (valor > 25) {
			
			System.out.println("Desconto");
			
		}
		
		System.out.println("Obrigado pela compra");
		
	}

}
