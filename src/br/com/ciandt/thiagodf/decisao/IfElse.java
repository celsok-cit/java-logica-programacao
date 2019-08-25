package br.com.ciandt.thiagodf.decisao;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Class IfElse verifica a maior idade.
 * 
 * @author thiagodf
 *
 */
public class IfElse {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os 4 digitos do seu ano de nascimento:");
		int anoNascimento = sc.nextInt();
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		int resultado = anoAtual - anoNascimento;
		
		if (resultado >= 18) {
			
			System.out.println("Adulto!.");
			
		} else {
			
			System.out.println("Menor de idade!.");
			
		}
	}
}