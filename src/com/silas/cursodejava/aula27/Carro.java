package com.silas.cursodejava.aula27;

public class Carro {

		String marca;
		String modelo;
		int numPessoas;
		double capCombustivel;
		double comCombustivel;
		
		
		void AutonomiaCombustivel() {
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
