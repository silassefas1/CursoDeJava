package com.silas.cursodejava.aula35.lab;

public class Fibonaci {
	static int  primeiro = 1;
	static int segundo = 1;
	
	public static int fibonacci(int termo) {
		
		if(termo <2) {
			return 1;
		}
		
		return fibonacci(termo-1)+fibonacci(termo-2);
		
		
	}
}
