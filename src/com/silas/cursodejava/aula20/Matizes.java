package com.silas.cursodejava.aula20;


public class Matizes {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double [3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 7;
		notasAlunos[2][3] = 10;
		
			
	/*	for (int i = 0; i<notasAlunos.length;i++) {
			for(int j = 0;j<notasAlunos[i].length;j++){
				System.out.print(notasAlunos[i][j]+" ");
			}
			System.out.println();
		}
		notasAlunos[1][3] = 8;
		System.out.println();
		for (int i = 0; i<notasAlunos.length;i++) {
			for(int j = 0;j<notasAlunos[i].length;j++){
				System.out.print(notasAlunos[i][j]+" ");
			}
			System.out.println();
		}*/
		System.out.println("Calculando a Media de Cada Aluno");
		
		double soma;
		
		for(int i= 0; i<notasAlunos.length;i++) {
			soma = 0;
			for(int j =0;j<notasAlunos[i].length;j++) {
				soma += notasAlunos[i][j];
				
			}
			
			System.out.println("Media do aluno "+i+" e = "+(soma/4));
			
		}
	}

}
