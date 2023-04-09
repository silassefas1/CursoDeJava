package com.silas.cursodejava.aula31;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros; // num maximo de passageiros
	double capCombustivel; // capacidade maxima do tank de combustivel 
	double comCombustivel; // comsumo de combustivel por km
	

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é de: "+capCombustivel*comCombustivel+" Km");
		
	}
	
	double obterAutonomia() {
		System.out.println("o metodo autonomia foi chamado");
		return capCombustivel * comCombustivel;
		
	}
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/comCombustivel;
		
		return qtdCombustivel;
	}
	
}
	