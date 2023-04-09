package com.silas.cursodejava.aula35.lab;

public class SomadorDeN {

	public static int somarN(int numero) {
		
	
		if(numero == 0) {
			return 0;
		}
		
		return numero + somarN(numero-1);
		
	}

}
