package com.silas.cursodejava.aula34.labs;

public class CalculadoraTest {
	
	public static void imprimirValor(double valor) {
		System.out.println(valor);
	}
	
	public static void main(String[] args) {
		imprimirValor(Calculadora.potencia(27, 30));
		imprimirValor(Calculadora.multiplicar(9, 1540));
		imprimirValor(Calculadora.somar(1575, 425));
		imprimirValor(Calculadora.subtrair(7982, 2982));
		imprimirValor(Calculadora.dividir(259, 3));
		
		imprimirValor(Calculadora.fatorial(5));
		
	}

}
