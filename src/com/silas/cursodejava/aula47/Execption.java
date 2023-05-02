package com.silas.cursodejava.aula47;

public class Execption {

	public static void main(String[] args) {
		
		int[] vetor = new int[4];
		/*
		System.out.println("Inciando o programa "); 
		vetor[4] = 1;
		System.out.println("Essa menssagem nao vai apareceo por causa da exeção");
		*/
		try {
			System.out.println("Inciando o programa "); 
			vetor[4] = 1;
			System.out.println("Essa menssagem nao vai apareceo por causa da exeção");
			
			
		}catch(ArrayIndexOutOfBoundsException exepction) {
			
			System.out.println("Tentou colocar um valor no arrei fora do seu indice");
		}
		
		System.out.println("O programa continuou e esse texto sera impresso");
	}

}
