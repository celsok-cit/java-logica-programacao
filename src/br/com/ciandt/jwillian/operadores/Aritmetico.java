package br.com.ciandt.jwillian.operadores;

public class Aritmetico {

	public static void main(String[] args) {
		
		int horas = 6;
		double kmTotal = 457;
		double velocidadeKMH = kmTotal / horas;
		double velocidadeMetrosSegundo = velocidadeKMH / 3.6;
		
		System.out.println("Velocidade em Kmh: " + velocidadeKMH);
		System.out.println("Velocidade em metros por segundo: " + velocidadeMetrosSegundo);
		
	}

}
