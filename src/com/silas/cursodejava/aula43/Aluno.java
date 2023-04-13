package com.silas.cursodejava.aula43;

public class Aluno  {
	
	private String curso;
	private String[][] notas;


	public Aluno() {
		super();
		
	}
	
	
	
	public Aluno(String endereco, String telefone, String nome, String curso) {
		//super(endereco, telefone, nome); /*Funciona como o this so que fazendo referencia a super class*/
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[][] getNotas() {
		return notas;
	}
	public void setNotas(String[][] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		
		return 0;
	}
	
	public boolean verificarAprovado() {
		
		return true;
	}
	public String obterEtiquetaEndereco() {
		/*o metodo herdado foi reescrito na crase filho*/
		
		String s= "Endereço do Aluno: ";
		//s += super.getEndereco();
		
		return s;
	}



	/*@Override
	public void imprimirEtiquetaEndereco() {
		
		System.out.println(this.obterEtiquetaEndereco());
		
	}*/
	
	
	
}
