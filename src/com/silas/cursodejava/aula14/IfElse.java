package com.silas.cursodejava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		scan.close();
		int idade = scan.nextInt();
		
		if (idade > 18) {
			System.out.println("Parabens você e maior de idade");
		} else {
			
			System.out.println("Voce ainda é menor de idade");
		}
	}

}
