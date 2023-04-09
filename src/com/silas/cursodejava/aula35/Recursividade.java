package com.silas.cursodejava.aula35;

public class Recursividade {

	public static int fatorial(int valor) {

		if(valor == 0) {
			return 1;
		}
		return valor * fatorial(valor-1);
		
	}
}
