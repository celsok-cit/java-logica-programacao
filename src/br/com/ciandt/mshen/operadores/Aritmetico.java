package br.com.ciandt.mshen.operadores;

public class Aritmetico {

	public static void main(String[] args) {
		int tempo = 6;
		int distancia = 457;
		double velocidadeMedia = (distancia / tempo) / 3.6;

		System.out.printf("Velocidade media: %.2f m/s", (velocidadeMedia));
	}

}
