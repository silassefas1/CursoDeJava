package com.silas.cursodejava.aula34.labs;

public class Contador {
	
	private static int contador;
	
	public static void incrementar() {
		contador++;
	}
	public static void zerar() {
		contador = 0;
	}
	public static int retornarValor() {
		return contador;
	}
}
