package br.com.ciandt.mhiroshi.operadores;

import java.util.Scanner;

public class Logicos {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros no console:");
		double firstNumber = sc.nextDouble();
		double secondNumber = sc.nextDouble();
		
		if (firstNumber > 100 && secondNumber > 100)
		System.out.println("Os dois numeros s�o maiores que 100");
		
		if (firstNumber <= 100 || secondNumber <= 100)
			System.out.println("Um dos dois numeros s�o maiores que 100");
	}

}
