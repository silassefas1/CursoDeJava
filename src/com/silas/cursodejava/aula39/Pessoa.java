package com.silas.cursodejava.aula39;

public class Pessoa {
	private String endereco;
	private String telefone;
	private String cpf;
	private String nome;
	
	String nomeVisibilidade;
	public String nomeVisibilidade2;/*é visivel em qualquer pacote*/
	
	
	public Pessoa(String endereco, String telefone, String nome) {
		super();
		this.endereco = endereco;
		this.telefone = telefone;
		this.nome = nome;
	}
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


}
