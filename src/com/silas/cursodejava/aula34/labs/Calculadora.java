package com.silas.cursodejava.aula34.labs;

public class Calculadora {
	
	public static double somar(double valor1, double valor2) {
		return valor1+valor2;
		
	}
	public static double subtrair(double valor1, double valor2) {
		return valor1+valor2;
		
	}
	
	public static double multiplicar(double valor1, double valor2) {
		return valor1*valor2;
	}
	
	public static double dividir(double valor1, double valor2) {
		return valor1/valor2;
	}
	public static double potencia(double valor1,double potencia ) {
		return Math.pow(valor1, potencia);
	}
	
	public static int fatorial(int valor) {
		int resultado = 1;
		while (valor >0) {
			resultado = resultado*valor;
			
			valor--;
		}
		return resultado;
	}

}
