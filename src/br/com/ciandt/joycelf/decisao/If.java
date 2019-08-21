package br.com.ciandt.joycelf.decisao;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da compra");
		int valor = sc.nextInt();
		
		if(valor > 25)
			System.out.println("desconto");
		
		System.out.print("Obrigado pela compra");
	}

}
