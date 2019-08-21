package br.com.ciandt.joycelf.operadores;

import java.util.Scanner;

public class Logicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor A:");
		double valorA = sc.nextDouble();

		System.out.println("Digite o valor B:");
		double valorB = sc.nextDouble();

		System.out.print(verifica(valorA, valorB));
	}

	static String verifica(double valorA, double valorB) {
		boolean doisMaiores;
		String resultado;
		if (valorA > 100 && valorB > 100) {
			resultado = "Os dois números são maiores";
		} else if (valorA <= 100 && valorB <= 100) {
			resultado = "Os dois números são menores ou iguais a cem";
		} else {
			resultado = "Um dos números é maior que cem";
		}
		
		return resultado;
	}
}
