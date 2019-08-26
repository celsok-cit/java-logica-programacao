package br.com.ciandt.enovais.operadores;

import java.util.Scanner;

public class Logicos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double value1 = new Double(0);
		Double value2 = new Double(0);
		
		System.out.println("Coloque um valor maior do que 100:");
		value1 = sc.nextDouble();
		System.out.println("Coloque outro valor maior do que 100:");
		value2 = sc.nextDouble();
		
		if((value1 > 100 && value2 < 100) || (value1 < 100 && value2 > 100)) {
			System.out.println("Somente um dos números é maior que 100");
		} else if(value1 < 100 && value2 < 100) {
			System.out.println("Nenhum número é maior que 100");
		} else {
			System.out.println("Os dois números são maiores do que 100");
		}				
	}
}
