package com.silas.cursodejava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre Com o Numero de Pessoa Que Seram Intrevistadas: ");
		
		int numeroIntrevistados = scan.nextInt();
		
		String[][] nomesFilhos = new String[numeroIntrevistados][];
		
		for(int i=0; i<nomesFilhos.length; i++) {
			
			System.out.println("Entre Com a Quantidade de Filhos: ");
			int qtdFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[qtdFilhos];
			
			for(int j=0; j<nomesFilhos[i][j].length(); j++) {
				
				System.out.println("Digite o Nome do Filho: "+ j+1);
				nomesFilhos[i][j] = scan.next();
				
			}
			
		}
		for(int i=0; i<nomesFilhos.length; i++) {
			System.out.println("Pessoa " +i+"tem"+ nomesFilhos[i].length + "Filhos");
			for(int j=0; j<nomesFilhos[i][j].length(); j++){
				System.out.println(nomesFilhos[i][j]);
				
			}
		}
			
		
		
		
		
		scan.close();
	}

}
