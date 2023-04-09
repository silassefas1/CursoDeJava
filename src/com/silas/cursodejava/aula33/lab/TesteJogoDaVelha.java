package com.silas.cursodejava.aula33.lab;

import java.util.Scanner;

public class TesteJogoDaVelha {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		JogoDaVelha jogo = new JogoDaVelha();
		int i = 1;
		while(i <= 9) {
			System.out.print("Entre com um valor correspondete a jogada: ");
			jogo.mostrarJogo();
			System.out.println();
			int posicao = scan.nextInt();
			System.out.println("Entre com um simbolo: X(xis) ou O(Ó)");
			String valor = scan.next();
			jogo.jogada(posicao, valor);
						
			System.out.println();
			i++;
		}
		jogo.mostrarJogo();
		scan.close();
	}

}
