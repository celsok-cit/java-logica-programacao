package br.com.ciandt.thiagodf.decisao;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Class Ternario verifica a maior idade.
 * 
 * @author thiagodf
 *
 */
public class Ternario {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os 4 digitos do seu ano de nascimento:");
		int anoNascimento = sc.nextInt();
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		int resultado = anoAtual - anoNascimento;
		String maiorIdade = (resultado >= 18) ? "Adulto!." : "Menor de idade!.";
		
		System.out.println(maiorIdade);
	}

}
