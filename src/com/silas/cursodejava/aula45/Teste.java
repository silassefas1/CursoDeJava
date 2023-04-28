package com.silas.cursodejava.aula45;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		Pessoa alunoPessoa = aluno; // up casting da classe aluno para pessoa
		
		/*outra forma de fazer*/
		
		Pessoa aluno2 = new Aluno();
		Pessoa aluno3 = (Pessoa) new Aluno();
		
		
		
	}

}
