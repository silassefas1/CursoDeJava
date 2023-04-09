package com.silas.cursodejava.aula27;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo ="Ducato";
		van.numPessoas = 10;
		van.comCombustivel = 0.2;
		van.capCombustivel = 100;
		
		
		System.out.println(van.marca);
		System.out.println(van.marca);
		
		van.AutonomiaCombustivel();
		
		double autonomia = van.obterAutonomia();
		System.out.println("A aoutonomia do carro é: "+ autonomia);
		System.out.println("A autonomia do carro e de: "+ van.obterAutonomia());
		
		double qtdCombustivel = van.calcularCombustivel(10);
		
		System.out.println("A quantida de combustivel para a distancia informada é: " + qtdCombustivel);
	}

}
