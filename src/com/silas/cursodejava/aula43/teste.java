package com.silas.cursodejava.aula43;

public class teste {
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciencias da Computação S2");
		double[] notas = {10,9,8,7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		/*methodo equal*/
		String s1 = "afdsafds";
		String s2 = "afdsafds";
		
		System.out.println(s1.equals(s2));
		
		Aluno aluno2 = new Aluno();
		aluno2.setCurso("Ciencias da Computação S2");
		double[] notas2 = {10,8,8,7};
		aluno.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
		
		
		
	}
}
