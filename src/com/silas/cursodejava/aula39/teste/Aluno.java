package com.silas.cursodejava.aula39.teste;

import com.silas.cursodejava.aula39.Pessoa;

public class Aluno extends Pessoa {
	
	private String curso;
	private String[][] notas;
	
	public void verificarAcesso() {
		
		super.nomeVisibilidade2 = "asdasd";/*pode ser usado aqui 
		por ser publico*/
	}


	public Aluno() {
		super();
		
	}
	
	
	
	public Aluno(String endereco, String telefone, String nome, String curso) {
		super(endereco, telefone, nome); /*Funciona como o this so que fazendo referencia a super class*/
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
	
	
	
}
