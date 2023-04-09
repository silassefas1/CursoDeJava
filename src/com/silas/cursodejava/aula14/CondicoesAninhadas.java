package com.silas.cursodejava.aula14;

import java.util.Scanner;

public class CondicoesAninhadas {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor do item: ");
		double valor = scan.nextDouble();
		scan.close();
		if (valor <= 10){
			System.out.println("Esta barato, Pode comprar");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Esta bom, mas peça desconto");
		} else if (valor >= 15 && valor <17) {
			System.out.println("Esta caro, pesquise mais");
		} else {
			System.out.println("Esta muito caro");
		}
		
		
	}
}
