package com.silas.cursodejava.aula29;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros; // num maximo de passageiros
	double capCombustivel; // capacidade maxima do tank de combustivel 
	double comCombustivel; // comsumo de combustivel por km
	
	
	Carro(){
		System.out.println("A classe carro foi instanciada automaticamente");
		
		// se tiver valor padrão e so colocar aqui
		
		numPassageiros = 4;
	}
	
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double comCombustivel_){
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		comCombustivel = comCombustivel_;
		
		
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
