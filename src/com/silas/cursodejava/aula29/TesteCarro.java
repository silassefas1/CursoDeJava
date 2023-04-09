package com.silas.cursodejava.aula29;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo ="Ducato";
		van.numPassageiros = 10;
		van.comCombustivel = 0.2;
		van.capCombustivel = 100;
		
		
		Carro van2 = new Carro("Fiat", "Ducato", 10, 0.2, 100);
		van2.modelo ="Ducato";
		
		System.out.println(van2.marca);
		System.out.println(van2.modelo);
		System.out.println(van2.numPassageiros);
		System.out.println(van2.comCombustivel);
		System.out.println(van2.capCombustivel);
		
	}

}
