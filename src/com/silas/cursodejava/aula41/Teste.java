package com.silas.cursodejava.aula41;


public class Teste {

	public static void main(String[] args) {
		//Pessoa pessoa = new Pessoa();
		/*quando a balavra abstract esta na classe mae ela nao 
		 * pode ser instanciada somente as classes filhas podem ser instanciadas*/
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		
		//pessoa.setEndereco("Rua 1, num1");
		aluno.setEndereco("Rua 1, num2");
		professor.setEndereco("Rua 1, num3");
		
		//System.out.println(pessoa.obterEtiquetaEndereco());
		//System.out.println(aluno.obterEtiquetaEndereco());
		//System.out.println(professor.obterEtiquetaEndereco());
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
	}

}
