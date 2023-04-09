package com.silas.cursodejava.aula32;

public class Carro {
	
	private String marca;
	private String modelo;
	private int numPassageiros; // num maximo de passageiros
	private double capCombustivel; // capacidade maxima do tank de combustivel 
	private double comCombustivel; // comsumo de combustivel por km
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumPassageiros() {
		return numPassageiros;
	}
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	public double getCapCombustivel() {
		return capCombustivel;
	}
	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}
	public double getComCombustivel() {
		return comCombustivel;
	}
	public void setComCombustivel(double comCombustivel) {
		this.comCombustivel = comCombustivel;
	}
	
	

}
	