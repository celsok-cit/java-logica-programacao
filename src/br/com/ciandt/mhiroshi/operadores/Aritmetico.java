package br.com.ciandt.mhiroshi.operadores;

public class Aritmetico {

	public static void main(String[] args) {
		double horaPorSegundo = (6 * 60 * 60);
		double kilometroPraMetro = (457 * 1000);
		System.out.println("Conversão de 6 horas para segundo: " + horaPorSegundo);
		System.out.println("Conversão de 457 quilometros para metros: " + kilometroPraMetro);
		
		double metrosPorSegundo = (kilometroPraMetro / horaPorSegundo);
		System.out.println( "A velocidade metro por segundo é " + metrosPorSegundo);
	} 

}
