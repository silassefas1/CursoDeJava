package com.silas.cursodejava.aula16;

public class LoopDoWhile {

	public static void main(String[] args) {
		int i = 0;
		int max = 10;
		
		System.out.println("Contanto até " + max);
		do {
			i++;
			System.out.println("Valor de i "+ i);
		} while (i < 11);
		System.out.println(i);
	}

}
