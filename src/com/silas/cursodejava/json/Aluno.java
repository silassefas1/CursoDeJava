package com.silas.cursodejava.json;

import java.sql.Timestamp;

public class Aluno {
	private String Matricula;
	private String Nome;
	private Timestamp Nascimento;
	private int Idade;
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Timestamp getNascimento() {
		return Nascimento;
	}
	public void setNascimento(Timestamp nascimento) {
		Nascimento = nascimento;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	
	
	
}
