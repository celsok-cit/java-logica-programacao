package br.com.ciandt.thiagodf.operadores;

import java.util.Scanner;

/**
 * Class Logicos verifica se os dois valores ou um deles, são maiores que 100.
 * 
 * @author thiagodf
 *
 */
public class Logicos {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		int primeiroNumero = sc.nextInt();

		System.out.println("Digite o segundo número:");
		int segundoNumero = sc.nextInt();

		if (primeiroNumero > 100 && segundoNumero > 100) {

			System.out.println("Os dois número são maiores que 100");

		} else {
			
			if (primeiroNumero > 100 || segundoNumero > 100) {

				System.out.println("Somente um número é maior que 100");
			}
			
		}

	}

}
