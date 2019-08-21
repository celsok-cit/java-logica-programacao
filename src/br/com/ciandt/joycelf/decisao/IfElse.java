package br.com.ciandt.joycelf.decisao;

import java.util.Calendar;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		int thisYear = calendar.get(calendar.YEAR);
		
		System.out.println("Digite o ano de nascimento:");
		int anoNascimento = sc.nextInt();

		if (thisYear - anoNascimento >= 18)
			System.out.println("Adulto");
		else
			System.out.println("Menor de idade");
	}
}
