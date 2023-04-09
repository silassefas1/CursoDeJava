package com.silas.cursodejava.aula33.lab;

public class JogoDaVelha {
	String[][] Jogo = new String[3][3];

	
	public void mostrarJogo() {
		int posicao = 1;
		for(int j=0; j< Jogo.length;j++) {
			System.out.println();
			for(int k=0; k< Jogo[j].length;k++) {
				if(Jogo[j][k] == null) {
					System.out.print(posicao);
				}else {
					System.out.print(Jogo[j][k]);
				}posicao++;
				
				if(k <2) {
					System.out.print("|");
				}
			}
			
		}
		
		
	}
	
	public void jogada(int posicao, String valor) {
		
		switch(posicao) {
		case 1: Jogo[0][0] = valor;break;
		case 2: Jogo[0][1] = valor;break;
		case 3: Jogo[0][2] = valor;break;
		case 4: Jogo[1][0] = valor;break;
		case 5: Jogo[1][1] = valor;break;
		case 6: Jogo[1][2] = valor;break;
		case 7: Jogo[2][0] = valor;break;
		case 8: Jogo[2][1] = valor;break;
		case 9: Jogo[2][2] = valor;break;
		
		
		}
		
	}

	
}

