package com.silas.cursodejava.aula34.labs;

public class ContadorTest {
	
	public static void imprimirValor() {
		System.out.println(Contador.retornarValor());
	}
	
	public static void main(String[] args) {
		
		imprimirValor();
		Contador.incrementar();
		imprimirValor();
		Contador.zerar();
		imprimirValor();
		
		
		
		
	}
}
