package com.silas.cursodejava.aula40;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		
		pessoa.setEndereco("Rua 1, num1");
		aluno.setEndereco("Rua 1, num2");
		professor.setEndereco("Rua 1, num3");
		
		/*o metodo obter etiqueta de endereso se torna acessivel no aluno e professor por meio
		 * da herança da classe pessoa*/
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
	}

}
