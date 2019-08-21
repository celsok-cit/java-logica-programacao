package br.com.ciandt.joycelf.decisao;

import java.util.Calendar;
import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o ano de nascimento:");
		int anoNascimento = sc.nextInt();

		System.out.print(verifica(anoNascimento));
	}

	static private String verifica(int anoNascimento) {
		Calendar calendar = Calendar.getInstance();
		int thisYear = calendar.get(calendar.YEAR);

		return thisYear - anoNascimento >= 18 ? "Adulto" : "Menor de idade";
	}

}
