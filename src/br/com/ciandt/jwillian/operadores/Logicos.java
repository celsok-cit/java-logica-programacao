package br.com.ciandt.jwillian.operadores;

import java.util.Scanner;

public class Logicos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero: ");
		int primeiroNumero = sc.nextInt();
		
		System.out.println("Entre com o segundo n�mero: ");
		int segundoNumero = sc.nextInt();
		
		if (primeiroNumero > 100 && segundoNumero > 100) {
			System.out.println("Os dois n�meros s�o maiores que 100");
		} else if (primeiroNumero > 100 || segundoNumero > 100){
			System.out.println("Somente um n�mero � maior que 100");
		} else {
			System.out.println("Os dois numeros s�o menores ou igual a 100");
		}
		sc.close();
	}

}
