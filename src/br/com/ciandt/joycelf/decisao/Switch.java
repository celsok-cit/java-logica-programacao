package br.com.ciandt.joycelf.decisao;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String tecnologia = new String();
		
		while (!tecnologia.equals("Javascript")) {
			System.out.println("Digite a tecnologia:");
			tecnologia = sc.nextLine();

			switch (tecnologia) {
			case "Java":
				System.out.println("Dev Java");
				break;
			case "DotNet":
				System.out.println("Dev DotNet");
				break;
			case "Javascript":
				System.out.println("Dev Javascript");
				break;
			default:
				System.out.println("Errooou!");
				break;
			}
		}
	}

}
