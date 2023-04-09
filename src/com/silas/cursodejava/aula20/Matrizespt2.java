package com.silas.cursodejava.aula20;

public class Matrizespt2 {

	public static void main(String[] args) {
		
		int[][][] matrizTridimensional = new int[3][3][3];
		
		for(int i=0; i<matrizTridimensional.length;i++) {
			for(int j=0;j<matrizTridimensional[i].length;j++) {
				for(int k=0;k<matrizTridimensional[j].length;k++) {
					matrizTridimensional[i][j][k] = i+j+k;
					
					
				}
				
			}
			
		}
		int soma = 0;
		int somaPar = 0;
		int somaImpares = 0;
		for(int i=0; i<matrizTridimensional.length;i++) {
			for(int j=0;j<matrizTridimensional[i].length;j++) {
				for(int k=0;k<matrizTridimensional[j].length;k++) {
					soma += matrizTridimensional[i][j][k];
					
					if (matrizTridimensional[i][j][k] %2 == 0) {
						somaPar += matrizTridimensional[i][j][k];
						
					}else {
						somaImpares += matrizTridimensional[i][j][k];
					}
					
				}
				
			}
			
		}
		System.out.println("Soma Total = " + soma);
		System.out.println("Soma dos Pares = " + somaPar);
		System.out.println("Soma dos Impares = " + somaImpares);
	}

}
