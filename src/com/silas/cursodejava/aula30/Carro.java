package com.silas.cursodejava.aula30;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros; // num maximo de passageiros
	double capCombustivel; // capacidade maxima do tank de combustivel 
	double comCombustivel; // comsumo de combustivel por km
	
	
		

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel,
			double comCombustivel) {

		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.comCombustivel = comCombustivel;
	}

	public Carro() {

	}
	
	

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com 3 paramentos");
	}

	public Carro(String marca, String modelo) {
		this("Fiat", "Ducato", 4);
		System.out.println("Chamando construtor com 2 paramentos");
	}

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
